package estrutura_repeti��o;

public class switch_case {
	
	public static void main(String[] args) {
	
		String nome = "douglas";
		
		
		// o switch case trabalho por caso
		switch(nome) {
			
		case "ismael":
		
		// caso o meu nome for ismael fa�a isso ....
			System.out.println("ol� meu nome e ismael");
		
		break;
		
		case "eduardo":
		
		// caso o meu nome for eduardo fa�a isso ....	
			System.out.println("ol� meu nome � eduardo");
		
		break;
		
		default:
		// caso n�o caia em nenhum dos casos a cima fa�a isso .... 	
			System.out.println("ol� meu nome � " + nome);
		
		}
	}
}
