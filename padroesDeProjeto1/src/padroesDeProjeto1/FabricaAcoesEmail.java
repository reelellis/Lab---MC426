package padroesDeProjeto1;

public class FabricaAcoesEmail extends FabricaAcoes {
	public static void criarAcaoAlerta (int nivel) {
		if(nivel == 4) {
			AcaoPerigoEmail Acao =  new AcaoPerigoEmail ("Atenção! Temperatura acima de 360 graus celsius e umidade abaixo de 40% ");
		}
		else {
			AcaoPerigoEmail Acao =  new AcaoPerigoEmail ("Atenção! Temperatura acima de 180 graus celsius umidade abaixo de 40%");
		}
	
	}
	public static void criarAcaoPerigo (int nivel) {
		if (nivel == 1 ) {
			AcaoAlertaEmail Acao = new AcaoAlertaEmail ("Atenção! Temperatura acima de 180 graus e umidade abaixo de 40%");
		
		}
		else {
			AcaoAlertaEmail Acao = new AcaoAlertaEmail ("Atenção! Temperatura acima de 360 graus e umidade abaixo de 40%");
		}
	}
}
