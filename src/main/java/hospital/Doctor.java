package hospital;

public class Doctor extends Employee implements MedicalDuties {

	public Doctor(String empNumber, String empName) {
		this.empNumber = empNumber;
		this.empName = empName;
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

}
