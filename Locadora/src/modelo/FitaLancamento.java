package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;


public class FitaLancamento extends Fita{
	
	BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	boolean ok = false;
	public boolean setPrecoLocacao(String precoLocacao) {
		Double precoLocacao1 = null;
		precoLocacao1 = precoLocacao1.parseDouble(precoLocacao);
		if(precoLocacao1 > 0){
		this.precoLocacao += (precoLocacao1 *= 1.20);
		return true;
		}
		else{
			System.out.println("Pre�o inv�lido. Digite um valor maior que 0.");
		return false;
			}
		}

		public Fita cadFitaLancamento (FitaLancamento fita) throws IOException{
			
			FitaLancamento fitaLancamento = fita;
			System.out.println("Digite o t�tulo do filme: ");
			fita.setTitulo(leitor.readLine());
			System.out.println("Digite a categoria do filme: ");
			fita.setCategoriaFilme(leitor.readLine());
			while (!ok){
			try{
			System.out.printf("Digite o pre�o do Aluguel deste filme: ");
			//ok = fita.setPrecoLocacao(leitor.readLine());
			}catch (NumberFormatException e){
				System.out.printf("\n\nFavor digitar um n�mero. Tente novamente.\n\n");
			}
			}
		
			
			return fitaLancamento;
			
		}
}


