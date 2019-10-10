package padroesDeProjeto1;

public class ActionHandler extends Observador {
	private int estadoObservador;
	
	public void update(int nivel) {
		if (s.temperatura >= 360) {
			FabricaAcoesEmail.criarAcaoAlerta();	
		} 
		else if (s.temperatura >= 180) {
			FabricaAcoesEmail.criarAcaoPerigo();
		}
		
	}
	
}
