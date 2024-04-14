package tp2.ejercicios;

public class ParcialAb {
	private BinaryTree<Integer>ab1;
	private BinaryTree<Integer>ab2;
	
	
	public ParcialAb(BinaryTree<Integer> ab1, BinaryTree<Integer> ab2) {
		super();
		this.ab1 = ab1;
		this.ab2 = ab2;
	}
	public boolean esPrefijo() {
		if(!ab1.isEmpty() && !ab2.isEmpty()) {
			return esPrefijo(ab1,ab2);
		}
		else {
			return false;
		}
	}
	private boolean esPrefijo(BinaryTree<Integer>arbol1,BinaryTree<Integer>arbol2) {
		if(arbol1.getData() != arbol2.getData()) {
			return false;
		}
		if(arbol1.isLeaf()) {
			return true;
		}
		boolean ok=true;
		if(arbol1.hasLeftChild()) {
			if(arbol2.hasLeftChild()) {
				ok=ok && esPrefijo(arbol1.getLeftChild(),arbol2.getLeftChild());
			}
			else
				return false;
		}
		if(arbol1.hasRightChild()) {
			if(arbol2.hasRightChild()) {
				ok=ok && esPrefijo(arbol1.getRightChild(),arbol2.getRightChild());
			}
			else {
				return false;
			}
		}
		return ok;
	
	}
}
