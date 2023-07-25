package Divisas;

import javax.swing.JOptionPane;

public class Funciones {
	Double valor;
	public void Programa() {
		valor = Double.valueOf(JOptionPane.showInputDialog("Digite el valor a convertir"));
		
		Object seleccion = JOptionPane.showInputDialog(
				   null,
				   "Seleccione opcion",
				   "Selector de opciones",
				   JOptionPane.QUESTION_MESSAGE,
				   null,	
				   new Object[] { "Dolar a Pesos Colombianos", "Euro a Pesos Colombianos", "Libra a Pesos Colombianos","Yen a Pesos Colombianos", "Won a Pesos Colombianos", "Pesos Colombianos a Dolar","Pesos Colombianos a Euro",
						   "Pesos Colombianos a Libra","Pesos Colombianos a Won", "Pesos Colombianos a Yen" }, 
				   "Seleccione");
			Valores val = new Valores();
			val.Valor(seleccion, valor);
			
			int confirmado = JOptionPane.showConfirmDialog(
					   null,
					   "¿Deseas hacer otra conversión?");

					if (JOptionPane.OK_OPTION == confirmado)
					   this.Programa();
					else
					   return;
	}
}
