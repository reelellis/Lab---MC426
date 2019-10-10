package padroesDeProjeto1;

public class AcaoAlertaWorkflow  extends AcaoWorkflow{
	
	public AcaoAlertaWorkflow (int nivel) {
		super(nivel);
	}
	@Override
	public void criaAcaoWorkflow(int nivel) {
		// TODO Auto-generated method stub
		AcaoAlerta acao = new AcaoAlerta ("Proibir transporte de produtos inflamáveis");
	}
}
