package logos.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		Robot r = new Robot();
		CoffeRobot cf = new CoffeRobot();
		RobotDancer rd = new RobotDancer();
		RobotCoocer rc = new RobotCoocer();
		System.out.println(r.work());
		System.out.println(cf.work());
		System.out.println(rd.work());
		System.out.println(rc.work());
		
		Robot mass[] = {new Robot(),new CoffeRobot(), new RobotDancer(),new RobotCoocer()};
		for (int i=0;i<=3;i++) {
			
			System.out.println(mass[i].work());
			
		}
	}

}
