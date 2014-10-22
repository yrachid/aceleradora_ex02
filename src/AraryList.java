import java.util.ArrayList;

public class AraryList {

	public static void main(String[] args) {

		 ArrayList<String> listaAmigos = new ArrayList<>();
		 // Exercicio 1
		 listaAmigos.add("João");
		 listaAmigos.add("Lucas");
		 listaAmigos.add("Yasser");
		 listaAmigos.add("Orlindo");
		 listaAmigos.add("Jorge");
		 
		 //Exercicio 2
		 listaAmigos.remove(0);
		 
		 //Exercicio 3
		 listaAmigos.contains("Orlindo");
		
		 //Exercicio 4
		 listaAmigos.clear();		
		 listaAmigos.size();
		 
		 

		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();

		a.add(1);		
		a.add(2);		
		a.add(5);
		a.add(4);
		a.add(8);
		a.add(7);
		a.add(19);
		a.add(22);
		
		b.add(1);
		b.add(3);
		b.add(6);
		b.add(9);
		b.add(11);
		b.add(32);
		b.add(50);
		b.add(15);
		
		
		//Exercicio 5
		System.out.println("=================== 5 - Soma =======================");
		somaElementos(a);
		
		//Exercicio 6
		System.out.println("=================== 6 - Iguais =======================");
		for(boolean bool: iguais(a, b))
			System.out.println(bool);
			
		//Exercicio 7
		System.out.println("=================== 7 - Interseccao =======================");
		for(int i: interseccao(a, b))
			System.out.println(i);
		
		//Exercicio 8
		System.out.println("=================== 8 - União =======================");
		for (int i : uniao(a, b)) 
			System.out.println(i);
	
						
		//Exercicio 9
		System.out.println("=================== 9- Troca Valores =======================");
		for (int i : trocaValores(a)) 
			System.out.println(i);
		
		//Exercicio 10
		System.out.println("=================== 10 - Separar ímpares de pares =======================");
		for (int i : separaNumeros(a)) {
			System.out.println(i);
		}
		
		//Exercicio 11
		System.out.println("=================== 11 - Converter para binário =======================");
		for (int i : decimalParaBinario(7)) {
			System.out.print(i);
		}
		
		System.out.println();
		
		//Exercicio 12
		System.out.println("=================== 12 - Ordenar array crescente =======================");
		for (int i : ordenaCrescente(a)) {
			System.out.println(i);
		}
		

	}

	public static void somaElementos(ArrayList<Integer> num) {
		int cont = 0;
		for (int i : num) {
			cont += i;
		}

		System.out.println(cont);

	}

	public static ArrayList<Boolean> iguais(ArrayList<Integer> num,
			ArrayList<Integer> nume) {

		ArrayList<Boolean> resultado = new ArrayList<Boolean>();

		for (int i = 0; i < num.size(); i++) {
			if (num.get(i) == nume.get(i)) {
				resultado.add(true);
			} else {
				resultado.add(false);
			}
		}

		return resultado;
	}

	public static ArrayList<Integer> interseccao(ArrayList<Integer> a,
			ArrayList<Integer> b) {

		ArrayList<Integer> c = new ArrayList<>();

		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {
				if (a.get(i) == b.get(j)) {
					c.add(a.get(i));
				}
			}
		}

		return c;
	}

	public static ArrayList<Integer> uniao(ArrayList<Integer> a,
			ArrayList<Integer> b) {

		ArrayList<Integer> uniao = new ArrayList<Integer>();
		uniao.addAll(a);

		for (int i = 0; i < a.size(); i++) {
			if (!uniao.contains(b.get(i)))
				uniao.add(b.get(i));
		}
		return uniao;
	}

	public static ArrayList<Integer> trocaValores(ArrayList<Integer> a) {

		int maior = a.get(0);
		int menor = a.get(0);

		for (int i : a) {
			maior = Math.max(maior, i);
			menor = Math.min(menor, i);
		}

		int indiceMaior = a.indexOf(maior);
		int indiceMenor = a.indexOf(menor);

		a.set(indiceMaior, menor);
		a.set(indiceMenor, maior);

		return a;

	}

	public static ArrayList<Integer> separaNumeros(ArrayList<Integer> a) {
		ArrayList<Integer> b = new ArrayList<>();
		
		for (int i: a) {
			if (i % 2 == 0) {
				b.add(i);
				
			} else {
				b.add(0, i);
			}
		}

		return b;
	}
	
	public static ArrayList<Integer> decimalParaBinario(int i){
		
		ArrayList<Integer> binario = new ArrayList<Integer>();
		
		while(i>=1){
			
			binario.add(0, i%2);
			i = i/2;
		}
		
		return binario;
	}
	
	public static ArrayList<Integer> ordenaCrescente (ArrayList<Integer> a){
		int holder = 0;
		
		for(int i=0;i < a.size(); i++){
			for(int j=0;j<a.size(); j++){
				if(a.get(i) < a.get(j)){
					holder = a.get(j);					
					a.set(j, a.get(i));
					a.set(i, holder);
				}				
			}
		}
		
		return a;
	}

}
