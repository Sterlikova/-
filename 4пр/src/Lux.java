
public class Lux extends Polulix{
	private String min;
	private String max;

	public Lux(int Id, int nomer,int kolvochelovek,int price,String stand,String min,String max) {
        super(Id, nomer, kolvochelovek, price,min,max);
        	
   this.min=min;
   this.max=max;}
   
		
	

	public String getmin() {
		return min;
}

	public String getmax() {
		return max;
}
	 public void setmin(String min) {
	        this.min = min;
	}
	 public void setmax(String max) {
	        this.max = max;
}
	 
@Override
public String toString() {
    return "номер " + getnomer() +
            '\n' +"Минимальный срок сдачи-"+min+'\n'+"Максимальный срок сдачи-"+max+'\n';
    }// в условии выводим номер комнаты и её вид
}