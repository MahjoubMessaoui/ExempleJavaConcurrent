package com.mahjoub.concurrent;

public class Thread_Class {
	
	public static void main(String...args) {
		
		Ecrit ecrit = new Ecrit("<1>",4, 200);
		Ecrit ecrit1 = new Ecrit("<2>",4, 300);
		Ecrit ecrit2 = new Ecrit("<3>",10, 400);
		
		ecrit.start();
		ecrit1.start();
		ecrit2.start();
		
//		ecrit.run();
//		ecrit1.run();
//		ecrit2.run();
		
	}
	

}
 class Ecrit extends Thread {
	
	 
	 private String txt;
		private int n;
		private long attente;
		public Ecrit(String txt, int n, long attente) {
			super();
			this.txt = txt;
			this.n = n;
			this.attente = attente;
		}
		
		@Override
		public void run() {
			try {
				for(int i=0; i<n ; i++) {
					System.out.print(txt);
					Thread.sleep(attente);
				}
				
		} catch (Exception e) {
            e.getMessage();
		}
		}
}
