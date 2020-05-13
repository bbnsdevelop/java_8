package br.com.exec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainStream {

	public static void main(String[] args) {

		List<String> estados = Arrays.asList("São paulo", "Santa Catarina", "Parana", "Espirito Santo", "Bahia",
				"Minas Gerais");
		List<String> novaLista = filtroWithReturn(estados, (s) -> s.endsWith("a"));
		System.out.println(novaLista);

		filtro(estados, (s) -> s.startsWith("S"));
		// condição já é falsa
		filtro(estados, (s) -> false);
		// condição já é verdadeira
		filtro(estados, (s) -> true);

		filtro(estados, (s) -> s.length() > 5);

		orderList(estados);
		metodoDeReferencia(estados);
		filterStreamReturnList(estados, "Parana");
		filterStreamReturnObjeto(estados, "Teste");

	}

	public static void filtro(List<String> lista, Predicate<String> condicao) {
		lista.forEach(e -> {
			if (condicao.test(e))
				System.out.println(e);
		});
	}

	public static List<String> filtroWithReturn(List<String> lista, Predicate<String> condicao) {
		List<String> newList = new ArrayList<>();
		/* varias maneiras de fazer 
		lista.forEach(e -> {
			if (condicao.test(e))
				newList.add(e);
		});
		*/
		
		lista.stream().filter(condicao::test).forEach(newList::add);
		return newList;
	}

	public static void orderList(List<String> listaEstados) {
		List<String> list = listaEstados.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
	}

	public static void metodoDeReferencia(List<String> listaEstados) {
		List<String> list = new ArrayList<>();
		listaEstados.stream().forEachOrdered(list::add);
		System.out.println(list);
	}

	public static void filterStreamReturnList(List<String> listaEstados, String estado) {
		List<String> list = listaEstados.stream().filter(e -> e.equalsIgnoreCase(estado))
				.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(list);
	}

	public static void filterStreamReturnObjeto(List<String> listaEstados, String estado) {
		String es = listaEstados.stream().filter(e -> e.equalsIgnoreCase(estado)).findFirst()
				.orElse("Estado Não encontrado");
		System.out.println(es);
	}

}
