package padroesDeProjeto1;

import java.util.ArrayList;


public class Provedor {
	private  ArrayList<Observador> observadores;
	private Sensor s;
	public Provedor (Sensor s, int tempo) {
		this.s = s;
	}
	
	private void inscrever (Observador obs) {
		observadores.add(obs);
	}
	private void desinscrever (Observador obs) {
		for(int i: observadores) {
			if(observadores.get(i) == obs) {
				observadores.remove(i);
			}
		}
	}
	
	private void notificar(int nivel) {
		Observador obs;
		if (nivel == 1) {
			for(int i: this.observadores) {
				obs = this.observadores.get(i);
				obs.update(nivel);
			}
		}
		
	}
	
	private void ativarSensores () {
		if(s.temperatura >= 360) {
			if (s.umidade <= 40) {
				this.notificar(4);
			}
			else {
				this.notificar(2);
			}
		}
		else if(s.temperatura >= 180) {
			if(s.umidade <= 40) {
				this.notificar(3);
			}
			else {
				this.notificar(1);
			}
		}
	}
	
}
