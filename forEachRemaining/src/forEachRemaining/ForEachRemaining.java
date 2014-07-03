/**
 * 
 */
package forEachRemaining;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


/**
 * @author earteaga
 *
 */
public class ForEachRemaining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Nuestra lista de objetos
		List<String> array = new ArrayList<String>();
		array.add("Hola");
		array.add("Mundo");
		array.add("Que");
		array.add("Tal");
		
		//Obtenemos el iterador de la lista
		Iterator<String> iterator = array.iterator();
		
		//Se invoca el metodo pasandole la implementacion de la interface Consumer
		iterator.forEachRemaining(new Consumer<String>() {
			/*Este es el metodo que habra que implementar 
			  con la logica o el procesamiento deseado 
			  para cada objeto de tu lista*/
			@Override
      			public void accept(String t) {
				System.out.println(t);
			}
		});
	}
}
