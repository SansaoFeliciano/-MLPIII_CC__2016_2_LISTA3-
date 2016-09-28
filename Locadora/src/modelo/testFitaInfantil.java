package modelo;

import junit.framework.TestCase;

public class testFitaInfantil extends TestCase{
	
	private Fita fita;
	
	public void setUp(){
		
		fita = new FitaInfantil();
	}
	
	public void testPrecoLocacao(){
		
		fita.setPrecoLocacao("4.00");
		
		assertEquals(2.40, fita.getPrecoLocacao());
		
	}
	
public void TearDown(){
		
	fita = null;
	}

}
