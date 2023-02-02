package Inheritance;

public class CollegeTest {
	
	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		s1.setId(12);
		s1.setName("bharat");
		s1.setStream("computer");
		s1.setYear(2021);
		s1.setPercentage(70.56F);
		
		System.out.println(s1);
		
		Student2 s2 = new Student2();
		s2.setId(15);
		s2.setName("sachin");
		s2.setStream("machanical");
		s2.setYear(2021);
		s2.setPercentage(80.56F);
		
		System.out.println(s2);
		
	}
	

}
