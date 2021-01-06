import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    HashLinear tab = new HashLinear(250);
    Scanner le = new Scanner(System.in);
    double item;

    System.out.println("\n*********************************************************************");
    System.out.println("Tabela HASH com tratamento de colisoes Linear (7 itens reais - double)");
    System.out.print("*********************************************************************");
    // 
    int v[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547};
    
    for (int i=0; i<99; i++){
	     //System.out.print("\n\nInserindo elemento " + (i+1) );
	     //System.out.print(" - Forneca valor real: ");
	     //item = le.nextDouble();
    	tab.insere(v[i]);
    }

    //System.out.print("\n\nBuscando campo\n>>> Forneca o item: ");
    //item = le.nextDouble();
    //if ( tab.busca(item) != -1 )
    //   System.out.print("Item encontrado na posicao " + tab.busca(item));
   // else
   //    System.out.print("Item nao encontrado");
	
    //System.out.print("\n\nApagando campo\n>>> Forneca o item: ");
    //item = le.nextDouble();
    //tab.apaga(item);
	
    System.out.print("\n\nImprimindo conteudo");
    tab.imprime();

    System.out.println("\n");
  }
}