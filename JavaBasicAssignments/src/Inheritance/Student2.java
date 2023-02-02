package Inheritance;

public class Student2 extends CollegeDetails{
	
	private float percentage;
	
	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student2 [percentage=" + percentage + ","+super.toString() +"]";
	}

	
	
}
