package tp2.ejercicios;

public class Transformacion {
	private BinaryTree<Integer>arbol;
	
	public Transformacion(BinaryTree<Integer>arbol) {
		this.arbol=arbol;
	}
	
	public BinaryTree<Integer>suma(){
			if(arbol!=null && !arbol.isEmpty()) {
				return suma(arbol);
			}
			else
				return null;
		
	}
	private BinaryTree<Integer>suma(BinaryTree<Integer>arbol){
		if(arbol.isLeaf()) {
			return new BinaryTree<>(0);
		}
		int suma=0;
		BinaryTree<Integer>izq=null;
		BinaryTree<Integer>der=null;
		if(arbol.hasLeftChild()) {
			izq=suma(arbol.getLeftChild());
			suma+=izq.getData();
			suma+=arbol.getLeftChild().getData();
		}
		if(arbol.hasRightChild()) {
			der=suma(arbol.getRightChild());
			suma+=der.getData();
			suma+=arbol.getRightChild().getData();
		}
		BinaryTree<Integer>arbolSuma=new BinaryTree<>(suma);
		arbolSuma.addLeftChild(izq);
		arbolSuma.addRightChild(der);
		return arbolSuma;
	}
}
