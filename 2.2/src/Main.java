//Дан массив b(n). Переписать в массив С(n) отрицательные элементы массива b(n) умноженные на 4. 
//Затем упорядочнить методом "выбора и перестановки" по возрастанию новый массив 
public class Main {
	private static int[] sortVector(int[] vector)
    {
        boolean flag;
        int temp;
        do {
            flag = false;
            for (int i = 0; i < vector.length-1 ; i++) {
                if (vector[i] > vector[i+1])
                {
                    temp = vector[i];
                    vector[i] = vector[i+1];
                    vector[i+1] = temp;
                    flag = true;
                }
            }
        } while (flag);
        return vector;
    }
    private   static  void printArray(int[]array){
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int n=10;

        int [] b=new int[n];
        int countNegative=0;
        for (int i=0;i<b.length;i++) {
            b[i]= (int) (50-Math.random()*100);
        }
        for (int i=0;i<b.length;i++){
            if (b[i]<0) countNegative++;
        }
        int []c=new int[countNegative];

        for (int i=0,j=0;i<b.length;i++){
            if (b[i]<0) {
                c[j]=b[i]*4;
                j++;
            }
        }
        c=sortVector(c);

    }

}
