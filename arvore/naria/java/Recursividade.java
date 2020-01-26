public class Recursividade {
	public static void main(String[] args) {
		int vetor[] = {1,2,3,4,5,6,7};
		//imprimir(vetor, 0);
		arvoreRecursao(1);
	}
	public static void imprimir(int v[], int pos) {
		if (pos < v.length) {
			System.out.print(v[pos] + "a ");
			imprimir(v, pos+1);
			System.out.print(v[pos] + "b ");
		}
	}
	public static void arvoreRecursao(int n) {
		if (n < 5) {
			arvoreRecursao(n+1);
			arvoreRecursao(n+2);
			System.out.println(n);

		}
	}
}
