package view;

import controller.ImparPar;
import controller.NumerosRandom;

public class Principal {

	public static void main(String[] args) {
		ImparPar imparPar = new ImparPar();
		int i= 0;
		while(i<5) {
			NumerosRandom numeros = new NumerosRandom(imparPar);
			numeros.gerarNumero();
			i++;
		}


	}

}
