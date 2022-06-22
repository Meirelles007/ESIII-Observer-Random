package controller;

public class ImparPar implements IObservador, IParOUImpar {

	@Override
	public void update(int numero) {
		imparPar(numero);
	}
	
	public void imparPar(int numero) {
		if(numero%2==0) {
			System.out.println(numero + " - Numero Par");
		}else {
			System.out.println(numero + " - Numero Impar");
		}
	}
	
}
