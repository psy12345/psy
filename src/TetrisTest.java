import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TetrisTest {
private Tetris a=new Tetris();
private Tetromino currentOne=Tetromino.randomOne();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testIsGameOver() {
		for(int i=0;i<20;i++) {
			for(int j=0;j<10;j++) {
			a.wall[i][j]=new Cell(i,j,null);
			}
		}
		assertEquals(true,a.isGameOver());
		a.wall=new Cell[20][10];
		for(int i=5;i<20;i++) {
			for(int j=0;j<10;j++) {
				a.wall[i][j]=new Cell(i,j,null);
			}
		}
		assertEquals(false,a.isGameOver());
	}

	@Test
	public void testIsFullLine() {
        a.wall=new Cell[20][10];
		Cell c1=new Cell();
		Cell c2=new Cell();
		Cell c3=new Cell();
		Cell c4=new Cell();
		Cell c5=new Cell();
		Cell c6=new Cell();
		Cell c7=new Cell();
		Cell c8=new Cell();
		Cell c9=new Cell();
		Cell c10=new Cell();
		
		Cell b1=new Cell();
		Cell b2=new Cell();
		Cell b3=new Cell();
		Cell b4=new Cell();
		Cell b5=new Cell();
		Cell b6=new Cell();
		Cell b7=new Cell();
		Cell b8=new Cell();
		Cell b9=new Cell();
		
		
		Cell[][] wall=new Cell[20][10];
		a.wall[2][0]=c1;
		a.wall[2][1]=c2;
		a.wall[2][2]=c3;
		a.wall[2][3]=c4;
		a.wall[2][4]=c5;
		a.wall[2][5]=c6;
		a.wall[2][6]=c7;
		a.wall[2][7]=c8;
		a.wall[2][8]=c9;
		a.wall[2][9]=c10;
		a.wall[3][0]=b1;
		a.wall[3][1]=b2;
		a.wall[3][2]=b3;
		a.wall[3][3]=b4;
		a.wall[3][4]=b5;
		a.wall[3][5]=b6;
		a.wall[3][6]=b7;
		a.wall[3][7]=b8;
		a.wall[3][8]=b9;
		assertEquals(true,a.isFullLine(2));
        assertEquals(false,a.isFullLine(3));
	} 


	@Test
	public void testOutOfBounds() {
		a.wall=new Cell[20][10];
    a.setCRow(0,0,0,1);
    a.setCCol(-1,0,1,0);
    assertEquals(true,a.outOfBounds());
   a.setCRow(0,0,0,1);
   a.setCCol(4,5,6,5);
    assertEquals(false,a.outOfBounds());
	}

	@Test
	public void testCoincide() {
		a.wall=new Cell[20][10];
	    assertEquals(false,a.coincide());
	    Cell c1=new Cell();
		Cell c2=new Cell();
		Cell c3=new Cell();
		Cell c4=new Cell();
		Cell c5=new Cell();
		Cell c6=new Cell();
		Cell c7=new Cell();
		Cell c8=new Cell();
		Cell c9=new Cell();
		Cell c10=new Cell();
		a.wall[1][0]=c1;
		a.wall[1][1]=c2;
		a.wall[1][2]=c3;
		a.wall[1][3]=c4;
		a.wall[1][4]=c5;
		a.wall[1][5]=c6;
		a.wall[1][6]=c7;
		a.wall[1][7]=c8;
		a.wall[1][8]=c9;
		a.wall[1][9]=c10;
	    assertEquals(true,a.coincide());
	}

	@Test
	public void testCanDrop() {
		a.wall=new Cell[20][10];
		a.setCRow(1,1,1,2);
		a.setCCol(1,2,3,2);
	    assertEquals(true,a.canDrop());
	    Cell c1=new Cell();
	    a.wall[3][2]=c1;
	    assertEquals(false,a.canDrop());
	   a.setCRow(18,18,18,19);
	   a.setCCol(1,2,3,2);
	    assertEquals(false,a.canDrop());
	}

}
