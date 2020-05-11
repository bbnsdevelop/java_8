package br.com;

public class MainInterfaceFunctional {

	public static void main(String[] args) {
		
		Num n1 = () -> 333.11;
	
		System.out.println(n1.getValor());
		
		Num n = () -> {
				double num = 333.11 + 277.99;
				return num;
			};
		
		System.out.println(n.getValor());
		
		
		Num n2 = () -> Math.random() * 100;
		
		System.out.println(n2.getValor());
		System.out.println(n2.getValor());
		
	}

}
