package Encapsulation;

public class Voter {

	private String name;
	private String email;
	private int age;
	private String mNum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getmNum() {
		return mNum;
	}

	public void setmNum(String mNum) {
		this.mNum = mNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age > 18) {
			this.age = age;
		} else {
			System.out.println("you are not eligible for voting "+age);
		}
	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", email=" + email + ", age=" + age + ", mNum=" + mNum + "]";
	}

}
