package hospital;


import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SurgeonTest {
	
	private Surgeon underTest;
	
	@Before
	public void setup() {
		underTest = new Surgeon("2222", "Harry", true);
	}
	
	@Test
	public void shouldReturnTrue() {		
		boolean check = underTest.getIsOperating();
		assertTrue(check);
//		assertThat(check, is(true));
	}


}
