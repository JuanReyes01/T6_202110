package model.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;
import model.data_structures.ILista;
import model.data_structures.ITablaSimbolos;
import model.data_structures.ListaEncadenada;
import model.data_structures.RBT;
import model.data_structures.TablaHashLinearProbing;
import model.data_structures.TablaHashSeparateChaining;
import model.data_structures.TablaSimbolos;
import model.utils.Ordenamiento;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	private static final String VIDEO = "./data/context_content_features-small.csv";
	/**
	 * Atributos del modelo del mundo
	 */
	private RBT<Double, ArregloDinamico<Reproduccion>> arbol;
	
	public Modelo()
	{   
		arbol = new RBT<Double, ArregloDinamico<Reproduccion>>(); 
	}	
	
	public String cargar() throws ParseException, IOException{
		Reader in = new FileReader(VIDEO);
		Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);	
		int i = 0;
		for (CSVRecord record : records) {
		    String instrumentalness = record.get(0);
		    String liveness = record.get(1);
		    String speechiness = record.get(2);
		    String danceability = record.get(3);
		    String valence = record.get(4);
		    String loudness = record.get(5);
		    String tempo = record.get(6);
		    String acousticness = record.get(7);
		    String energy  = record.get(8);
		    String mode = record.get(9);
		    String key = record.get(10);
		    String artist_id = record.get(11);
		    String tweet_lang = record.get(12);
		    String track_id = record.get(13);
		    String created_at = record.get(14);
		    String lang = record.get(15);
		    String time_zone = record.get(16);
		    String user_id = record.get(17);
		    String id = record.get(18);
		    //--------------------------------------------------------------------
		    if(!instrumentalness.equals("instrumentalness")){
		    SimpleDateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    												//2014-01-01 05:56:11
		    Date fechaPu = formato1.parse(created_at);			    
		    Reproduccion nuevo = new Reproduccion(Double.parseDouble(instrumentalness), Double.parseDouble(liveness), Double.parseDouble(speechiness), Double.parseDouble(danceability), Double.parseDouble(valence), Double.parseDouble(loudness), Double.parseDouble(tempo),Double.parseDouble(acousticness), Double.parseDouble(energy),(int) Double.parseDouble(mode), (int) Double.parseDouble(key), artist_id, tweet_lang, track_id, fechaPu, lang, time_zone, (int) Double.parseDouble(user_id), (int) Double.parseDouble(id)); 
		    Double llave = nuevo.darDanceability();
		    ArregloDinamico<Reproduccion> valor = arbol.get(llave);
		    															
		    if(valor == null){
		    	ArregloDinamico<Reproduccion> v = new ArregloDinamico<Reproduccion>();
		    	v.addLast(nuevo);
		    	arbol.put(llave, v);
		    }
		    else{
		    	valor.addLast(nuevo);
		    	arbol.put(llave, valor);
		    }		    		  
		    }
		} 
		double menor = arbol.min();
		double mayor = arbol.max();
		return " Eventos escucha: "+arbol.size()+"\n Llaves: "+arbol.keyset().size()
		+"\n Altura: "+arbol.height()
		+"\n Menor: "+ menor +":"+ arbol.get(menor).size() 
		+ "\n mayor: "+ mayor +":"+arbol.get(mayor).size();
	}
}


		