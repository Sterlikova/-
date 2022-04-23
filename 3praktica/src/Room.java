//Bapиaнт 4). √ocтиницa
//Room Ц кoмнaтa:
//Cвoйcтвa:
//Id Ц идeнтификaтop;
//codeNumbers Ц Koд нoмepa;
//numberPeople Ц Koличecтвo чeлoвeк;
//comfortType Ц Koмфopтнocть;
//price Ц цeнa.
public class Room {
	private int Id;
    private int codeNumber;
    private int numberPeople;
    private int comfortType;
    private int price;
    public Room(int Id, int codeNumber, int numberPeople, int comfortType, int price){
        this.Id=Id;
        this.codeNumber=codeNumber;
        this.numberPeople=numberPeople;
        this.comfortType=comfortType;
        this.price=price;
    }
    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id=Id;
    }
    public int getCodeNumber(){
        return codeNumber;
    }
    public void setCodeNumber(int codeNumber){
        this.codeNumber=codeNumber;
    }
    public int getNumberPeople(){
        return numberPeople;
    }
    public void setNumberPeople(int numberPeople){
        this.numberPeople=numberPeople;
    }
    public int getComfortType(){
        return comfortType;
    }
    public void setComfortType(int comfortType){
        this.comfortType=comfortType;
    }
    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString(){
        return "идентификатор-"+Id+"\n"+"код номера-"+codeNumber+"\n"+"количество человек-"+numberPeople+"\n"+"комфортность-"+comfortType+"/5"+"\n"+"цена-"+price+"руб."+"\n";
    }
}
