package elementosSimilares;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class MismaLetraInicialTest {

	Wikipedia page1 = new Wikipedia("Bernal");
	Wikipedia page2 = new Wikipedia("Quilmes");
	Wikipedia page3 = new Wikipedia("Buenos Aires");
	ArrayList<WikipediaPage> pages = new ArrayList<WikipediaPage>();
	
	MismaLetraInicial filtro = new MismaLetraInicial();
	
	@Before
	public void setUp() throws Exception {
		
		pages.add(page2);
		pages.add(page3);
	}
	
	@Test
	public void testMismaLetraInicial() {
		
		assertEquals(filtro.getSimilarPages(page1, pages).get(0), page3);
		assertEquals(filtro.getSimilarPages(page1, pages).size(), 1);
	}
}
