package com.mahjoub.concurrent;

import java.util.Scanner;

public class Interrumpt {

	@SuppressWarnings("resource")
	public static void main(String...args) {
		
		Ecrit3 e1 = new Ecrit3("<1>" , 200);
		Ecrit3 e2 = new Ecrit3("<2>" , 200);
		
		e1.start();
		e2.start();
		
		System.out.println("Tapez une lettre pour bloqué <1>");
		new Scanner(System.in).nextLine();
		
		e1.interrupt();
		System.out.println("\n ****Arréte de prémier thread****");
		
		
		
		System.out.println("Tapez une lettre pour bloqué <2>");
		new Scanner(System.in).nextLine();
		
		e2.interrupt();
		System.out.println("\n ****Arréte de deuxieme thread****");
		
		
		
		
		
		
	}
	
}
	
	
class Ecrit3 extends Thread {
	
    private String txt;
    private long attente;
    
    
	public Ecrit3(String txt, long attente) {
		super();
		this.txt = txt;
		this.attente = attente;
	}



	@Override
	public void run() {
		try {
			while (true) {

				if (Thread.currentThread().isInterrupted())
					return;
				System.out.print(txt);
				sleep(attente);
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
