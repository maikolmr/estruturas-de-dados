
public class LDE {

	private DNode inicio;
	private DNode fim;
	private int tamanho;
	
	public LDE() {
		inicio = fim = null;
		tamanho = 0;
	}
	
	public int size() {
		return tamanho;
	}
	
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	public void inserir_pos(int pos, Object v) {
		if (pos < 0 || pos > tamanho) {
			System.out.println("POSICAO INVALIDA!!!!");
			return;
		}
		if (pos == 0) {
			inserirPrimeiro(v);
		} else if (pos == tamanho) {
			inserirUltimo(v);
		} else {
			DNode aux = inicio;
			for(int cont = 0; cont < pos-1; cont++) {
				aux = aux.getNext();
			}
			DNode novoNo = new DNode(v, aux, aux.getNext());
			aux.getNext().setPrev(novoNo);
			aux.setNext(novoNo);
			tamanho++;
		}
		
	}
	
	public Object remover_pos(int pos) {
		//TODO: Implementar o remover_pos
		return null;
	}
	
	public Object removerPrimeiro() {
		if (!isEmpty()) {
			Object retorno = inicio.getElement();
			inicio = inicio.getNext();
			tamanho--;
			if (isEmpty()) {
				fim = null;
			} else {
				inicio.setPrev(null);
			}
			return retorno;
		} else {
			return null;
		}
	}


	public void inserirPrimeiro(Object v) {
		DNode novoNo = new DNode(v, null, inicio);
		if (inicio != null) {
			inicio.setPrev(novoNo);
		} else {
			fim = novoNo;
		}
		inicio = novoNo;
		tamanho++;
	}
	
	// remover ultimo
	public Object removerUltimo() {
		if (!isEmpty()) {
			Object retorno = fim.getElement();
			fim = fim.getPrev();
			tamanho--;
			if (isEmpty()) {
				inicio = null;
			} else {
				fim.setNext(null);
			}
			return retorno;
		} else {
			return null;
		}
	}

	// inserir ultimo
	public void inserirUltimo(Object v) {
		DNode novoNo = new DNode(v, fim, null);
		if (isEmpty()) {
			inicio = novoNo;
		} else {
			fim.setNext(novoNo);
		}
		fim = novoNo;
		tamanho++;
	}
	
	public void imprimir() {
		DNode aux = inicio;
		while(aux != null) {
			System.out.print(aux.getElement() + " ");
			aux = aux.getNext();
		}
	}

	//Imprimir a LDE ao contrario
	public void imprimirContrario() {
		DNode aux = fim;
		while(aux != null) {
			System.out.print(aux.getElement() + " ");
			aux = aux.getPrev();
		}
	}

	
	// LIFE
	// Remover do meio (5 elementos - deletar 3)
	//Inserir no meio; (4 elementos - inserir depois do segundo
	// Verificar se a LDE tem elementos repetidos
	// Remover elementos repetidos da LDE
	// Supondo que a LDE tem elementos repetidos verificar qual é o elemento que mais se repete.
}
