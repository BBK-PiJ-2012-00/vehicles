/**
 * 
 */
package vehicles;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ataylo20
 *
 */
public class AirplaneTest {

	@Test
	public void test() {
		
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		
		Flying fly = new FFJ();
		
		Airplane classUnderTest = new Airplane(1, fly);
		
		stringReturned = classUnderTest.howDoYouFly();
		
		assertEquals("Wrong answer!", stringReturned, expectedOutput);
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		String expectedOutput = "Vertically";
		String stringReturned = null;
		
		Airplane classUnderTest = new Airplane(1);
		
		stringReturned = classUnderTest.howDoYouLiftOff();
		
		assertEquals("Wrong answer!", stringReturned, expectedOutput);
		
	}
	
	@Test
	public void test3() {
		
		String expectedOutput = "I don't fly";
		String stringReturned = null;
		
		Flying fly = new ModelAirPlane();
		
		Airplane classUnderTest = new Airplane(1, fly);
		
		stringReturned = classUnderTest.howDoYouFly();
		
		assertEquals("Wrong Answer!", stringReturned, expectedOutput);		
		
	}
	
	@Test
	public void test4() {
		
		String expectedOutput = "I fly like a harrier";
		String stringReturned = null;
		
		Flying fly = new Harrier();
		
		Airplane classUnderTest = new Airplane(1, fly);		
		
		stringReturned = classUnderTest.howDoYouFly();
		
		assertEquals("Wrong Anser!", stringReturned, expectedOutput);
	}
	
	@Test
	public void test5() {
		
		String expectedOutput = "Vertically";
		String stringReturned = null;
		
		Flying fly = new Harrier();
		
		Airplane classUnderTest = new Airplane(1, fly);
		
		stringReturned = classUnderTest.howDoYouLiftOff();
		
		assertEquals("Wrong Answer!", stringReturned, expectedOutput);
	}

}
