package interfaz;

import datos.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Main {
	//esta static pq sino no arranca?
	static int alfinal;

	public static void main(String[] args) {
int hola;
do {
	hola=Integer.parseInt(JOptionPane.showInputDialog(null,
			"ingresar 1 para vender y controlar \ningresar 0 para salir"));
	switch (hola) {
	case 0:
		JOptionPane.showMessageDialog(null, "abuenoadiosmaster");
		break;
case 1:
	PonerCafes();
	break;

default:
	JOptionPane.showMessageDialog(null, "no exsite esa opcion");
	break;
}
} while (hola!=0);



		
		/*
		 * for (Cafe cafe : todasVentas) { if (cafe.getTipo()>cafe.getTipo()) {
		 * 
		 * } else {
		 * 
		 * } }
		 * cafeMasvendido.set
		 */
		

	}
	public static void PonerCafes() {
		LinkedList<Cafe> cafeMasvendido = new LinkedList<Cafe>();
		LinkedList<Cafe> todasVentas = new LinkedList<Cafe>();
		Cafe caf = new Cafe(0, 0, 0);
		int tipoDcafe;
		do {
			tipoDcafe = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Elegir tipo d cafe a consumir\n1 Latte , precio 1,50\n2 Flat white precio 2,50\n3 Lagrima precio 1,30\n4 Expresso precio 1,00\n0 para salir\nHacer al menos una compra valida para continuar"));
			if (tipoDcafe == 1) {
				caf.setTipo(tipoDcafe);
				caf.setPrecio(1.50);
			} else if (tipoDcafe == 2) {
				caf.setTipo(tipoDcafe);
				caf.setPrecio(2.50);
			} else if (tipoDcafe == 3) {
				caf.setTipo(tipoDcafe);
				caf.setPrecio(1.30);
			} else if (tipoDcafe == 4) {
				caf.setTipo(tipoDcafe);
				caf.setPrecio(1.00);
			} else {
				
			}

			if (tipoDcafe == 1 || tipoDcafe == 2 || tipoDcafe == 3 || tipoDcafe == 4) {
				JOptionPane.showMessageDialog(null, "gracias por comprar el tipo de producto n?: " + caf.getTipo());
			} else if (tipoDcafe == 0) {
				JOptionPane.showMessageDialog(null, "bueno chao");
			}else {
				JOptionPane.showMessageDialog(null, "no existe ese tipo d producto");
			}

			todasVentas.add(new Cafe(0, caf.getTipo(), caf.getPrecio()));
		} while (tipoDcafe != 0);
int aux;
	JOptionPane.showMessageDialog(null, "termino el dia");
	do {
		alfinal = Integer.parseInt(JOptionPane.showInputDialog(null,
				"1 ver ventas\n2 cafe + vendido\n3 recaudacion total\n4 ventas con descuento\n5 borrar alguna compra\n0 salir"));

		switch (alfinal) {
		case 0:
			JOptionPane.showMessageDialog(null, "bueno chao");
			break;
		case 1:
			System.out.println(todasVentas);
			break;
		case 2:
			System.out.println();
			break;
		case 3:
			System.out.println(todasVentas);
			break;
		case 4:
			System.out.println(todasVentas);
			break;
		case 5:
			aux = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresar n? d id d compra a eliminar"));
			todasVentas.remove(aux);
			JOptionPane.showMessageDialog(null, "borrao");
			break;
		default:
			break;
		}
	} while (alfinal != 0);
}
}
//public static void Delempleado(LinkedList<Cafe> todasVentas) 
