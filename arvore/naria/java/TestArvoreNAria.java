import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class TestArvoreNAria {


	public static void largura(NodeElement n) {
		
		Queue<NodeElement> fila = new LinkedList<NodeElement>();
		fila.add(n);
		
		while (!fila.isEmpty()) {
			System.out.print(fila.peek().getValor() + " "); //visita (frente(fila))
			
			NodeElement aux = fila.poll(); //desenfileirar
			
			for(NodeElement filho : aux.getFilhos()) {
				fila.add(filho);
			}
			
		}
	}

////
	public static void larguraDireita(NodeElement n) {
		
		Queue<NodeElement> fila = new LinkedList<NodeElement>();
		fila.add(n);
		
		while (!fila.isEmpty()) {
			System.out.print(fila.peek().getValor() + " "); //visita (frente(fila))
			
			NodeElement aux = fila.poll(); //desenfileirar
			
			List<NodeElement> filhos = aux.getFilhos(); 
			for(int i = filhos.size()-1; i >=0; i--) {
				fila.add(filhos.get(i));
			}
			
		}
	}

	
	public static void inOrdem(NodeElement n) {
		
			List<NodeElement> filhos = n.getFilhos();
			int i;
      		for(i = 0; i < filhos.size(); i++) {
				inOrdem(filhos.get(i));
				if (i == 0) {
					System.out.print(n.getValor() + " ");// visitar pai
				}
			}
      		//visita os folhas
      		if (i == 0) {
    				System.out.print(n.getValor() + " ");
      		}
	}
	
	// Visita todos os filhos menos o último depois o pai
	// e, por fim, o último filho.
public static void inOrdemModificado(NodeElement n) {
		
		if (n.getFilhos().size() == 0) { 
		 System.out.print(n.getValor() + " "); //visitar(n)
		} else {
			List<NodeElement> filhos = n.getFilhos();

			for(int i = 0; i < filhos.size(); i++) {
				if (i == filhos.size()-1) {
				  System.out.print(n.getValor() + " "); //visitar(n)
				}
				inOrdemModificado(filhos.get(i));
			}
			
		}
		
	}

// In Ordem a direita
public static void inOrdemADireita(NodeElement n) {
	
	if (n.getFilhos().size() == 0) { 
	 System.out.print(n.getValor() + " "); //visitar(n)
	} else {
		List<NodeElement> filhos = n.getFilhos();

		for(int i = filhos.size()-1; i >= 0; i--) {
			inOrdemADireita(filhos.get(i));
			if (i == filhos.size()-1) {
				  System.out.print(n.getValor() + " "); //visitar(n)
			}
		}
		
	}
	
}

	
	public static void posOrdem(NodeElement n) {
		
		for(NodeElement filho : n.getFilhos()) {
			posOrdem(filho);
		}
		System.out.print(n.getValor() + " "); //visitar(n)
	}

	
	public static void preOrdem(NodeElement n) {
		
		System.out.print(n.getValor() + " "); //visitar(n)
		
		for(NodeElement filho : n.getFilhos()) {
			preOrdem(filho);
		}
		
	}
	
	// PreOrdem a direita
	
	public static void preOrdemDireita(NodeElement n) {
		
		System.out.print(n.getValor() + " "); //visitar(n)
		List<NodeElement> filhos = n.getFilhos();

		for(int i = filhos.size()-1; i >= 0; i--) {
			preOrdemDireita(filhos.get(i));
		}
		
	}
/*
 * 
 */
	public static int posOrdemCont(NodeElement n) {
		int cont = 0;
		
		if (n.getFilhos().size() == 0) {
			cont = 1;
		}
		
		for(NodeElement filho : n.getFilhos()) {
			cont += posOrdemCont(filho);
		}
		
		return cont; //System.out.print(n.getValor() + " "); //visitar(n)
		
	}

	
	/**
	 * Quantidade de nÃ³s na Ãrvore.
	 */
		static int cont;
		
		public static int qtdNos(NodeElement n) {
			cont=0;
			qtdNosArvore(n);
			return cont;
		}
		
		private static void qtdNosArvore(NodeElement n) {
			NodeElement filho = null;
			for(int i = 0; i < n.getFilhos().size(); i++) {
				filho = n.getFilhos().get(i);
				qtdNosArvore(filho);
			}
			//System.out.print(n.getElemento() + " ");
			cont++;
			//return 0;
		}
		
		public static int preOrdemContadorERRADO(NodeElement n) {
			int cont = 0;
			//System.out.print(n.getValor() + " "); //visitar(n)
			cont++;
			for(NodeElement filho : n.getFilhos()) {
				preOrdemContadorERRADO(filho);
			}
			return cont;
			
		}
		
		/**
		 * FORMA ELEGANTE -- Quantidade de nÃ³s
		 * @param args
		 */
		public static int qtdNosRecursiva(NodeElement n) {
			int cont=0;
			
			NodeElement filho = null;
			for(int i = 0; i < n.getFilhos().size(); i++) {
				filho = n.getFilhos().get(i);
				cont = cont + qtdNosRecursiva(filho);
			}
            cont++;
			return cont;
		}

/**
 * 
 * @param n
 * @return
 */
		public static int grau(NodeElement n) {
			int grau=n.getFilhos().size();
			
			NodeElement filho = null;
			for(int i = 0; i < n.getFilhos().size(); i++) {
				filho = n.getFilhos().get(i);
				grau = Math.max(grau(filho), grau);
			}

			return grau;
		}
				

		public static int menor(NodeElement n) {
			int menor=Integer.parseInt(n.getValor());
			
			NodeElement filho = null;
			for(int i = 0; i < n.getFilhos().size(); i++) {
				filho = n.getFilhos().get(i);
				menor = Math.min((menor(filho)), menor);
			}

			return menor;
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NodeElement raiz = new NodeElement("1");
		NodeElement NoB = raiz.adicionarFilho("2");
		NodeElement NoC = raiz.adicionarFilho("3");
		NodeElement NoD = raiz.adicionarFilho("4");
		
		NoC.adicionarFilho("5");
		NoC.adicionarFilho("6");
		NoC.adicionarFilho("7");
		NoC.adicionarFilho("40");

		NoD.adicionarFilho("8");
		NoD.adicionarFilho("9");
		
		NoB.adicionarFilho("99");
		
//FIXME: FORMA DESACOPLADA -> ERRADA!!!!
//		posOrdemCont(raiz);
//		System.out.println("Numero de Nos:" + contador +  "\n\n\n");
//		posOrdemCont(raiz);
//		System.out.println("Numero de Nos:" + contador +  "\n\n\n");
		
		System.out.println(menor(raiz));
		
		System.out.println("conta: " + posOrdemCont(raiz));
		System.out.println("conta: " + posOrdemCont(raiz));

		
		System.out.println("PreOrdem: ");
		preOrdem(raiz);
		
		System.out.println("\n\n\nPosOrdem: ");
		posOrdem(raiz);

		System.out.println("\n\n\nLargura: ");
		largura(raiz);
		
		System.out.println("\n\n\nInOrdem: ");
		inOrdem(raiz);

		System.out.println("\n\n\nInOrdem Modificado: ");
		inOrdemModificado(raiz);
		
		System.out.println("\n\n\nInOrdem A direita: ");
		inOrdemADireita(raiz);

		System.out.println("\n\n\nPreOrdem A direita: ");
		preOrdemDireita(raiz);
		
		System.out.println("\n\n\nLargura A direita: ");
		larguraDireita(raiz);
		
		System.out.println("\n\nContador: " + qtdNosRecursiva(raiz));

		System.out.println("\n\n" + grau(raiz));
		
		System.out.println("\n\nPreOrdemContador: " + preOrdemContadorERRADO(raiz));
		
		//		raiz.getFilhos().get(1).adicionarFilho("E");
//		raiz.getFilhos().get(1).adicionarFilho("F");
//		raiz.getFilhos().get(1).adicionarFilho("G");
		
//		raiz.getFilhos().get(2).adicionarFilho("H");
//		raiz.getFilhos().get(2).adicionarFilho("I");

	}

}

//*****************************************************


