package elementosSimilares;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
	
public class LinkEnComunTest {

	Wikipedia page1 = new Wikipedia("Bernal");
	Wikipedia page2 = new Wikipedia("Quilmes");
	Wikipedia page3 = new Wikipedia("Buenos Aires");
	ArrayList<WikipediaPage> pages = new ArrayList<WikipediaPage>();
	
	LinkEnComun filtro = new LinkEnComun();

	@Before
	public void setUp() throws Exception {
		
		pages.add(page2);
		pages.add(page3);
	}
	
	@Test
	public void testLinkEnComunTest() {
		
		page1.agregarLink(page3);
		page1.agregarLink(page2);
		assertTrue(filtro.getSimilarPages(page1, pages).isEmpty());
		
		page2.agregarLink(page3);
		assertEquals(filtro.getSimilarPages(page1, pages).get(0), page2);
		assertEquals(filtro.getSimilarPages(page1, pages).size(), 1);
	}
}
