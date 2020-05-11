package br.com.exec;

import br.com.interfaces.ValorNumerico;
import br.com.interfaces.ValorString;

public class MainValorNumerico {

	public static void main(String[] args) {

		ValorNumerico isPar;

		isPar = (n) -> (n % 2) == 0;

		System.out.println(isPar.teste(3));
		
		ValorString nome;
		nome = (n) -> String.valueOf(n);;
		
		System.out.println(nome.teste(1));
	}

}
