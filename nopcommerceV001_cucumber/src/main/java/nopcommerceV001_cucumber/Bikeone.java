package nopcommerceV001_cucumber;

public class Bikeone {
	String bikeName;
	String bikeColor;
	int price;
	


public void bikeDetails(String bikeName, String bikeColor, int price)
{
   this.bikeName = bikeName;
   this.bikeColor = bikeColor;
   this.price = price;
   System.out.println(this.bikeName);
   System.out.println(this.bikeColor);
   System.out.println(this.price);
	
}

public static void main(String[] a)
{
	Bikeone B1 = new Bikeone();
	Bikeone B2 = new Bikeone();
	
	B1.bikeDetails("Scooty", "Black", 5000);
	B2.bikeDetails("Efield", "White", 7000);
	B1.bikeDetails("Scooty", "Black", 5000);
}


}
