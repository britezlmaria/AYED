package tp2.ejercicios;

public class RedBinariaLlena {
	private BinaryTree<Integer> arbol;
	
	public RedBinariaLlena(BinaryTree<Integer>arbol) {
		this.arbol=arbol;
	}
	private int retardoReenvio(BinaryTree<Integer>arbol) {
		if(arbol.isLeaf()) {
			return arbol.getData();
		}
		int l=0;
		int r=0;
		if(arbol.hasLeftChild()) {
			l=retardoReenvio(arbol.getLeftChild());
		}
		if(arbol.hasRightChild()) {
			r=retardoReenvio(arbol.getRightChild());
		}
		return Math.max(l, r)+arbol.getData();
	}
	public int retardoReenvio() {
		if(!arbol.isEmpty()) {
			return retardoReenvio(arbol);
		}
		else
			return 0;
	}
}
