package hospital;

public class Doctor extends Employee implements MedicalDuties {

	private String specialty;

	public Doctor(String empNumber, String empName, String specialty) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.specialty = specialty;
	}

	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}

	@Override
	public void administerCare(Patient patient) {
		patient.giveHealth(10);
	}

	@Override
	public int getSalary() {
		return 90000;
	}

	public String getSpecialty() {
		return specialty;
	}

}
