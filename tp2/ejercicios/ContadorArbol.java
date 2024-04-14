package tp2.ejercicios;
import java.util.ArrayList;
public class ContadorArbol {
	private BinaryTree<Integer>arbol=new BinaryTree<>();

	public ContadorArbol(BinaryTree<Integer> arbol) {
		super();
		this.arbol = arbol;
	}
	private void numerosParesIn(ArrayList<Integer>lista,BinaryTree<Integer>arbol){
		if(arbol.hasLeftChild()) {
			numerosParesIn(lista,arbol.getLeftChild());
		}
		if(arbol.getData() % 2==0) {
			lista.add(arbol.getData());
		}
		if(arbol.hasRightChild()) {
			numerosParesIn(lista,arbol.getRightChild());
		}
	}

	private void numerosParesPost(ArrayList<Integer>lista,BinaryTree<Integer>arbol){
		if(arbol.hasLeftChild()) {
			numerosParesPost(lista,arbol.getLeftChild());
		}
		if(arbol.hasRightChild()) {
			numerosParesPost(lista,arbol.getRightChild());
		}
		if(arbol.getData() % 2==0) {
			lista.add(arbol.getData());
		}
	}

	public ArrayList<Integer> inOrden(){
		ArrayList<Integer> lista=new ArrayList<Integer>();
		numerosParesIn(lista,arbol);
		return lista;
	}
	public ArrayList<Integer> PostOrden(){
		ArrayList<Integer> lista=new ArrayList<Integer>();
		numerosParesPost(lista,arbol);
		return lista;
	}

}
