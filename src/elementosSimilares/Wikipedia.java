package elementosSimilares;

import java.util.ArrayList;
import java.util.HashMap;

public class Wikipedia implements WikipediaPage {
	
	//Variables
	private String title;
	private ArrayList<WikipediaPage> links = new ArrayList<WikipediaPage>();
	private HashMap<String, WikipediaPage> infoBox = new HashMap<String, WikipediaPage>();
	
	//Constructor
	public Wikipedia(String title) {
		super();
		this.title = title;
	}

	//Implementacion
	@Override
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public ArrayList<WikipediaPage> getLinks(){
		return this.links;
	}
	
	@Override
	public HashMap<String, WikipediaPage> getInfobox(){
		return this.infoBox;
	}
	
	public void agregarLink(WikipediaPage wiki) {
		this.links.add(wiki);
	}
	
	public void agregarPropiedad(String key,WikipediaPage value) {
		
		this.infoBox.putIfAbsent(key ,value);
	}
	
}