package modelo;

import junit.framework.TestCase;

public class TestFitaLancamento extends TestCase{
	
	private Fita fita;
	
	public void setUp(){
		
		fita = new FitaLancamento();
	}
	
	public void testPrecoLocacao(){
		
		fita.setPrecoLocacao("4.00");
		
		assertEquals(4.80, fita.getPrecoLocacao());
		
	}
	
public void TearDown(){
		
	fita = null;
	}

}