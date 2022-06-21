package aula10;

import java.util.ArrayList;

public class Tabuleiro {
	String campos[][];
	ArrayList<Campo> listaDeCampos;
	
	Campo c1 = new Campo("1");
	Campo c2 = new Campo("2");
	Campo c3 = new Campo("3");
	Campo c4 = new Campo("4");
	Campo c5 = new Campo("5");
	Campo c6 = new Campo("6");
	Campo c7 = new Campo("7");
	Campo c8 = new Campo("8");
	Campo c9 = new Campo("9");
	
	public Tabuleiro() {
		campos = new String[3][3];
		listaDeCampos = new ArrayList<Campo>();
		
		this.campos[0][0] = c1.getConteudo();
		this.campos[0][1] = c2.getConteudo();
		this.campos[0][2] = c3.getConteudo();
		this.campos[1][0] = c4.getConteudo();
		this.campos[1][1] = c5.getConteudo();
		this.campos[1][2] = c6.getConteudo();
		this.campos[2][0] = c7.getConteudo();
		this.campos[2][1] = c8.getConteudo();
		this.campos[2][2] = c9.getConteudo();
		
		listaDeCampos.add(c1);
		listaDeCampos.add(c2);
		listaDeCampos.add(c3);
		listaDeCampos.add(c4);
		listaDeCampos.add(c5);
		listaDeCampos.add(c6);
		listaDeCampos.add(c7);
		listaDeCampos.add(c8);
		listaDeCampos.add(c9);
	}
	
	public void displayTabuleiro() {
		for(int i=0;i<campos.length;i++) {
			for(int j=0;j<campos[i].length;j++) {
				System.out.print(" "+campos[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
	}
	
	public boolean jogar(String jogador, String jogada) {
		if(jogada == "O" ||jogada == "X") return false;
		if(verificarJogada(jogada, jogador)) return true;
		return false;
	}
	
	public boolean verificarJogada(String jogada, String jogador) {
		for(int i=0;i<listaDeCampos.size();i++) {
			if(listaDeCampos.get(i).getConteudo().equals(jogada)) {
				listaDeCampos.get(i).setConteudo(jogador);
				this.atualizarTabuleiro();
				return true;
			}
		}
		return false;
	}
	
	public void atualizarTabuleiro() {
		this.campos[0][0] = c1.getConteudo();
		this.campos[0][1] = c2.getConteudo();
		this.campos[0][2] = c3.getConteudo();
		this.campos[1][0] = c4.getConteudo();
		this.campos[1][1] = c5.getConteudo();
		this.campos[1][2] = c6.getConteudo();
		this.campos[2][0] = c7.getConteudo();
		this.campos[2][1] = c8.getConteudo();
		this.campos[2][2] = c9.getConteudo();
	}
	
	public String verificarVencedor() {
		if(this.campos[0][0].equals(this.campos[0][1]) && this.campos[0][0].equals(this.campos[0][2])) {
			return this.campos[0][0];
		}
		if(this.campos[1][0].equals(this.campos[1][1]) && this.campos[1][0].equals(this.campos[1][2])) {
			return this.campos[1][0];
		}
		if(this.campos[2][0].equals(this.campos[2][1]) && this.campos[2][0].equals(this.campos[2][2])) {
			return this.campos[2][0];
		}
		
		
		if(this.campos[0][0].equals(this.campos[1][0]) && this.campos[0][0].equals(this.campos[2][0])) {
			return this.campos[0][0];
		}
		if(this.campos[0][1].equals(this.campos[1][1]) && this.campos[0][0].equals(this.campos[2][1])) {
			return this.campos[0][1];
		}
		if(this.campos[0][2].equals(this.campos[1][2]) && this.campos[0][2].equals(this.campos[2][2])) {
			return this.campos[0][2];
		}
		
		
		if(this.campos[0][0].equals(this.campos[1][1]) && this.campos[0][0].equals(this.campos[2][2])) {
			return this.campos[0][0];
		}
		if(this.campos[2][0].equals(this.campos[1][1]) && this.campos[2][0].equals(this.campos[0][2])) {
			return this.campos[2][0];
		}
		
		
		
		return "Sem vencedor";
		
	}
	
	
}
