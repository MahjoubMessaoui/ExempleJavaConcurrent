package com.mahjoub.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Mahjoub Messaoui
 *
 */
public class App {

	static int counter = 0;

	public static void main(String[] args) throws InterruptedException {

		/*
		 * ExecutorService consiste à utiliser l'une des méthodes de fabrique de la classe Executors .
		 * Création d'un pool de thread avec 10 thread
		 */
		
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 1000; i++)
			
	/*
	 * submit() et invokeAll() renvoient un objet ou une collection d'objets de type Future ,
	 *  ce qui nous permet d'obtenir le résultat de l'exécution d'une tâche ou de vérifier
	 *   l'état de la tâche (est-elle en cours d'exécution).
	 */
		service.submit(() -> ++counter);
		service.shutdown();
		
		/*
		 * Un bon moyen d'arrêter ExecutorService 
		 */
		service.awaitTermination(10, TimeUnit.SECONDS);
		if (service.isShutdown())
			System.out.printf("Total count: %d", counter);
	}

}
    
    
    
    

