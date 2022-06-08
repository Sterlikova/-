
public class Standart extends Rooms {
	private String stand;

	public Standart(int Id, int nomer,int kolvochelovek,int price, String stand) {
        super(Id, nomer, kolvochelovek, price);
        	
   this.stand=stand;}
   
	public String getstandart() {
		return stand;
		
	}
	 public void setstand(String stand) {
	        this.stand = stand;}}
// тк в условии выводим номер комнаты и её вид(люкс), то вид стандарной комнаты не выводим
    
    
