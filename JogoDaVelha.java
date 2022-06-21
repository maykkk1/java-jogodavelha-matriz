package aula10;

import java.util.Scanner;

public class JogoDaVelha {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Tabuleiro tabuleiro = new Tabuleiro();
		String jogador = "X";
		String jogada;
		String mensagemFinal = "O jogo terminou empatado!";
		int numeroDeJogadas = 0;
		
		System.out.println("O jogador X é o primeiro a jogar.\n");
		
		while(numeroDeJogadas < 9) {
			tabuleiro.displayTabuleiro();
			System.out.println("Escolha o numero correspondente ao lugar que deseja jogar.");
			System.out.println("Vez do jogador " + jogador + "\n");
			jogada = in.nextLine();
			if(tabuleiro.jogar(jogador, jogada)) {
				jogador = jogador.equals("X") ? "O" : "X";
				if(tabuleiro.verificarVencedor().equals("X") || tabuleiro.verificarVencedor().equals("O")) {
					mensagemFinal = "O jogador " + tabuleiro.verificarVencedor() + " venceu.";
					break;
				}
				numeroDeJogadas++;
			} else {
				System.out.println("Jogada inválida! Escolha novamente.\n");
			}
		}
		
		System.out.println(mensagemFinal + "\n");
		tabuleiro.displayTabuleiro();
	}
}
