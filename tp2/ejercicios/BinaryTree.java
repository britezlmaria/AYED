package tp2.ejercicios;
import tp1.ejercicio8.Queue;
public class BinaryTree<T> {
	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;


public BinaryTree() {
	super();
}

public BinaryTree(T data) {
	this.data = data;
}

public T getData() {
	return data;
}

public void setData(T data) {
	this.data = data;
}

public BinaryTree<T> getLeftChild() {
	return leftChild;
}
public BinaryTree<T> getRightChild() {
	return this.rightChild;
}

public void addLeftChild(BinaryTree<T> child) {
	this.leftChild = child;
}

public void addRightChild(BinaryTree<T> child) {
	this.rightChild = child;
}

public void removeLeftChild() {
	this.leftChild = null;
}

public void removeRightChild() {
	this.rightChild = null;
}

public boolean isEmpty(){
	return (this.isLeaf() && this.getData() == null);
}

public boolean isLeaf() {
	return (!this.hasLeftChild() && !this.hasRightChild());

}

public boolean hasLeftChild() {
	return this.leftChild!=null;
}

public boolean hasRightChild() {
	return this.rightChild!=null;
}
public int contarHojas() {
	if(isLeaf()) {
		return 1;
	}
	int cant=0;
	if(hasLeftChild()) {
		cant+=getLeftChild().contarHojas();
	}
	if(hasRightChild()) {
		cant+=getRightChild().contarHojas();
	}
	return cant;

}

public BinaryTree<T>espejo(){
	BinaryTree<T>ab=new BinaryTree<>();
	if(!isEmpty()) {
		ab.setData(getData());
	}
	if(hasLeftChild()) {
		ab.addRightChild(ab.getLeftChild().espejo());
	}
	if(hasRightChild()) {
		ab.addLeftChild(ab.getRightChild().espejo());
	}
	return ab;
}
public void entreNiveles(int n,int m) {
	BinaryTree<T>ab=null;
	Queue<BinaryTree<T>>queue=new Queue<>();
	queue.enqueue(this);
	queue.enqueue(null);
	int level=0;
	while(!queue.isEmpty()) {
		ab=queue.dequeue();
		if(ab!=null) {
			if(level>=n && level<=m) {
				System.out.println(ab.getData());
			}
			if(hasLeftChild()) {
				queue.enqueue(ab.getLeftChild());
			}
			if(hasRightChild()) {
				queue.enqueue(ab.getRightChild());
			}
		}
		else if(!queue.isEmpty()) {
			queue.enqueue(null);
			level++;
		}
	}
	
}
@Override
public String toString() {
	return this.getData().toString();
}

}
