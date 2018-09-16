package treeset;

import java.util.Set;
import java.util.TreeSet;

//TreeSet No permite repetidos, ordena de forma ascendente

public class App {

	public static void main(String[] args) {
		
		
Set<Persona> lista = new TreeSet<>();
		
		lista.add(new Persona(1, "Sebastian", 66));
		lista.add(new Persona(2, "Sebastian", 66));
		lista.add(new Persona(3, "ssss", 77));
		lista.add(new Persona(4, "hhhh", 88));
		lista.add(new Persona(5, "lllll", 44));
		
		for (Persona string : lista) {
			System.out.println(string);
		}
		
	}

}
