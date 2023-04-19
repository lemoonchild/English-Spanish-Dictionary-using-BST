package myTree;

import java.util.Comparator;

import structure5.SplayTree;

public class mySplayTree<T extends Comparable<T>> implements treeStructure<T> {

	private SplayTree<T> mySplayTree;
	
	public mySplayTree() {
		mySplayTree = new SplayTree<T>(); 
	}
	
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

	public SplayTree<T> getInternalTree(){
		return mySplayTree;
	} 

}
