import java.util.ArrayList;
import java.util.List;



public class Principal {
	public static void main(String[] args) {
		List<Integer> pilha1 = new ArrayList<>();
		List<Integer> pilha2 = new ArrayList<>();
		
		Pilha pilha = new Pilha();
		
		pilha.push(2, pilha1);
		pilha.push(4, pilha1);
		System.out.println("pilha 1");
		pilha.print(pilha1);
		
		pilha.trocarDePilha(pilha1, pilha2);
		pilha.trocarDePilha(pilha1, pilha2);
		System.out.println("pilha 2");
		pilha.print(pilha2);
	}
	
}
