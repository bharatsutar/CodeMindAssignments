package hierarchicalInheritance;

public class HierarchicalTest {
	
	public static void main(String[] args) {
		
		MotorCycle m = new MotorCycle();
		m.setmName("Honda Unicorn");
		m.setvColor("black");
		m.setvId(10);
		
		System.out.println(m);
		
		Car c = new Car();
		c.setcName("Kia Celtos");
		c.setvColor("white");
		c.setvId(12);
		
		System.out.println(c);
	}

}
