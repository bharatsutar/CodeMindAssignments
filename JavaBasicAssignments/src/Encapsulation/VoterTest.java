package Encapsulation;

public class VoterTest {
	
	public static void main(String[] args) {
		
		Voter v1 = new Voter();
		v1.setName("bharat");
		v1.setEmail("bharat@gmail.com");
		v1.setmNum("9158364285");
		v1.setAge(20);
		
		Voter v2 = new Voter();
		v2.setName("vishal");
		v2.setEmail("vishalt@gmail.com");
		v2.setmNum("9158364285");
		v2.setAge(12);
		
		Voter[] va = new Voter[2];
		va[0] = v1;
		va[1] = v2;
		
		for (Voter voter : va) {
			System.out.println(voter);
		}
		
		
	}

}
