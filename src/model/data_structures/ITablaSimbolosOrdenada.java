package model.data_structures;

public interface ITablaSimbolosOrdenada<K extends Comparable<K>, V extends Comparable<V>> {

	int size();
	boolean isEmpty();
	V get(K key);
	int getHeight(K key);
	boolean contains(K key);
	void put(K key, V val);
	int height();
	K min();
	K max();
	ILista<K> keyset();
	ILista<V> valueset();
	ILista<K> keysInRange(K init, K end);
	ILista<V> valuesInRange(K init, K end);
	
}
