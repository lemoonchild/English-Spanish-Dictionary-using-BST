package Model;

import java.util.Comparator;

import structure5.SplayTree;

/**
 * The type My splay tree.
 *
 * @param <T> the type parameter
 */
public class mySplayTree<T extends Comparable<T>> implements treeStructure<T> {

	private SplayTree<T> mySplayTree;

	/**
	 * Instantiates a new My splay tree.
	 */
	public mySplayTree() {
		mySplayTree = new SplayTree<T>(); 
	}

	/**
	 * Instantiates a new My splay tree.
	 *
	 * @param comparador the comparador
	 */
	public mySplayTree(Comparator<T> comparador) {
		mySplayTree = new SplayTree<T>(comparador); 
	}
	
	@Override
	public void add(T value) {
		mySplayTree.add(value);
		
	}

	@Override
	public T get(T key) {
		
		return mySplayTree.get(key);
	}

	@Override
	public T remove(T key) {
		
		return mySplayTree.remove(key);
	}

	@Override
	public int count() {
		return mySplayTree.size();
	}

	@Override
	public boolean isEmpty() {
		return mySplayTree.isEmpty();
	}

	/**
	 * Get internal tree splay tree.
	 *
	 * @return the splay tree
	 */
	public SplayTree<T> getInternalTree(){
		return mySplayTree;
	}


}
