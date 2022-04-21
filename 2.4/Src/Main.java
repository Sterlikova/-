//Дан двумерный массив А, размером (n*n).Найти произведение минимального и максимального элементов её главной диагонали.
//Затем умножить побочную диагональ на максимальные элемент главной диагонали
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
        int n=5;
        int matrix[][]=new int [n][n];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=(int) (Math.random()*100);
            }
        }
        printMatrix(matrix);
        System.out.println();
        int min=matrix[0][0];
        int max=matrix[0][0];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==j){
                    if (matrix[i][j]>max) max=matrix[i][j];
                    if (matrix[i][j]<min) min=matrix[i][j];
                }
            }
        }
        int product=max*min;
        System.out.println(min);
        System.out.println(max);
        System.out.println(product);
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if (n-1-i==j) matrix[i][j]*=max;
            }
        }
        printMatrix(matrix);
    }

}
