package br.com.exec;

public class MainLambda {
	
	public static void main(String[] args) {
		
		Runnable run = new Runnable() {			
			@Override
			public void run() {
				System.out.println("Forma antiga");				
			}
		};
		run.run();
		
		Runnable run2 = () -> System.out.println("invocando uma interface funcional");
		run2.run();
		
	}

}
