package br.unipe.cc.bancario.modelo;

import junit.framework.TestCase;

public class TestContaCorrente extends TestCase {
	
	private Conta cc;
	private Conta c;
	
	public void setUp() {
		cc = new ContaCorrente();	
		c = new ContaCorrente();
		cc.setSaldo(10.00);
	}
	
	public void tearDown() {
		cc = null;
	}
	
	public void testDebitar() {
		cc.debitar(5.00);
		assertEquals(cc.getSaldo(), 5.00);
	}

	public void testCreditar() {
		cc.creditar(100.00);
		assertEquals(cc.getSaldo(), 110.00);
	}	
	
	public void testTransferir() {
		cc.creditar(100.00);
		c.creditar(10.00);
		cc.transferir(c, 100.00);
		assertEquals(cc.getSaldo(),10.00);
		assertEquals(c.getSaldo(),110.00);
		
		
	}
}