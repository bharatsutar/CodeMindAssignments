package hierarchicalInheritance;

public class Car extends Vehical{
	
	private String cName;

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Car [cName=" + cName + ","+super.toString()+"]";
	}
	
	

}
