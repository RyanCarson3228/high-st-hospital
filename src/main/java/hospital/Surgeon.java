package hospital;

public class Surgeon extends Doctor {

	private boolean isOperating;

	public Surgeon(String empNumber, String empName, boolean isOperating) {
		super(empNumber, empName, "Brain");
		this.isOperating = isOperating;
	}

	public boolean getIsOperating() {
		return isOperating;
		
	}
	
	
}
