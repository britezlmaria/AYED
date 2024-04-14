package tp2.ejercicios;

public class ParcialArboles {
	private BinaryTree<Integer>arbol;
	
	public ParcialArboles(BinaryTree<Integer>arbol) {
		this.arbol=arbol;
	}
	private BinaryTree<Integer>foundNode(int num,BinaryTree<Integer>arbol) {
		if (arbol.getData()==num) {
			return arbol;
		}
		BinaryTree<Integer>node=null;
		if(arbol.hasLeftChild()) {
			node=foundNode(num,arbol.getLeftChild());
		}
		if(arbol.hasRightChild()) {
			node=foundNode(num,arbol.getRightChild());
		}
		return node;
	}
	
	private int contarNodos(BinaryTree<Integer>arbol) {
		if(arbol.isLeaf()) {
			return 0;
		}
		int cant=0;
		if(arbol.hasLeftChild()) {
			contarNodos(arbol.getLeftChild());
		}
		else {
			cant+=1;
		}
		if(arbol.hasRightChild()) {
			contarNodos(arbol.getRightChild());
		}
		else {
			cant+=1;
		}
		return cant;
	}
	public boolean isLeftTree(int num) {
		BinaryTree<Integer>ab=new BinaryTree<>();
		if(!arbol.isEmpty()) {
			ab=foundNode(num,arbol);
		}
		if(ab !=null) {
			int l=0;
			int r=0;
			l=contarNodos(ab.getLeftChild());
			r=contarNodos(ab.getRightChild());
			return l>r;
		}
		else
			return false;
	}
	
}
