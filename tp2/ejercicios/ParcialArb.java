package tp2.ejercicios;

public class ParcialArb {
	private BinaryTree<Integer>ab=new BinaryTree<>();
	
	public ParcialArb(BinaryTree<Integer>arbol) {
		this.ab=arbol;
	}
	
	private void sumAndDif(BinaryTree<Integer>ab,BinaryTree<SumAndDif>ab2,int suma, int parent){
		SumAndDif sad=new SumAndDif(ab.getData()+suma,ab.getData()-parent);
		ab2.setData(sad);
		
		if(ab.hasLeftChild()) {
			ab2.addLeftChild(new BinaryTree<SumAndDif>());
			sumAndDif(ab.getLeftChild(),ab2.getLeftChild(),ab.getData()+suma,ab.getData());
	    }
		if(ab.hasRightChild()) {
			ab2.addRightChild(new BinaryTree<SumAndDif>());
			sumAndDif(ab.getRightChild(),ab2.getRightChild(),ab.getData()+suma,ab.getData());
		}
		
	}
	
	public BinaryTree<SumAndDif>sumAndDif(){
		BinaryTree<SumAndDif>ab2=new BinaryTree<>();
		sumAndDif(ab,ab2,0,0);
		return ab2;
	}
}
