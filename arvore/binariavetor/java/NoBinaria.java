public class NoBinaria<T> {
	int posVetor;
	T elemento;
	
	public NoBinaria(int pos, T ele) {
		posVetor = pos;
		elemento = ele;
	}
	
	public int getPosFilhoEsq() {
		return 2*posVetor + 1;
	}
	
	public int getPosFilhoDir() {
		return 2*posVetor + 2;
	}
	
	public int posPai() {
		return (posVetor-1)/2;
	}
	
	public T getElemento() {
		return elemento; 
	}
}
