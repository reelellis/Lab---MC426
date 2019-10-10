package padroesDeProjeto1;

import java.util.ArrayList;


public class Provedor {
	private ArrayList observadores;
	private Sensor s;
	public Provedor (Sensor s) {
		this.s = s;
	}
	
	private void inscrever (Observador obs) {
		observadores.add(obs);
	}
	private void desinscrever (Observador obs) {
		for(int i: observadores) {
			if(observadores[i] == obs) {
				observadores.remove(i);
			}
		}
	}
	
	private void notificar() {
		
	}
	
	private void ativarSensores () {
		if(s.temperatura >= 360) {
			
		}
	}
	
}
