package controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import model.data_structures.ArregloDinamico;
import model.data_structures.ILista;
import model.logic.Modelo;
import model.logic.YoutubeVideo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;
	
	/* Instancia de la Vista*/
	private View view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public Controller () throws ParseException, IOException
	{
		view = new View();
		modelo = new Modelo();
	}


	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		Object respuesta = null;

		
		while(!fin){
			view.printMenu();
			
			int option = lector.nextInt();
			switch(option){
				case 1:
					view.printMessage("Inicializando...");
					try {
					view.printMessage(modelo.cargar());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				break;
				
				case 2:
					
					break;					
				case 3:
					
				case 4:
					view.printMessage("Pruebas de desempeño");
					break;
				case 5: 
					view.printMessage("--------- \n Hasta pronto !! \n---------"); 
					lector.close();
					fin = true;
					break;				
				
				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
			}
		}
		}
	}
