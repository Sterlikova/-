//O�pe�e���� o��o�ep��� �acc�� � �a�o����� e�o c�y�a����� s�a�e�����.O�pe�e���� �o�o����e����� �acc�� pa�pe�e���x s�a�e���. O�pe�e���� � ���ec�� �a ��pa�, c�o���o ��e�e��o� �cxo��o�o �acc��a ��e�� pa�pe�e���e ����e���;

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
