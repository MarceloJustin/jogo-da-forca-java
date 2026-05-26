package application;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> palavrasSecretas = new ArrayList<>();
		palavrasSecretas.add("cobra");
		palavrasSecretas.add("elefante");
		palavrasSecretas.add("girafa");

		Random random = new Random();
		int tamanhoDoArrayList = palavrasSecretas.size();
		int indiceDaPalavraAleatoriaGerada = random.nextInt(tamanhoDoArrayList);
		String palavraSecreta = palavrasSecretas.get(indiceDaPalavraAleatoriaGerada);

		ArrayList<Character> letrasDescobertas = new ArrayList<>();

		for (int i = 0; i < palavraSecreta.length(); i++) {
			letrasDescobertas.add('_');
		}

		int tentativas = 6;
		boolean palavraFoiDescoberta = false;

		while (!palavraFoiDescoberta && tentativas > 0) {
			System.out.println();
			System.out.println("Palavra: " + letrasDescobertas);
			System.out.print("Chute uma letra: ");
			char chute = sc.next().charAt(0);

			boolean acertou = false;
			for (int i = 0; i < palavraSecreta.length(); i++) {
				if (palavraSecreta.charAt(i) == chute) {
					letrasDescobertas.set(i, chute);
					acertou = true;
				}
			}

			if (!acertou) {
				tentativas--;
				System.out.println("Você tem mais: " + tentativas + " tentativas");
			}

			palavraFoiDescoberta = !letrasDescobertas.contains('_');
		}
		if (palavraFoiDescoberta) {
			System.out.println("Parabéns, você acertou! A Palavra era: " + palavraSecreta);
		} else {
			System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
		}
	}
}
