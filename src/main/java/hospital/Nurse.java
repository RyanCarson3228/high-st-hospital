package hospital;

import java.util.ArrayList;

public class Nurse extends Employee implements MedicalDuties {

	ArrayList<Integer> patients = new ArrayList<Integer>();

	public void addPatient(Integer thePatient) {
		patients.add(thePatient);

	}

	public int getSalary() {
		return 50000;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hospital.MedicalDuties#drawBlood(hospital.Bleedable)
	 */
	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hospital.MedicalDuties#administerCare(hospital.Patient)
	 */
	@Override
	public void administerCare(Patient patient) {
		patient.giveHealth(5);
	}

}
