package controller;

public class NumerosRandom implements IObservavel{
	private ImparPar imparOUpar;
	private int numero;
	
	public NumerosRandom(ImparPar imparOUpar) {
		this.imparOUpar = imparOUpar;
	}
	
	public void gerarNumero() {
		numero = (int) (Math.random() * 1000);
		notificaMudanca(numero);
	}
	
	public void notificaMudanca(int numero) {
		imparOUpar.update(numero);
	}
	
}
