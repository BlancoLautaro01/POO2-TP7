package elementosSimilares;

import java.util.ArrayList;

public abstract class Filtro {

	//Clase abstracta (Application)
	
	//Template Method
	public ArrayList<WikipediaPage> getSimilarPages(WikipediaPage page, ArrayList<WikipediaPage> wikipedia){
		ArrayList<WikipediaPage> similarPages = new ArrayList<WikipediaPage>();
		for(WikipediaPage wiki: wikipedia) {
			if(this.condicion(page, wiki)) {
				similarPages.add(wiki);
			}
		}
		return similarPages;
	}
	
	//Primitive Operation
	//Visibilidad protected para que puedan overridear los hijos pero no ser usada por el usuario.
	protected abstract boolean condicion(WikipediaPage page, WikipediaPage wiki);
	
}
