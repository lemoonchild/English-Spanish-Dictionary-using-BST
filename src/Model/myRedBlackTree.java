package Model;

import structure5.RedBlackSearchTree;

public class myRedBlackTree<T extends Comparable<T>> implements treeStructure<T> {

    private RedBlackSearchTree<T> myRedBlackSearchTree;


	public myRedBlackTree() {
		myRedBlackSearchTree = new RedBlackSearchTree<T>();
	}

	@Override
	public void add(T value) {
		myRedBlackSearchTree.add(value);
	}

	@Override
	public T get(T key) {
		return myRedBlackSearchTree.get(key);
	}

	@Override
	public T remove(T key) {
		return myRedBlackSearchTree.remove(key);
	}

	@Override
	public int count() {
		return myRedBlackSearchTree.size();
	}

	@Override
	public boolean isEmpty() {
		return myRedBlackSearchTree.isEmpty();
	}
	
	public RedBlackSearchTree<T> getInternalTree(){
		return myRedBlackSearchTree;
	}

    
}
