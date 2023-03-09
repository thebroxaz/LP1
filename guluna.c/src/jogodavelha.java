import java.util.Scanner;

public class jogodavelha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha;
        char[][] tabuleiro = new char[3][3];
        System.out.println("Escolha 1 se quiser usar o caractere 'X' ou 2 se quiser usar o caractere 'O'");
        escolha = scanner.nextInt();
        System.out.println(escolha);
        while(escolha != 1 && escolha != 2){
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
        tabulas();
        char[] carac = {'X', 'O', 'X', 'O', 'X', 'O', 'X', 'O', 'X'};
        int p = 0;
        for (int u = 0; u < 9; u++) {
            System.out.println("Insira a linha e a coluna que deseja colocar o caractere:");
            int linha;
            linha = scanner.nextInt();
            int coluna = 1;
            coluna = scanner.nextInt();
            tabuleiro[linha][coluna] = carac[p];
            p++;
            System.out.println(tabuleiro);
        }

            tabulas();
            imprimirtabuleiro(tabuleiro);
    }


        public static void tabulas (){
            System.out.println("   0     1     2");
            System.out.println("0     |     |   ");
            System.out.println("  ---------------- ");
            System.out.println("1     |    |   ");
            System.out.println("  ---------------- ");
            System.out.println("2     |    |   ");
        }

        public static void imprimirtabuleiro (char[][] tabuleiro){
            System.out.println(" 0 | 1 | 2");
            for (int i = 0; i<3; i++) {
                System.out.println(i + " ");
                for (int j = 0; j<3; j++) {
                    System.out.println("|" + tabuleiro[i][j]);
                }
                System.out.println(" | ");
                System.out.println(" -----------");
            }

        }

        //while(!vitoria() || !empate()){

        //}

    }


