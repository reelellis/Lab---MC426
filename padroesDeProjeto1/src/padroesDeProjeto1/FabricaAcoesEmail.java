package padroesDeProjeto1;

public class FabricaAcoesEmail extends FabricaAcoes {
	public static void criarAcaoAlerta () {
		
		printf("Cuidado! Temperatura acima de 180 graus Celsius");
	}
	public static void criarAcaoPerigo () {
		printf("Cuidado! Temperatura acima de 360 graus Celsius");
	}
}
