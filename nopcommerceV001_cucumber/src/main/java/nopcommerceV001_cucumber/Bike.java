package nopcommerceV001_cucumber;

public class Bike {
	
	String scooterName;
	String color;
	int price;
	
	
	
	public Bike(String scooterName,String color,int price)
	{
	
		this.scooterName = scooterName;
		this.color = color;
		this.price = price;
	}
	
	public String getName()
	{
		return scooterName;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public static void main(String[] a)
	{
	
		Bike m1 = new Bike("scooty","yellow",35000);
		Bike m2 = new Bike("Enfield","Black",150000);
		
		m1.getName();
		m1.getColor();
		m1.getPrice();
		m2.getName();
		m2.getColor();
		m2.getPrice();
		
		System.out.println(m1.getName());
		System.out.println(m1.getColor());
		System.out.println(m1.getPrice());
		
		
	}
	
}
