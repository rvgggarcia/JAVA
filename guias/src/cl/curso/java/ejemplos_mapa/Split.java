/**
 * 
 */
package cl.curso.java.ejemplos_mapa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Royerliz
 *
 */
public class Split {
	public static void main(String[] args) {

		Map<String, Integer> contador = new HashMap<String, Integer>();
		String text = "buenos dias buenos dias buenos dias";
		String[] palabras = text.split(" ");

		for (int i = 0; i < palabras.length; i++) {
			if (contador.containsKey(palabras[i])) {
				contador.put(palabras[i], contador.get(palabras[i]) + 1);
			} else {
				contador.put(palabras[i], 1);
			}

		}
		
		Iterator<Entry<String, Integer>> it= contador.entrySet().iterator();
		while (it.hasNext()){
			Entry <String, Integer> e= it.next();
			System.out.println(e.getKey()+ " " + e.getValue());
		}

	}

}
