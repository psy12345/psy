import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CellTest {
private static Cell cell=new Cell();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testSetRow() {
		cell.setRow(5);
		assertEquals(5,cell.getRow());
	}

	@Test
	public void testSetCol() {
		cell.setCol(6);
		assertEquals(6,cell.getCol());
	}

}
