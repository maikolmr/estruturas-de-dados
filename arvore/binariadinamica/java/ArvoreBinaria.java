
import java.util.LinkedList;
import java.util.Queue;


public class ArvoreBinaria {
	No root; // No raiz 

	public No Create(Object x, No e, No  d) {
	 		 No Aux = new No(x);
			 Aux.esq = e;
	  		 Aux.dir = d;

	  		 return Aux;
	     }

	/*--------------- PERCURSOS -------------------- */

	public ArvoreBinaria() {
	   root = null;
	}

	public void Criar_Raiz(Object x)
	{
	   root = new No(x);
	}

	public boolean isEmpty()
	{
	  return root == null;
	}

	/*---------------------------------------------------------------*/
	public boolean verificarFolhaVogal(No N) {
		boolean retorno = false;
		if (N != null) {
			      if(N.esq == null && N.dir == null) {
			    	  if (N.Dado.equals("A") || N.Dado.equals("E") || N.Dado.equals("I")
			    			  || N.Dado.equals("O") || N.Dado.equals("U")) {
			    		  retorno = true;
			    	  }
			      }
			      retorno = retorno || verificarFolhaVogal(N.esq);
			      retorno = retorno || verificarFolhaVogal(N.dir);
		   }
		return retorno;
	}
	//------------------------------------------------------------------------------------
	
	public boolean numeroFolhasMaiorInternos(No n) {
		int contFolhas = contarFolhas(n);
		int contInterno = contarInternos(n);
		return contFolhas > contInterno;
	}
	
	public void InOrdem(No N) {

		   if (N != null) {
		      InOrdem(N.esq);
		      System.out.print(N.Dado + "   ");
		      InOrdem(N.dir);
		   }

		}
	
	public void PreOrdem(No N) {
	   if (N != null) {
	      System.out.print(N.Dado + "   ");
		  PreOrdem(N.esq); //1
	      PreOrdem(N.dir); //2
	   }

	}
	
//----------------------------------
	
	
	public void largura(No N) {
		Queue<No> fila = new LinkedList<No>();
		No aux = null;
		fila.add(N);
		while (!fila.isEmpty()) {
			System.out.println(fila.peek().Dado);
			aux = fila.poll();
			if(aux.esq != null) fila.add(aux.esq);
			if(aux.dir != null) fila.add(aux.dir);
		}
	}

	public void PosOrdem(No N) {

	   if (N != null) {
	    
	      PosOrdem(N.esq);
	      PosOrdem(N.dir);
	      System.out.print(N.Dado + "   ");
	   }

	}

	public void Euler(No N) {

	   if (N != null) {
	      System.out.print(N.Dado + "   ");//1
	      Euler(N.esq);
	      System.out.print(N.Dado + "   ");//2
	      Euler(N.dir);
	      System.out.print(N.Dado + "   ");//3
	   }

	}
	
	
	public static boolean verificarFolhasInterno(No raiz) {
		return (contarFolhas(raiz) > contarInternos(raiz));
	}
	
	// Contar o numero de nos internos da arvore binaria
	public static int contarInternos(No n) {
		int cont = 0;
		if (n != null) {
			cont += contarInternos(n.esq);
			cont += contarInternos(n.dir);
			if (n.esq != null || n.dir != null) cont++;
		}
		return cont;
	}
	
	////
	static int contPre=0;
	private void PreOrdemCont(No N) {
		   if (N != null) {
			  if (N.esq == null && N.dir == null) 
				  contPre++;
			  PreOrdemCont(N.esq); //1
		      PreOrdemCont(N.dir); //2
		   }
		}
	////
	public int ContarbyGambi(No N) {
		contPre=0;
		PreOrdem(N);
		return contPre;
				
	}

	// Contar o numero de nos Folhas da arvore binaria
	public static int contarFolhas(No n) {
		int cont = 0;
		if (n != null) {
			cont += contarFolhas(n.esq);
			cont += contarFolhas(n.dir);
			if (n.esq == null && n.dir == null) cont++;
		}
		return cont;
	}

	
	// irmao de um determinado no em uma árvore binária
	public No irmao(No raiz, final No noIrmao) {
		No irmao = null;
		if (raiz != null) {
			if (raiz.esq == noIrmao) irmao = raiz.dir;
			if (raiz.dir == noIrmao) irmao = raiz.esq;
			
			if (irmao == null) {
				irmao = irmao(raiz.esq, noIrmao);
				irmao = irmao(raiz.dir, noIrmao);
			}
		}
		return irmao;
	}
	
	// Contar o numero de nos da arvore binaria
	public int contar(No n) {
		int cont = 0;
		if (n != null) {
			cont = cont + contar(n.esq); //1
			cont = cont + contar(n.dir); //2
			cont++;
		}
		return cont;
	}

	static int i=0;
	public No Constroi(No T, String s) {

	 char dado = s.charAt(i++);
	 if (dado != '.') {
	          T = new No(new Character(dado));
	          T.esq = Constroi(T.esq, s);
	          T.dir = Constroi(T.dir, s);
	     } else T = null;
	     
	  return T;   
	}

	public int altura() {
		return altura(this.root, 0);
	}
	private int altura(No n, int a) {

	        int alturae = 0, alturad = 0;
	        
	        if (n != null) {
	            alturae = alturad = a;
	            alturae = Math.max(alturae, altura(n.esq, a + 1));
	            alturad = Math.max(alturad, altura(n.dir, a + 1));
	            System.out.println("Fator de Balanceamento: " + n.Dado + "  " + (alturae-alturad));
	        }
	        return ((alturae > alturad) ? alturae : alturad) ;
	}

	/*----------------------------------------------------------------*/

	public void Criar_Filho_Esquerdo(No pai, Object x) {
	   if (pai != null) {
	     if (pai.esq != null) System.out.println("Subárvore já existente "); 
	     else  pai.esq = new No(x);
	       
	   }
	}

	public void Criar_Filho_Direito(No pai, Object x) {
	   if (pai != null) {
	     if (pai.dir != null) System.out.println("Subárvore já existente ");
	     else  pai.dir = new No(x);
	       
	   }
	}

	public No Filho_Direito(No pai) {
		return pai.dir;
	}

	public No Filho_Esquerdo(No pai) {
		return pai.esq;
	}

	public static No copia(No T1, No T2) {
	    if (T1 != null) {
	       //System.out.println(T1.Dado + "\n");
	       T2 = new No(T1.Dado);
	       T2.esq = copia(T1.esq, T2.esq); //1
	       T2.dir = copia(T1.dir, T2.dir); //2
	    }
	    return T2;
	}

	void Descendentes(No N, Object el, boolean cond) {
	   
	    if (N != null) {
	    
	      if (cond) System.out.print(N.Dado + "   ");  
	      
	      if (N.Dado.equals(el)) cond = true; 
	      
	      
	      Descendentes(N.esq, el, cond);
	      Descendentes(N.dir, el, cond);
	   }

	}
	/*----------------------------------------------------------------------*/
	public static void main(String args[]) {

	  ArvoreBinaria T = new ArvoreBinaria();
	  ArvoreBinaria T2 = new ArvoreBinaria();

	  T.Criar_Raiz(new Integer(10));

	  T.Criar_Filho_Esquerdo(T.root, new Integer(15));
	  T.Criar_Filho_Direito(T.root, new Integer(12));
	  T.Criar_Filho_Esquerdo(T.root.esq, new Integer(4));
	  T.Criar_Filho_Direito(T.root.esq, new Integer(6));
//
	  T.Criar_Filho_Esquerdo(T.root.esq.esq, new Integer(10));
	  T.Criar_Filho_Esquerdo(T.root.esq.esq.esq, new Integer(0));
	  T.PreOrdem(T.root);
	  System.out.println("\n\n");
	  //T.InOrdem(T.root);
	  System.out.println("\n\n");
	  //T.Euler(T.root);
	  System.out.println("\nPos-Ordem: \n");
	  T.PosOrdem(T.root);
//	  System.out.println("\nIn-Ordem: \n");
//	  T.InOrdem(T.root);
//
//	  System.out.println("\nEuler-Ordem: \n");
//	  T.Euler(T.root);
//
//	  System.out.println("\nLargura-Ordem: \n");
//	  T.largura(T.root);

	  
	  //	  System.out.println("\n\n Altura: " + T.Altura(T.root, 0));
	  
	  //False
	  //T2.root = T2.Constroi(T2.root, "ABG..C.DE.F....");
	  //T2.root = T2.Constroi(T2.root, "AB..C..");
	  System.out.println("\n\nContar: " + T.contar(T.root));

	  System.out.println("\n\nAltura: " + T.altura());
	  //System.out.println("Contar: " + T2.contar(T2.root));
	  
	  //System.out.println(verificarFolhasInterno(T2.root));
	  
			//	  T2.PreOrdem(T2.root);
	  
//	  System.out.println("\n\n\n");
//	  T2.Descendentes(T2.root, 'D', false);
//
//	  System.out.println("\n\n");
//
//	  T.PreOrdem(T.root);
//	  System.out.println("\n\n");
//	  T.PosOrdem(T.root);
//	  System.out.println("\n\n --- ");
//	  T2.root = copia(T.root, T2.root);
//	  T2.PreOrdem(T2.root);
//	  System.out.println("\n\n");
	  }

}
