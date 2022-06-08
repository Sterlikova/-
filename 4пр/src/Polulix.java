
public class Polulix extends Standart{
	private String polu;

	public Polulix(int Id, int nomer,int kolvochelovek,int price,String stand, String polu) {
        super(Id, nomer, kolvochelovek, price, polu);
        	
   this.polu=polu;}
   
	public String getpolu() {
		return polu;
		
}
	 public void setpolu(String polu) {
	        this.polu = polu;}
}// тк в условии выводим номер комнаты и её вид(люкс), то вид полулюксовой комнаты не выводим
