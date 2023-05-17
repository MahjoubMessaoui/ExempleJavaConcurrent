package com.mahjoub.concurrent;

public class ExempleTest {
     
	public static int x ;
	public static void main(String[] args) {

		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				x++;

			}
		};
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				x++;

			}
		});
		
		
		
		Thread thread3 = new Thread(()->{x++;});
		Thread thread1 = new Thread(r);
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("la valeur de x est .....  " +x );
		
	}

}
