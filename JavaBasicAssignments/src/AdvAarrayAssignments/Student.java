package AdvAarrayAssignments;


public class Student {
	
	int id;
	String name;
	
	Student[] setData() {
		Student[] sarray = new Student[5]; 
		
		Student s1 = new Student();
		s1.id=1;
		s1.name="bharat";
		
		Student s2 = new Student();
		s2.id=1;
		s2.name="bharat";
		
		sarray[0] = s1;
		sarray[1] = s2;
		
		return sarray; 
	}
	void iterateArray(Student[] array) {
		
		for (Student student : array) {
			
			if(student != null) {
				System.out.println(student.id);
				System.out.println(student.name);
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		Student[] sarray = obj.setData();
		obj.iterateArray(sarray);
	}
}
