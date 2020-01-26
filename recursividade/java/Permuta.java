import java.util.Scanner;

public class Permuta {

	public static void permuta(String p, String s) {
	    int n = s.length();

	    if (n == 0)
	        System.out.print(p + " ");
	    else
	        for (int i = 0; i < n; i++)
	            permuta(p + s.charAt(i), s.substring(0, i) + s.substring(i+1));
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String conjunto;

		System.out.print("Informe um conjunto de s�mbolos a ser permutado: ");
		conjunto = entrada.next();

		System.out.print("Permuta��es: ");
		permuta("", conjunto);
	}
}