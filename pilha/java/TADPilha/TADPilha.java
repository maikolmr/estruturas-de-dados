import java.util.Stack;

public class TADPilha {
	public static void main(String[] args) {
		Stack p1 = new Stack<String>();
		
		p1.push("A"); p1.push("B");
		p1.push("C"); p1.push("D");
		p1.push("E"); p1.push("F");
		
		p1.push(p1.pop()); p1.push(p1.pop());
		
		p1.pop(); p1.pop(); p1.pop();
		//System.out.println(p1);
		imprimirPilha(p1);
		imprimirPilha(p1);
		
		String v[] = {"A", "B", "C", "D", "E"};
		inverteVetorUsandoPilha(v);
		
		removerBasePilha(p1);
		
		inverterPilhaUsandoPilha(p1);
	}

	// inverter uma pilha usando apenas Pilha.
	private static void inverterPilhaUsandoPilha(Stack p1) {
		Stack<String> pAux1 = new Stack<String>();
		Stack<String> pAux2 = new Stack<String>();
		//DESAFIO: inverte a pilha original usando apenas *1* pilha auxiliar
	}

	// remover a base da pilha
	private static void removerBasePilha(Stack p1) {
		Stack<String> pAux = new Stack<String>();
	}

	// inverter um vetor usando Pilha.
	private static void inverteVetorUsandoPilha(String[] v) {
		Stack<String> pAux = new Stack<String>();
		
	}
	
	

	private static void imprimirPilha(Stack<String> p1) {
		Stack<String> pAux = new Stack<String>();
		while(!p1.isEmpty()) {
			pAux.push(p1.peek());
			System.out.println(p1.pop());
		}
		while (!pAux.isEmpty()) {
			p1.push(pAux.pop());
		}
	}
	
	// Usando uma Pilha implemente um método para inverter um vetor

}
