import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestHungPhan {
	
	HungPhan hp;
	
    @BeforeEach
    public void beforeFunction(){
    	hp = new HungPhan();
    }
	
	@Test
	public void testGetFullName() {
		
		assertEquals("Hung Phan", hp.getFullName(), "getFullName() should return Hung Phan.");
	}
	
	@Test
	public void testGetFirstName() {
		assertEquals("Hung", hp.getFirstName(), "getFirstName() should return Hung.");
	}
	
	@Test
	public void testGetLastName() {
		assertEquals("Phan", hp.getLastName(), "getLastName() should return Phan.");
	}
	
	@Test
	public void testGetUCInetID() {
		assertEquals("20243133", hp.getUCInetID(), "getUCInetID() should return 20243133.");
	}
	
	@Test
	public void testGetStudentNumber() {
		assertEquals(20243133, hp.getStudentNumber(), "getStudentNumber() should return 20243133.");
	}
	
	@Test
	public void testGetRotatedFullNamePositiveShift() {
		assertEquals("ng PhanHu", hp.getRotatedFullName(2), "getRotatedFullName() should return ng Phan.");
	}
	
	@Test 
	public void testGetRotatedFullNameNegativeShift() {
		assertEquals("PhanHung ", hp.getRotatedFullName(-4), "getRotatedFullName() should return PhanHung .");
	}
	
	@Test 
	public void testGetRotatedFullNameOtherShift() {
		assertEquals("Shift value is out of bound", hp.getRotatedFullName(10), "getRotatedFullName() should return Shift value is out of bound.");
		assertEquals("Shift value is out of bound", hp.getRotatedFullName(-10), "getRotatedFullName() should return Shift value is out of bound.");
		assertEquals("Hung Phan", hp.getRotatedFullName(0), "getRotatedFullName() should return Hung Phan.");
	}
	

}
