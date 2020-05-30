package elementosSimilares;

public class MismaLetraInicial extends Filtro {

	//Concrete Class (MyApplication)
	protected boolean condicion(WikipediaPage page, WikipediaPage wiki) {
		return page.getTitle().toLowerCase().charAt(0) == wiki.getTitle().toLowerCase().charAt(0);
	}
}
