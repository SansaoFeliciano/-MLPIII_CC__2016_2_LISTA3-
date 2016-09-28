package persistencia;


import java.util.ArrayList;
import modelo.Fita;

public class BancoDeDados {
	
	ArrayList dateBase = new ArrayList();
	
	public void salvaCadFita (Fita fita){
		
		dateBase.add(fita);
		System.out.printf("\nCadastro salvo com sucesso!\n\n");
		
	}

}
