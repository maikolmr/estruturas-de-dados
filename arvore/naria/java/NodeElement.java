import java.util.LinkedList;
import java.util.List;

public class NodeElement {
	private String valor;
	private List<NodeElement> filhos;
	
	public NodeElement(String valor) {
		super();
		this.valor = valor;
		this.filhos = new LinkedList<NodeElement>();
	}
	
	public NodeElement adicionarFilho(String v) {
		if (this.getFilhos() == null) {
			this.filhos = new LinkedList<NodeElement>();
		}
		NodeElement filho = new NodeElement(v); 
		this.filhos.add(filho);
		return filho;
	}
	
	public List<NodeElement> getFilhos() {
		return filhos;
	}
	public void setFilhos(List<NodeElement> filhos) {
		this.filhos = filhos;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
}

// -------------------------------------------------