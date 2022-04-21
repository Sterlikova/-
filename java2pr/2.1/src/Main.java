//ќпределить одномерный массив и заполнить его случайными значени€ми:определить дополнительный массив 
//разрешенных значений.ќпределить и вывести на экран, сколько элементов исходного массива имеют разрешенные значени€
public class Main {
	public static void main(String[] args) {
        int n=1000;
        int []acceptableArray=new int[]{1,3,5};
        int [] array=new int[n];
        int countAcceptable=0;
        for (int i=0;i<array.length;i++) {
            array[i]= (int) (Math.random()*100);
          
        }

        for (int i=0;i<array.length;i++){
            for(int j=0;j<acceptableArray.length;j++){
                if (array[i]==acceptableArray[j]){
                    countAcceptable++;
                    break;
                }
            }
        }
        System.out.println(countAcceptable);



    }

}
