package padroesDeProjeto1;

public class ActionHandler {
	private int estadoObservador;
	
	public void update(Sensor s) {
		if (s.temperatura >= 360) {
			FabricaAcoesEmail.criarAcaoAlerta();	
		} 
		else if (s.temperatura >= 180) {
			FabricaAcoesEmail.criarAcaoPerigo();
		}
		
	}
	
}
