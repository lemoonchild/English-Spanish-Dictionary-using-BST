package structure5;

/**
 * Associations establish a link between a key and a value.
 * An associative array or map is a structure that allows a disjoint
 * set of keys to become associated with an arbitrary set of values.
 * The convenience of an associative array is that the values used to
 * index the elements need not be comparable and their range need not
 * be known ahead of time.  Furthermore, there is no upper bound on
 * the size of the structure.  It is able to maintain an arbitrary number
 * of different pieces of information simultaneously.  Maps are sometimes
 * called dictionaries because of the uniqueness of the association of
 * words and definitions in a household dictionary.
 * <p>
 * Example Usage:
 * <p>
 * To create a dictionary by reading a collection of words and
 * definitions from System.in we could use the following!
 * <p>
 * <pre>
 * public static void main (String[] argv){
 *      Map dict = new {@link structure.MapBST#MapBST()};
 *      ReadStream r = new ReadStream();
 *      String word, def;
 *      System.out.println("Enter a word: ");
 *      while(!r.eof()){
 *          word = r.readLine();
 *          System.out.println("Enter a definition: ");
 *          def = r.readLine();
 *          dict.{@link structure.MapBST#put(Object, Object) put(word,def)};
 *          System.out.println("Enter a word: ");
 *      }
 *      System.out.println(dict);
 * }
 * </pre>
 *
 * @param <K> the type parameter
 * @param <V> the type parameter
 */
public interface Map<K,V>
{
    /**
     * Size int.
     *
     * @return the int
     * @post returns the number of entries in the map
     */
    public int size();

    /**
     * Is empty boolean.
     *
     * @return the boolean
     * @post returns true iff this map does not contain any entries
     */
    public boolean isEmpty();

    /**
     * Contains key boolean.
     *
     * @param k the k
     * @return the boolean
     * @pre k is non-null
     * @post returns true iff k is in the domain of the map
     */
    public boolean containsKey(K k);

    /**
     * Contains value boolean.
     *
     * @param v the v
     * @return the boolean
     * @pre v is non-null
     * @post returns true iff v is the target of at least one map entry; that is, v is in the range of the map
     */
    public boolean containsValue(V v);

    /**
     * Get v.
     *
     * @param k the k
     * @return the v
     * @pre k is a key, possibly in the map
     * @post returns the value mapped to from k, or null
     */
    public V get(K k);

    /**
     * Put v.
     *
     * @param k the k
     * @param v the v
     * @return the v
     * @pre k and v are non-null
     * @post inserts a mapping from k to v in the map
     */
    public V put(K k, V v);

    /**
     * Remove v.
     *
     * @param k the k
     * @return the v
     * @pre k is non-null
     * @post removes any mapping from k to a value, from the mapping
     */
    public V remove(K k);

    /**
     * Put all.
     *
     * @param other the other
     * @pre other is non-null
     * @post all the mappings of other are installed in this map, overriding any conflicting maps
     */
    public void putAll(Map<K,V> other);

    /**
     * Clear.
     *
     * @post removes all map entries associated with this map
     */
    public void clear();

    /**
     * Key set set.
     *
     * @return the set
     * @post returns a set of all keys associated with this map
     */
    public Set<K> keySet();

    /**
     * Values structure.
     *
     * @return the structure
     * @post returns a structure that contains the range of the map
     */
    public Structure<V> values();

    /**
     * Entry set set.
     *
     * @return the set
     * @post returns a set of (key-value) pairs, generated from this map
     */
    public Set<Association<K,V>> entrySet();

    /**
     * @pre other is non-null
     * @post returns true iff maps this and other are entry-wise equal
     */
    public boolean equals(Object other);
    
    /**
     * @post returns a hash code associated with this structure
     */
    public int hashCode();
}
