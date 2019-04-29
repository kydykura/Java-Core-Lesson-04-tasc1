package logos.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		Robot r = new Robot();
		CoffeRobot cf = new CoffeRobot();
		RobotDancer rd = new RobotDancer();
		RobotCoocer rc = new RobotCoocer();
		System.out.println(r.work(r));
		System.out.println(r.work(cf));
		System.out.println(r.work(rd));
		System.out.println(r.work(rc));
		
		Object mass[] = {r,cf,rd,rc};
		for (int i=0;i<=3;i++) {
			
			System.out.println(r.work(mass[i]));
			
		}
	}

}
