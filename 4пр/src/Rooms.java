
public class Rooms {
private int Id;
private int nomer;
private int kolvochelovek;
private int price;
public Rooms(int Id, int nomer, int kolvochelovek,int price) {
	this.Id=Id;
	this.nomer=nomer;
	this.kolvochelovek=kolvochelovek;
	this.price=price;
	
}
public int getId() {
	return Id;
}
public int getnomer() {
	return nomer;
}
public int getkolvochelovek() {
	return kolvochelovek;
}
public int getprice() {
	return price;
}
public void setId(int Id) {
    this.Id = Id;
}

public void setnomer(int nomer) {
    this.nomer = nomer;
}
public void setkolvochelovek(int kolvochelovek) {
    this.kolvochelovek = kolvochelovek;
}

public void setprice(int price) {
    this.price = price;
}
public String toString() {
    return "Индефикатор" + Id + "\n" + " Номер:"
            + nomer + "\n" + " Количество человек:" + kolvochelovek + " Цена:" + price + "\n" ;
}

}
