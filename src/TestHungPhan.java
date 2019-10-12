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
		assertEquals("Hung", hp.getFirstName(), "hp.getFirstName() should return Hung.");
	}
	
	@Test
	public void testGetLastName() {
		assertEquals("Phan", hp.getLastName(), "hp.getLastName() should return Phan.");
	}
	
	@Test
	public void testGetUCInetID() {
		assertEquals("hpphan", hp.getUCInetID(), "hp.getUCInetID() should return hpphan.");
	}
	
	@Test
	public void testGetStudentNumber() {
		assertEquals(20243133, hp.getStudentNumber(), "hp.getStudentNumber() should return 20243133.");
	}
	
	@Test
	public void testGetRotatedFullNamePositiveShift() {
		assertEquals("ng PhanHu", hp.getRotatedFullName(2), "hp.getRotatedFullName(2) should return ng Phan.");
	}
	
	@Test 
	public void testGetRotatedFullNameNegativeShift() {
		assertEquals("PhanHung ", hp.getRotatedFullName(-4), "hp.getRotatedFullName(-4) should return PhanHung .");
	}
	
	@Test 
	public void testGetRotatedFullNameOtherShift() {
		assertEquals("Shift value is out of bound", hp.getRotatedFullName(10), "hp.getRotatedFullName(10) should return Shift value is out of bound.");
		assertEquals("Shift value is out of bound", hp.getRotatedFullName(-10), "hp.getRotatedFullName(-10) should return Shift value is out of bound.");
		assertEquals("Hung Phan", hp.getRotatedFullName(0), "hp.getRotatedFullName(0) should return Hung Phan.");
	}
	

}
