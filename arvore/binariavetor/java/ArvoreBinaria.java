public class ArvoreBinaria<T> {
	
	NoBinaria<T> [] tree;
	
	public ArvoreBinaria(NoBinaria<T>[] tree) {
		this.tree = tree;
	}
	
	public ArvoreBinaria() {
		tree =  new NoBinaria[10];
	}

	public NoBinaria<T> getElemento(int pos) {
		return tree[pos];
	}
	
	public NoBinaria<T> getFilhoEsq(NoBinaria<T> no) {
		if (no.getPosFilhoEsq() >= tree.length) return null;
		return tree[no.getPosFilhoEsq()];
	}
	
	public NoBinaria<T> getFilhoDir(NoBinaria<T> no) {
		if (no.getPosFilhoDir() >= tree.length) return null;
		return tree[no.getPosFilhoDir()];
	}
	
	public NoBinaria<T> getRaiz() {
		return tree[0];
	}
	
	public void preOrdem() {
		preOrdem(getRaiz());		
	}

	private void preOrdem(NoBinaria<T> no) {
		if (no != null) {
			System.out.println(no.getElemento());
			preOrdem(getFilhoEsq(no));
			preOrdem(getFilhoDir(no));
		}
		
	}

	public void posOrdem() {
		posOrdem(getRaiz());		
	}

	private void posOrdem(NoBinaria<T> no) {
		if (no != null) {
			posOrdem(getFilhoEsq(no));
			posOrdem(getFilhoDir(no));
			System.out.println(no.getElemento());
		}
		
	}

	
}
