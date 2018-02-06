package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PatientTest {
	
	@Test
	public void shouldBeAbleToRemoveBlood() {
		Patient patient = new Patient();
		
		patient.removeBlood(3);
		
		int currentBloods = patient.getBloods();
		
		assertThat(currentBloods, is(39));
	}
	
	@Test
	public void shouldBeAbleToAddHealth() {
		Patient patient = new Patient();
		
		patient.giveHealth(10);
		
		int currentHealth = patient.getHealth();
		
		assertThat(Patient.DEFAULT_HEALTH + 10, is (currentHealth));
	}
	
}
