package tp2.ejercicios;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<>(10);
	        
	 
	    BinaryTree<Integer> nodoIzquierdo = new BinaryTree<>(5);
	    arbol.addLeftChild(nodoIzquierdo);

	    BinaryTree<Integer> nodoDerecho = new BinaryTree<>(15);
	    arbol.addRightChild(nodoDerecho);

	    nodoIzquierdo.addLeftChild(new BinaryTree<>(2));
	    nodoIzquierdo.addRightChild(new BinaryTree<>(7));
	        
	    nodoDerecho.addLeftChild(new BinaryTree<>(12));
	    nodoDerecho.addRightChild(new BinaryTree<>(20));
	    
	    BinaryTree<Integer> arbol2 = new BinaryTree<>(10);
	    BinaryTree<Integer> nodoIzq = new BinaryTree<>(5);
	    arbol.addLeftChild(nodoIzq);

	    BinaryTree<Integer> nodoDer = new BinaryTree<>(15);
	    arbol.addRightChild(nodoDer);

	    nodoIzq.addLeftChild(new BinaryTree<>(2));
	   
	    ContadorArbol contadorArbol = new ContadorArbol(arbol);
	    RedBinariaLlena red=new RedBinariaLlena(arbol);
	
	    ArrayList<Integer> paresInOrden = contadorArbol.inOrden();
	    System.out.println("Números pares en InOrden: " + paresInOrden);

	   
	    ArrayList<Integer> paresPostOrden = contadorArbol.PostOrden();
	    System.out.println("Números pares en PostOrden: " + paresPostOrden);
	    
	    System.out.println("retardo maximo de envio:"+ red.retardoReenvio());
	    
	    ProfundidadDeArbolBinario prof=new ProfundidadDeArbolBinario(arbol);
	    System.out.println("suma de elementos que estan a profundidad 1:"+prof.sumaElementosProfundidad(1));
	    
	    Transformacion t=new Transformacion(arbol);
	    BinaryTree<Integer>ab=t.suma();
	    System.out.println(ab.toString());
	    
	    ParcialArboles p=new ParcialArboles(arbol);
	    System.out.println("el arbol tiene mas hijos izq huerfanos que derechos:"+p.isLeftTree(10));
	    
	    ParcialAb p2=new ParcialAb(arbol,arbol2);
	    System.out.println("el arbol 2 es prefijo del1:"+p2.esPrefijo());
	    
	    ParcialArb p3=new ParcialArb(arbol);
	    System.out.println(p3.sumAndDif());
	    
	}
}
