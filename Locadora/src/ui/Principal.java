package ui;

import modelo.FitaLancamento;
import modelo.Autor;
import modelo.FitaInfantil;
import modelo.Fita;

import java.io.IOException;
import java.util.Scanner;
import persistencia.BancoDeDados;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		
		String opcao = "";
		Scanner leitor = new Scanner(System.in);
		BancoDeDados dataBase = new BancoDeDados();
		
		while (!(opcao.equalsIgnoreCase("2"))){
		System.out.println("LOCADORA FILME BOM");
		
		System.out.println("1- Cadastrar filme");
		System.out.println("2- Sair");
		
		System.out.println("Digite sua op��o:");
	     opcao = leitor.next();
		
		switch (opcao){
		
		case "1":
			while (!(opcao.equalsIgnoreCase("0"))){
			System.out.println("1- Cadastrar Filme Lan�amento");
			System.out.println("2- Cadastrar Filme Infantil");
			System.out.println("0-Sair");
			
			opcao = leitor.next();
			
			if (opcao.equals("1")){
				FitaLancamento lancamento = new FitaLancamento();
				dataBase.salvaCadFita(lancamento.cadFitaLancamento(lancamento));
				break;
			}
			else if (opcao.equals("2")){
				FitaInfantil infantil = new FitaInfantil();
				dataBase.salvaCadFita(infantil.cadFitaInfantil(infantil));
				break;
			}	
			else if (opcao.equals("0"))
			break;
			else
				System.out.printf("\nOpc�o inv�lida!\n\n");
			}
		
		case "2":
			break;
			
		default:
			System.out.println("Opc�o inv�lida!");
		}
	}
  }
}