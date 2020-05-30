package elementosSimilares;

import java.util.ArrayList;

public class LinkEnComun extends Filtro {

	//Concrete Class (MyApplication)
	protected boolean condicion(WikipediaPage page, WikipediaPage wiki) {
		ArrayList<WikipediaPage> links = new ArrayList<WikipediaPage>(page.getLinks());
		boolean tieneLinkEnComun = wiki.getLinks().contains(links.get(0));
		links.remove(0);
		while( !tieneLinkEnComun && !links.isEmpty() ) {
			tieneLinkEnComun = wiki.getLinks().contains(links.get(0));
			links.remove(0);
		}
		return tieneLinkEnComun;
	}
}
