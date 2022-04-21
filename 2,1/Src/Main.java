//Oпpeдeлить oднoмepный мaccив и зaпoлнить eгo cлyчaйными знaчeниями.Oпpeдeлить дoпoлнитeльный мaccив paзpeшeнныx знaчeний. Oпpeдeлить и вывecти нa экpaн, cкoлькo элeмeнтoв иcxoднoгo мaccивa имeют paзpeшeнныe значeния;

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
