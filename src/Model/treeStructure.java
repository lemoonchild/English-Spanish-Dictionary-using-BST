package Model;

/**
 * The interface Tree structure.
 *
 * @param <T> the type parameter
 */
public interface treeStructure<T> {

	/**
	 * Add.
	 *
	 * @param value the value
	 */
	public void add (T value);

	/**
	 * Get t.
	 *
	 * @param key the key
	 * @return the t
	 */
	public T get (T key);

	/**
	 * Remove t.
	 *
	 * @param key the key
	 * @return the t
	 */
	public T remove (T key);

	/**
	 * Count int.
	 *
	 * @return the int
	 */
	public int count ();

	/**
	 * Is empty boolean.
	 *
	 * @return the boolean
	 */
	public boolean isEmpty();

    
}
