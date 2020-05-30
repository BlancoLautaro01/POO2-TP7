package elementosSimilares;

import java.util.ArrayList;

public class PropiedadEnComun extends Filtro {

	//Concrete Class (MyApplication)
	protected boolean condicion(WikipediaPage page, WikipediaPage wiki) {
		
		ArrayList<String> infobox = new ArrayList<String>();
		infobox.addAll(page.getInfobox().keySet());
		
		boolean tienePropiedadEnComun = wiki.getInfobox().keySet().contains(infobox.get(0));
		infobox.remove(0);
		while( !tienePropiedadEnComun && !infobox.isEmpty() ) {
			tienePropiedadEnComun = wiki.getInfobox().keySet().contains(infobox.get(0));
			infobox.remove(0);
		}
		return tienePropiedadEnComun;
	}
}
