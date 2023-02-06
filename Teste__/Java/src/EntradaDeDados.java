import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        try (var ler = new Scanner(System.in)) {
            String nome;

            System.out.println("Qual é o seu nome?\n");
            nome = ler.nextLine();

            System.out.printf("\nPrazer em te conhecer, %s!\n", nome);
        }
    }
}
