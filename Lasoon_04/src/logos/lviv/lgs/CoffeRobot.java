package logos.lviv.lgs;

public class CoffeRobot extends Robot{
	
	public String text;
	
	public CoffeRobot() {
		
		text = "Я CoffeRobot, я просто варю каву";
	}

	@Override
	public String toString() {
		return text;
	}
	
	
}
