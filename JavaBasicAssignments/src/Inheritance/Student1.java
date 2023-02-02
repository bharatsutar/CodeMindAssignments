package Inheritance;

public class Student1 extends CollegeDetails{

	private float percentage;

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student1 [percentage=" + percentage + ","+super.toString() +"]";
	}
	
	
}
