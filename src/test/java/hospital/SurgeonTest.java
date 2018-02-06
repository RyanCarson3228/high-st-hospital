package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class SurgeonTest {
	
	private Surgeon underTest;
	
	@Before
	public void setup() {
		underTest = new Surgeon("", "", false);
	}
	
	@Test
	public void shouldReturnTrue() {
		Surgeon underTest = new Surgeon("2222", "Harry", true);
		
		boolean check = underTest.getIsOperating();
		
		assertThat(check, is(true));
	}

}
