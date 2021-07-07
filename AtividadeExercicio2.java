package br.com.generation.vetores.matrizes;

import java.util.Scanner;

public class AtividadeExercicio2 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
	
			int[] lancamento = new int[10];
			int soma = 0 ; 
			int maiorPontuacao = 0 ;
			double media = 0 ; 
			
			int cont = 0;
			int i;
			
			System.out.println(" Digite o valor do dado: ");
			
			for(i = 0; i< lancamento.length; i++){
				lancamento[i] = entrada.nextInt();
				soma = soma + lancamento[i]; 
				media = soma / 10; 
				 
			if(lancamento[i] > maiorPontuacao){
			   maiorPontuacao = lancamento[i];
			   cont = 0;
			   
			if(lancamento[i] == maiorPontuacao){      
			   cont++;
		   }
		}
			
	}
			System.out.println("A média dos lançamentos é: " + media);
			System.out.println("O maior valor foi lançado: " + cont + " vezes");
}	
}

            
	       


			

