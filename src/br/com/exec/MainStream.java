package br.com.exec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainStream {

	public static void main(String[] args) {		
		
		List<String> estados = Arrays.asList("S�o paulo", "Santa Catarina", "Parana", "Espirito Santo", "Bahia", "Minas Gerais");
		List<String> novaLista = filtroWithReturn(estados, (s) -> s.endsWith("a") );
		System.out.println(novaLista);

		filtro(estados, (s) -> s.startsWith("S") );
		
		// condi��o j� � falsa
		filtro(estados, (s) -> false );
		// condi��o j� � verdadeira
		filtro(estados, (s) -> true );
		
		filtro(estados, (s) -> s.length() > 5 );
		
	}
	
	public static void filtro(List<String> lista, Predicate<String> condicao) {
		for(String s : lista)
			if(condicao.test(s))
				System.out.println(s);
	}
	
	public static List<String> filtroWithReturn(List<String> lista, Predicate<String> condicao) {	
		List<String> newList = new ArrayList<>();
		for(String s : lista)
			if(condicao.test(s))
				newList.add(s);
		List<String> list = newList.stream().sorted().collect(Collectors.toList());
		
		return newList;
	}
	

}
