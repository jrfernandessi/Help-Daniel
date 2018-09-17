import java.util.List;

public class Pilha {

	public void push(Integer valor, List<Integer> pilha) {
		pilha.add(valor);
	}

	public void pop(List<Integer> pilha) {
		pilha.remove(pilha.get(pilha.size() - 1));
	}

	public void trocarDePilha(List<Integer> origem, List<Integer> destino) {
		int valor = origem.get(origem.size() - 1);
		pop(origem);
		push(valor, destino);
	}

	public void print(List<Integer> pilha) {
		for (Integer aux : pilha) {
			System.out.println(aux);
		}
	}
}
