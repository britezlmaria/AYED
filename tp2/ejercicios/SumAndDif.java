package tp2.ejercicios;

public class SumAndDif {
	private int sum;
	private int dif;
	
	
	public SumAndDif(int sum, int dif) {
		super();
		this.sum = sum;
		this.dif = dif;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getDif() {
		return dif;
	}
	public void setDif(int dif) {
		this.dif = dif;
	}
	
	@Override
	public String toString() {
		return "[sum: "+sum+" dif: "+dif+"]";
	}
}
