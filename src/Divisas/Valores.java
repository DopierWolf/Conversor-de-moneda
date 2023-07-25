package Divisas;

import javax.swing.JOptionPane;

public class Valores {
	Double resultado;
	
	public void Valor(Object seleccion, Double valor){
		if ((boolean) (seleccion == "Dolar a Pesos Colombianos")) {
			resultado = valor * 3974.50;
		}
		
		else if ((boolean) (seleccion == "Euro a Pesos Colombianos")) {
			resultado = valor * 4394.14;
		}
		
		else if ((boolean) (seleccion == "Libra a Pesos Colombianos")) {
			resultado = valor * 5128.30;
		}
		
		else if ((boolean) (seleccion == "Yen a Pesos Colombianos")) {
			resultado = valor * 28.21;
		}
		
		else if ((boolean) (seleccion == "Won a Pesos Colombianos")) {
			resultado = valor * 3.12;
		}
		
		else if ((boolean) (seleccion == "Pesos Colombianos a Dolar")) {
			resultado = valor / 3974.50;
		}
		
		else if ((boolean) (seleccion == "Pesos Colombianos a Euro")) {
			resultado = valor / 4394.14;
		}
		
		else if ((boolean) (seleccion == "Pesos Colombianos a Libra")) {
			resultado = valor / 5128.30;
		}
		
		else if ((boolean) (seleccion == "Pesos Colombianos a Yen")) {
			resultado = valor / 28.21;
		}
		
		else if ((boolean) (seleccion == "Pesos Colombianos a Won")) {
			resultado = valor / 3.12;
		}
		
		
		
		JOptionPane.showMessageDialog(null,"El resultado es: " + Math.round(resultado * 100d) / 100d);

	}
}
