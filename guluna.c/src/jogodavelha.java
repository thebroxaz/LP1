import java.util.Scanner;

public class jogodavelha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha;
        char[][] tabuleiro = new char[3][3];
        System.out.println("Escolha 1 se quiser usar o caractere 'X' ou 2 se quiser usar o caractere 'O'");
        escolha = scanner.nextInt();
        System.out.println(escolha);
        while (escolha != 1 && escolha != 2) {
            System.out.println("Insira um caractere válido, 1 ou 2:");
            escolha = scanner.nextInt();
        }
        switch (escolha) {
            case 1:
                System.out.println("Você usa 'X' e o outro jogador usa 'O'");
                System.out.println("");
                System.out.println("");

                break;
            case 2:
                System.out.println("Você usa 'O' e o outro jogador usa 'X'");
                System.out.println("");
                System.out.println("");
                break;
        }
        for (int loop = 0; loop < 9; loop++) {
            tabulas(tabuleiro);
            if (escolha == 1){
               char[] car = {'X','O','X','O','X','O','X','O','X'};
                System.out.println("Insira a linha e a coluna que deseja colocar o caractere:");
                int linha = scanner.nextInt();
                int coluna = scanner.nextInt();
                tabuleiro[linha][coluna] = car[loop];

            }else if(escolha == 2){
               char[] car = {'O','X','O','X','O','X','O','X','O',};
                System.out.println("Insira a linha e a coluna que deseja colocar o caractere:");
                int linha = scanner.nextInt();
                int coluna = scanner.nextInt();
                tabuleiro[linha][coluna] = car[loop];


            }

        }

    }


    public static void tabulas(char[][] tabuleiro) {
        Scanner scanner = new Scanner(System.in);
        int p = 0;
        char[] carac = {'X', 'O', 'X', 'O', 'X', 'O', 'X', 'O', 'X'};
        System.out.println("    0  1  2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + tabuleiro[i][j]);
            }
            System.out.println("|");
            System.out.println("  ----------");
        }

    }
}

