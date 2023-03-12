import java.util.Scanner;
public class jogodavelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        char[][] tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
        System.out.println();
        System.out.println("Escolha 1 se quiser usar o caractere 'X' ou 2 se quiser usar o caractere 'O'");
        escolha = scanner.nextInt();
        System.out.println(escolha);
        while (escolha != 1 && escolha != 2) {
            System.out.println("Insira um caractere válido, 1 ou 2:");
            escolha = scanner.nextInt();
        }
        switch (escolha) {
            case 1:
                System.out.println("Você é o jogador 1 e usa 'X'. O jogador 2 usa 'O'");
                System.out.println("");
                System.out.println("");
                break;
            case 2:
                System.out.println("Você é o jogador 2 e usa 'O'. O jogador 1 usa 'X'");
                System.out.println("");
                System.out.println("");
                break;
        }
        for (int loop = 0; loop < 9; loop++) {
            tabulas(tabuleiro);
            if (escolha == 1) {
                char[] car = {'X', 'O', 'X', 'O', 'X', 'O', 'X', 'O', 'X'};
                System.out.println("Insira a linha e a coluna que deseja colocar o caractere:");
                int linha = scanner.nextInt();
                int coluna = scanner.nextInt();
                tabuleiro[linha][coluna] = car[loop];
            } else if (escolha == 2) {
                char[] car = {'O', 'X', 'O', 'X', 'O', 'X', 'O', 'X', 'O',};
                System.out.println("Insira a linha e a coluna que deseja colocar o caractere:");
                int linha = scanner.nextInt();
                int coluna = scanner.nextInt();
                tabuleiro[linha][coluna] = car[loop];
            }
            verificacoes(tabuleiro);
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
    public static void verificacoes(char[][] t) {
        String guardar = "  ";
        boolean teste0 = (t[0][0] == 'X' && t[0][1] == 'X' && t[0][2] == 'X');
        boolean teste1 = (t[1][0] == 'X' && t[1][1] == 'X' && t[1][2] == 'X');
        boolean teste2 = (t[2][0] == 'X' && t[2][1] == 'X' && t[2][2] == 'X');
        boolean teste3 = (t[0][0] == 'X' && t[1][0] == 'X' && t[2][0] == 'X');
        boolean teste4 = (t[0][1] == 'X' && t[1][1] == 'X' && t[2][1] == 'X');
        boolean teste5 = (t[0][2] == 'X' && t[1][2] == 'X' && t[2][2] == 'X');
        //diagonais
        boolean teste6 = (t[0][0] == 'X' && t[1][1] == 'X' && t[2][2] == 'X');
        boolean teste7 = (t[2][0] == 'X' && t[1][1] == 'X' && t[0][2] == 'X');
        //testes
        boolean este0 = (t[0][0] == 'O' && t[0][1] == 'O' && t[0][2] == 'O');
        boolean este1 = (t[1][0] == 'O' && t[1][1] == 'o' && t[1][2] == 'o');
        boolean este2 = (t[2][0] == 'O' && t[2][1] == 'O' && t[2][2] == 'O');
        boolean este3 = (t[0][0] == 'O' && t[1][0] == 'O' && t[2][0] == 'O');
        boolean este4 = (t[0][1] == 'O' && t[1][1] == 'O' && t[2][1] == 'O');
        boolean este5 = (t[0][2] == 'o' && t[1][2] == 'o' && t[2][2] == 'O');
        //diagonais
        boolean este6 = (t[0][0] == 'O' && t[1][1] == 'O' && t[2][2] == 'O');
        boolean este7 = (t[2][0] == 'O' && t[1][1] == 'o' && t[0][2] == 'O');
        //testes
        if (teste0) {
            System.out.println("Jogador 1 ganhou!!!");
        } else if (teste1) {
            System.out.println("Jogador 1 ganhou!!!");
        } else if (teste2) {
            System.out.println("Jogador 1 ganhou!!!");
        } else if (teste3) {
            System.out.println("Jogador 1 ganhou!!!");
        } else if (teste4) {
            System.out.println("Jogador 1 ganhou!!!");
        } else if (teste5) {
            System.out.println("Jogador 1 ganhou!!!");
        } else if (teste6) {
            System.out.println("Jogador 1 ganhou!!!");
        } else if (teste7) {
            System.out.println("Jogador 1 ganhou!!!");
        } else if (este0) {
            System.out.println("Jogador 2 ganhou!!!");
        } else if (este1) {
            System.out.println("Jogador 2 ganhou!!!");
        } else if (este2) {
            System.out.println("Jogador 2 ganhou!!!");
        } else if (este3) {
            System.out.println("Jogador 2 ganhou!!!");
        } else if (este4) {
            System.out.println("Jogador 2 ganhou!!!");
        } else if (este5) {
            System.out.println("Jogador 2 ganhou!!!");
        } else if (este6) {
            System.out.println("Jogador 2 ganhou!!!");
        } else if (este7) {
            System.out.println("Jogador 2 ganhou!!!");
        }
    }
}


