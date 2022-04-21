package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] cor = new String[10];
        String chave;
        int contAzul=0,contVermelha=0,contVerde=0;
        Scanner ler = new Scanner(System.in);
        for (int i=0;i< cor.length;i++){
            System.out.println("Escreva a cor da chave: ");
            chave= ler.nextLine();
            chave=chave.toUpperCase();
            cor[i]=chave;
            if(chave.equals("AZUL")){
                contAzul+=1;
                System.out.println("ir para a porta Azul");
                System.out.println("====================");
                System.out.println(" ");

            } else if (chave.equals("VERMELHA")||chave.equals("VERMELHO")) {
                contVermelha+=1;
                System.out.println("ir para a porta Vermelha");
                System.out.println("====================");
                System.out.println(" ");

            } else if (chave.equals("VERDE")) {
                contVerde+=1;
                System.out.println("ir para a porta Verde");
                System.out.println("====================");
                System.out.println(" ");

            }else{
                System.out.println("Procure novamente");
                System.out.println("====================");
                System.out.println(" ");
            }
        }
        System.out.println("Quantidade de pessoas com a chave azul: "+contAzul);
        System.out.println("Quantidade de pessoas com a chave vermelha: "+contVermelha);
        System.out.println("Quantidade de pessoas com a chave verde: "+contVerde);
    }
}
