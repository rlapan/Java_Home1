package HW4;

public class Marker {

	private String name;
	private double location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLocation() {
		return location;
	}

	public void setLocation(double location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		
		
		// TODO Auto-generated method stub
		return "Marker [name ="+ name+", location="+location+"]\n";
	}
	

}
