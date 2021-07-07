package br.com.generation.vetores.matrizes;

import java.util.Scanner;

public class AtividadeExercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] pontuacao = new int[5];
		int maiorPontuacao = 0 ;
		
		int i;
		
		System.out.println("Digite as 5 pontuações da Atividade: ");
		
		for(i = 0; i< pontuacao.length; i++) {
			pontuacao[i] = entrada.nextInt();
			
		
		if(pontuacao[i] > maiorPontuacao) {
		   maiorPontuacao = pontuacao[i];
			 
		 }
		
    }	
		
	    for(i = 0; i< pontuacao.length; i++) {
	    	System.out.print("|" + pontuacao[i]);
	    }		
	  System.out.println(" ");
	  System.out.println("A maior pontuação da Atividade é : " + maiorPontuacao);
}
}