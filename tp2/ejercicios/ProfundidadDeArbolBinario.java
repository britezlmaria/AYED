package tp2.ejercicios;
import tp1.ejercicio8.Queue;
public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer>arbol;
	
	public ProfundidadDeArbolBinario(BinaryTree<Integer>arbol) {
		this.arbol=arbol;
	}
	
	public int sumaElementosProfundidad(int p) {
		BinaryTree<Integer> ab=null;
		Queue<BinaryTree<Integer>>queue=new Queue<>();
		
		int level=0;
		int suma=0;
		queue.enqueue(arbol);
		queue.enqueue(null);
		while(!queue.isEmpty() && level<=p) {
			ab=queue.dequeue();
			if(ab!=null) {
				if(level==p) {
					suma+=ab.getData();
				}
				if(ab.hasLeftChild()) {
					queue.enqueue(ab.getLeftChild());
				}
				if(ab.hasRightChild()) {
					queue.enqueue(ab.getRightChild());
				}
				
			}
			else if(!queue.isEmpty()) {
				queue.enqueue(null);
				level++;
			}
		}
		return suma;
	}
}
