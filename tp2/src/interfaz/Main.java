package interfaz;

import datos.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Main {
	// esta static pq sino no arranca?
	static int alfinal;

	public static void main(String[] args) {

		/*
		LinkedList<Cliente> todosClientes = new LinkedList<Cliente>();
		todosClientes.add(new Cliente(0, "Juan"));
		todosClientes.add(new Cliente(0, "Roberto"));
		todosClientes.add(new Cliente(0, "Pepa"));
	*/	
		int hola;
		String array2[]= {"Ingresar para vender y controlar","Salir"};
		do {
			hola = 	JOptionPane.showOptionDialog(null,
							"Elegir alguna de las siguientes opciones",
							null, 0, 0, null, array2, array2);
			switch (hola) {
			case 0:
				PonerCafes();
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "abuenoadiosmaster");
				break;

			default:
				JOptionPane.showMessageDialog(null, "No exsite esa opcion");
				break;
			}
		} while (hola != 1);

		/*
		 * for (Cafe cafe : todasVentas) { if (cafe.getTipo()>cafe.getTipo()) {
		 * 
		 * } else {
		 * 
		 * } } cafeMasvendido.set
		 */

	}

	public static void PonerCafes() {
		LinkedList<Cafe> cafeMasvendido = new LinkedList<Cafe>();
		LinkedList<Cafe> todasVentas = new LinkedList<Cafe>();
		Cafe caf = new Cafe(0, 0, 0, "", 0);
		
		int tipoDcafe;
		String array[] = {  "Continuar", "Latte", "Flat white", "Lagrima", "Expresso" };
		do {
			tipoDcafe = JOptionPane.showOptionDialog(null,
					"Elegir tipo de cafe a consumir\n Latte , precio 1,50\n Flat white precio 2,50\n Lagrima precio 1,30\n Expresso precio 1,00\nHacer al menos una compra valida para continuar",
					null, 0, 0, null, array, array);
			if (tipoDcafe == 1) {
				caf.setTipo(tipoDcafe);
				caf.setPrecio(1.50);
				caf.setCantidad(+1);
			} else if (tipoDcafe == 2) {
				caf.setTipo(tipoDcafe);
				caf.setPrecio(2.50);
				caf.setCantidad(+1);
			} else if (tipoDcafe == 3) {
				caf.setTipo(tipoDcafe);
				caf.setPrecio(1.30);
				caf.setCantidad(+1);
			} else if (tipoDcafe == 4) {
				caf.setTipo(tipoDcafe);
				caf.setPrecio(1.00);
				caf.setCantidad(+1);
			} else {

			}

			if (tipoDcafe == 1 || tipoDcafe == 2 || tipoDcafe == 3 || tipoDcafe == 4) {
				JOptionPane.showMessageDialog(null, "Gracias por comprar el tipo de producto nª: " + caf.getTipo());
			} else if (tipoDcafe == 0) {
				JOptionPane.showMessageDialog(null, "A lo siguiente");
			} else {
				JOptionPane.showMessageDialog(null, "No existe ese tipo d producto");
			}

			todasVentas.add(new Cafe(0, caf.getTipo(), caf.getPrecio(),"", 0));
		} while (tipoDcafe != 0);

		String array3[]= {"Volver al menu anterior","Ver ventas","Ver cafe + vendido","Ver recaudacion total", "Ver ventas con descuento"," Borrar alguna compra","Volver al menu principal"};
		
		do {
			alfinal = JOptionPane.showOptionDialog(null,
					"",
					null, 0, 0, null, array3, array3);

			switch (alfinal) {
			case 0:
				PonerCafes();
				break;
			case 1:
				JOptionPane.showMessageDialog(null, todasVentas);
				break;
			case 2:
				for (Cafe sucantida : todasVentas) {
					int m=0;
					int a=999;
					for (int i = 0; i < a; i++) {
						if (sucantida.getCantidad()>m) {
							m=i;
						}
					}
					//JOptionPane.showMessageDialog(null, sucantida);
				}
				JOptionPane.showMessageDialog(null, "Falta :(");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Todas las ventas");
				for (Cafe vendido : todasVentas) {
					vendido.getPrecio();
					JOptionPane.showMessageDialog(null, vendido);
				}
				
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Falta :(");
				break;
			case 5:
			/*
				String[] hola = new String[todasVentas.size()];
				for (Cafe compra : todasVentas) {
					hola[todasVentas.indexOf(compra)]=String.valueOf(compra.getId());
				}
			String	xd = (String) JOptionPane.showInputDialog(
						null // para que se muestre centrado
						,"Selecciona la venta que queres anular" // Mensaje de la ventana
						,"Lista de Datos" // Titulo de la ventana
						,JOptionPane.QUESTION_MESSAGE // Icono
						,null //null para icono defecto de la ventana
						,hola // el objeto
						,hola[0] // posicion del que va aparecer seleccionado
						);
			*/
			int aux=0;
			aux = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresar n° d id d compra a eliminar"));
				todasVentas.remove(aux);
				
				break;
			case 6 :
				
				break;
			default:
				break;
			}
		} while (alfinal != 0 && alfinal !=6);
	}
	
	
	}
	

//public static void Delempleado(LinkedList<Cafe> todasVentas) 
