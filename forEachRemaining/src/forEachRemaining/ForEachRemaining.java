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
		
		iterator.forEachRemaining(new Consumer<String>() {
			@Override
      public void accept(String t) {
				System.out.println(t);
	      
      }
		});
	}
}
