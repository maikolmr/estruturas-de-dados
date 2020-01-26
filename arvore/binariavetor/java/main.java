
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NoBinaria<String> n1 = new NoBinaria<String>(0, "A");
		NoBinaria<String> n2 = new NoBinaria<String>(1, "B");
		NoBinaria<String> n3 = new NoBinaria<String>(2, "C");
		NoBinaria<String> n4 = new NoBinaria<String>(3, "D");
		NoBinaria<String> n5 = new NoBinaria<String>(4, "E");
		NoBinaria<String> tree[] = new NoBinaria[5];
		tree[0] = n1;
		tree[1] = n2;
		tree[2] = n3;
		tree[3] = n4;
		tree[4] = n5;
		//{n1, n2, n3};
		ArvoreBinaria<String> t1 = new ArvoreBinaria<String>(tree);
		//Teste
		//System.out.println(t1.getRaiz().getElemento());
		//System.out.println(t1.getFilhoEsq(t1.getRaiz()).getElemento());
		//System.out.println(t1.getFilhoDir(t1.getRaiz()).getElemento());
		t1.preOrdem();
		t1.posOrdem();

	}

}
