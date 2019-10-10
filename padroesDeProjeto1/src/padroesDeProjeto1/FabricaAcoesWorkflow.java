package padroesDeProjeto1;

public class FabricaAcoesWorkflow {
	public void criarAcoes (int nivel) {
		if(nivel == 1 || nivel== 2) {
			AcaoWorkflow acao = new AcaoAlertaWorkflow(nivel);
		}
		else {
			AcaoWorkflow acao = new AcaoPerigoWorkflow(nivel);
		}
		
	}
}
