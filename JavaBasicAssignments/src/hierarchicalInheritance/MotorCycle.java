package hierarchicalInheritance;

public class MotorCycle extends Vehical{
	
	private String mName;

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	@Override
	public String toString() {
		return "MotorCycle [mName=" + mName + ","+super.toString()+"]";
	}
	
	

}
