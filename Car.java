package week1.day2;

public class Car {
	
	public void applyBreak()
	{
		System.out.println("apply break");
	}
	public void applyGear()
	{
		System.out.println("apply gear");
	}	
	public void switchOnAc()
	{
		System.out.println("switchOnAc");
	}
	public void applyAcclerate()
	{
		System.out.println("applyAcclerate");
	}
public static void main(String[] args) {
	Car benz=new Car();
	benz.applyBreak();
	benz.applyGear();
	benz.switchOnAc();
	benz.applyAcclerate();
	
		
	}

}
