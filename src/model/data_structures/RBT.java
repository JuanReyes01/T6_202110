package model.data_structures;

public class RBT<K extends Comparable<K>, V extends Comparable<V>> implements ITablaSimbolosOrdenada<K,V> {
	//Numero de duplas almacenadas en el arbol
	int n;
	NodoArbol<K, V> raiz;
	public RBT() {
		n = 0;
		raiz = null;
	}
	
	/**
	 * Retorna el numero de duplas
	 */
	public int size() {
		return n;
	}
	
	public boolean isEmpty() {
		
		return n==0;
	}

	public V get(K key) {
		if(raiz == null){
			return null;
		}
		else{
			NodoArbol<K,V> nodo = raiz.get(key);
			return (nodo!=null)?nodo.darValor():null;
		}
	}

	public int getHeight(K key){
		NodoArbol<K, V> buscado = raiz.get(key);
		return (buscado==null)?-1:buscado.getHeight();
	}

	public boolean contains(K key) {
		
		return get(key)!=null;
	}

	
	public void put(K key, V val) {
		NodoArbol<K, V> nuevo = new NodoArbol<K,V>(key, val);
		if(raiz==null){
			raiz = nuevo;
		}
		else{
			raiz = raiz.put(nuevo);
		}
		n++;
		raiz.asignarColor("negro");
		
	}
	

	public int height() {		
		return raiz.getHeight();
	}


	public K min() {		
		return (raiz==null)?null:raiz.min();
	}


	public K max() {
		return (raiz==null)?null:raiz.max();
	}

	public ILista<K> keyset() {
		ArregloDinamico<K> listaLlaves = new ArregloDinamico<K>();
		return raiz.keySet(listaLlaves);
	}

	public ILista<V> valueset() {
		ArregloDinamico<V> listaValores = new ArregloDinamico<V>();
		return raiz.valueSet(listaValores);
	}

	@Override
	public ILista<K> keysInRange(K init, K end) {
			ILista<K> listaLlaves = new ArregloDinamico<K>();
			listaLlaves = keyset();
			int i = listaLlaves.isPresent(init);
			int f = listaLlaves.isPresent(end);
			return listaLlaves.subList(i, f);
	}

	@Override
	public ILista<V> valuesInRange(K init, K end) {
		ILista<K> llaves = keysInRange(init, end);
		ILista<V> listaValores = new ArregloDinamico<V>();
		for(int i=1; i<=llaves.size();i++){
			listaValores.addLast(get(llaves.getElement(i)));
		}
		
		return listaValores;
	}

}
