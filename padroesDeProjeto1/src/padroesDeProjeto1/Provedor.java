package padroesDeProjeto1;

import java.util.ArrayList;


public class Provedor {
	private void inscrever (ArrayList observadores, Observador obs) {
		observadores.add(obs);
	}
	private void desinscrever (ArrayList observadores, Observador obs) {
		for(int i: observadores) {
			if(observadores[i] == obs) {
				observadores.remove(i);
			}
		}
	}
	
	private void notificar() {
		
	}
	
}
