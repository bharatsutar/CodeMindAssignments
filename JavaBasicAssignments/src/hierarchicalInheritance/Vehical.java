package hierarchicalInheritance;

public class Vehical {
	
	private String vColor;
	private int vId;
	public String getvColor() {
		return vColor;
	}
	public void setvColor(String vColor) {
		this.vColor = vColor;
	}
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	@Override
	public String toString() {
		return "Vehical [vColor=" + vColor + ", vId=" + vId + "]";
	}
	
	

}
