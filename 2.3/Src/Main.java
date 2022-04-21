//Определить матрицу и заполнить её случайными значениями: максимальное значение в i-столбце
public class Main {
	private   static  void printMatrix(int[][]matrix){
        for (int i=0;i<matrix[0].length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    private  static  void  printArray(int[]array){
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int n=10;
        int matrix[][]=new int [n][n];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=(int) (Math.random()*100);
            }
        }
        printMatrix(matrix);
        int []b=new int[n];
        for (int j = 0; j < n; j++) {
            int min=matrix[0][j];
            for (int i=1;i<n;i++) {

                if (matrix[i][j]>min) min=matrix[i][j];
            }
            b[j]=min;
        }
        printArray(b);
    }

}
