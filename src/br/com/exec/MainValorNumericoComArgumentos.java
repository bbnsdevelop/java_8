package br.com.exec;

import br.com.interfaces.ValorNumericoComArgumentos;

public class MainValorNumericoComArgumentos {

	public static void main(String[] args) {
		ValorNumericoComArgumentos v = (x, y) -> (x % y) == 0;
		
		System.out.println(v.teste(10, 7));		
		
		v = (x, y) -> x == y;
		System.out.println(v.teste(3, 2));
		
		
		v = (x, y) -> {
						x = getNovoNumero();
						return x == y;
					};
		System.out.println(v.teste(3, 2));
	}
	
	public static int getNovoNumero() {
		return 2;
	}

}
