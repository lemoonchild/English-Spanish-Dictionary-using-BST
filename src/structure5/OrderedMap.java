package structure5;

/**
 * An interface the supports a Map whose values are kept
 * in increasing order.  Values stored within an OrderedMap
 * should implement Comparable; ie. they should have an implemented
 * compareTo method.
 *
 * @param <K> the type parameter
 * @param <V> the type parameter
 * @version $Id : OrderedMap.java 35 2007-08-09 20:38:38Z bailey $
 * @author, 2001 duane a. bailey
 * @see Table
 * @see java.lang.Comparable
 * @see java.lang.Comparable#compareTo java.lang.Comparable#compareTo
 */
public interface OrderedMap<K extends Comparable<K>,V> extends Map<K,V>
{
}
