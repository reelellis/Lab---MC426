package padroesDeProjeto1;

public abstract class Observador {
	public void update(int nivel) {
		if(nivel == 1 || nivel == 2) {
			FabricaAcoesEmail.criarAcaoAlerta(nivel);
		}
		else {
			FabricaAcoesEmail.criarAcaoPerigo(nivel);
		}
	}
}
