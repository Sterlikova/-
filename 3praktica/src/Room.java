//Bap�a�� 4). �oc�����a
//Room � �o��a�a:
//C�o�c��a:
//Id � ��e������a�op;
//codeNumbers � Ko� �o�epa;
//numberPeople � Ko���ec��o �e�o�e�;
//comfortType � Ko��op��oc��;
//price � �e�a.
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
        return "�������������-"+Id+"\n"+"��� ������-"+codeNumber+"\n"+"���������� �������-"+numberPeople+"\n"+"������������-"+comfortType+"/5"+"\n"+"����-"+price+"���."+"\n";
    }
}
