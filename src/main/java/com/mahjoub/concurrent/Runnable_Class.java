package com.mahjoub.concurrent;

public class Runnable_Class {

	public static void main(String[] args) {
		
		Ecrit2 e1 = new Ecrit2("<1>" , 4, 200);
		Ecrit2 e2 = new Ecrit2("<2>" , 4, 200);
		Ecrit2 e3 = new Ecrit2("<3>" , 2, 100);
		
		
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e2);
		Thread t3 = new Thread(e3);
		
		t1.run();
		t2.run();
		t3.run();
		
		
		t1.start();
		t2.start();
		t3.start();
	}

	
}
	class Ecrit2 implements Runnable {
		
		private String txt;
		private int n;
		private long attente;
		
		

		public Ecrit2(String txt, int n, long attente) {
			super();
			this.txt = txt;
			this.n = n;
			this.attente = attente;
		}



		@Override
		public void run() {
			try {
				  for(int i = 0; i<n; i++) {
					  System.out.print(txt);
					  Thread.sleep(attente);
				  }
			} catch (Exception e) {
				e.getMessage();
			}
			
		}
		
	}

