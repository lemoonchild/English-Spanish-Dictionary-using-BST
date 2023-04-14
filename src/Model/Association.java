package Model;
public class Association<K extends Comparable<K>, V> {

    private K key;
    private V value;

    /**
     * Constructor de la asociacion 
     * @param key
     * @param value
     */
    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Metodo para obtener llave de valor 
     * @return llave de valor 
     */
    public K getKey() {
        return key;
    }
    /**
     * Metodo para obtener valor 
     * @return valor 
     */
    public V getValue() {
        return value;
    }
    /**
     * Metodo para setear un valor 
     * @return valor a setear 
     */
    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}