import java.util.Map;

/***
 *
 * @author Emilio Reyes
 * @version 21/04/2023
 *
 */
public class Asociation<K,V> extends Object implements Comparable, Map.Entry{
    K llave;
    V valor;

    /***
     * Asignación de valor
     * @param key llave de referencia
     * @param value valor asociado a la llave
     */
    public Asociation(K key, V value){
        this.llave = key;
        this.valor = value;
    }

    @Override
    public int compareTo(Object o) {
        Asociation ob = (Asociation) o;
        return llave.toString().compareToIgnoreCase(ob.llave.toString());
    }


    @Override
    public K getKey() {
        return llave;
    }

    @Override
    public V getValue() {
        return valor;
    }
    
    @Override
    public V setValue(Object value) {
        V val = (V)value;
        return this.valor = val;
    }
}
