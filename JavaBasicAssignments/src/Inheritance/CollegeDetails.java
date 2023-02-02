package Inheritance;

public class CollegeDetails {
	
	private String name;
	private int id;
	private int year;
	private String stream;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "CollegeDetails [name=" + name + ", id=" + id + ", year=" + year + ", stream=" + stream + "]";
	}
	
	

}
