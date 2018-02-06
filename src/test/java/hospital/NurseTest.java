package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

//import hospital.DoctorTest.BleedableDouble;

public class NurseTest {

	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Nurse();

		int salary = underTest.getSalary();

		assertThat(salary, is(50000));
	}

	// @Test
	// public void shouldTakeCareOfThreePatients() {
	// Nurse underTest = new Nurse();
	// }

	@Test
	public void shouldDrawBlood() {
		MedicalDuties underTest = new Nurse();
		Patient patient = new Patient();

		int bloodsBefore = patient.getBloods();

		underTest.drawBlood(patient);

		int bloodsAfter = patient.getBloods();
		assertThat(bloodsBefore - bloodsAfter, is(1));
	}

	boolean wasBled = false;

	public class BleedableDouble implements Bleedable {
		@Override
		public void removeBlood(int amount) {
			wasBled = true;
		}
	}

	@Test
	public void shoudlDrawBloodFromDouble() {
		MedicalDuties underTest = new Nurse();
		Bleedable patient = new BleedableDouble();

		underTest.drawBlood(patient);

		assertThat(wasBled, is(true));
	}

	@Test
	public void shouldIncreasePatientHealth() {
		MedicalDuties underTest = new Nurse();
		Patient patient = new Patient();

		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();
		assertThat(healthAfter - healthBefore, is(5));
	}

}
