package elementosSimilares;

import java.util.ArrayList;
import java.util.HashMap;

public interface WikipediaPage {
	
	//Tuve que usar ArrayList y HashMap porque List y Map son interfaces y no podia instanciarlas.
	public String getTitle();
	public ArrayList<WikipediaPage> getLinks();
	public HashMap<String, WikipediaPage> getInfobox();
}