package controle;

import java.util.Scanner;
import java.util.Random;;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String nome;
		Random rand = new Random();
		System.out.println("Seja bem-vindo ao jogo! Insira seu nome:");
		nome = in.nextLine();
		System.out.println("Seja muito bem-vendo (a) " + nome);
		System.out.println("vo�e deseja avan�ar para qual dire��o? (w, s, a, d)");
		String comando = in.nextLine();
		
		switch(comando) {
		
		case "w":
			if(comando.equals("w")) {
				System.out.println("vo�e est� indo para frete!");
				System.out.println("um inimigo surgiu, o que dejesa fazer? (a = atacar, c = correr)");
				comando = in.nextLine();
				if(comando.equals("a")) {
					if(rand.nextInt(100) < 75) {
						System.out.println("vo�e ganhou o jogo!");
					} else {
						System.out.println("vo�e perdeu o jogo!");
					}
				}else{
						System.out.println("vo�e correu o jogo termino!");
					}
				}
		break;	
		}
		
	}
	
}

