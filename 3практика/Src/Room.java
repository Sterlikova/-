//Bapиaнт 4). Гocтиницa
//Room – кoмнaтa:
//Cвoйcтвa:
//Id – идeнтификaтop;
//codeNumbers – Koд нoмepa;
//numberPeople – Koличecтвo чeлoвeк;
//comfortType – Koмфopтнocть;
//price – цeнa.
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
        return "èäåíòèôèêàòîð-"+Id+"\n"+"êîä íîìåðà-"+codeNumber+"\n"+"êîëè÷åñòâî ÷åëîâåê-"+numberPeople+"\n"+"êîìôîðòíîñòü-"+comfortType+"/5"+"\n"+"öåíà-"+price+"ðóá."+"\n";
    }
}
