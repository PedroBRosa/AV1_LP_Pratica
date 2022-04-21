package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu =0,vogal = 0, consoante = 0,frase=0;
        String texto,referencia = "aeiouAEIOU",referenciaFrase=".!?";
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva seu texto: ");
        texto= ler.nextLine();
        //Contando as palavras
        String[] palavras = texto.split("\\s+");
        //Contando Vogal e Consoante
        for (int i = 0; i < texto.length(); i++) {
            if ((texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') || (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z')) {
                if (referencia.indexOf(texto.charAt(i)) != -1) {
                    vogal++;
                }
                else
                    consoante++;
            }
            if ((texto.charAt(i) == '!') || (texto.charAt(i) == '.')|| (texto.charAt(i) == '?'))
                frase++;
        }
        while (menu != 5) {
            System.out.println("=============        OPÇÕES       =============");
            System.out.println("1 - Número de Frases");
            System.out.println("2 - Número de Palavras");
            System.out.println("3 - Número de Vogais");
            System.out.println("4 - Número de Consoantes");
            System.out.println("5 - Sair");
            System.out.println("==============================================");
            System.out.println("==Por gentileza escolha uma opção de [1-5]: ==");
            System.out.println("==============================================");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("============= Número de Frases =============");
                    System.out.println("============= "+frase+" =============");

                    break;
                case 2:
                    System.out.println("============= Número de Palavras =============");
                    System.out.println("============= "+palavras.length+" =============");
                    break;
                case 3:
                    System.out.println("============= Número de Vogais =============");
                    System.out.println("============= "+vogal+" =============");

                    break;
                case 4:
                    System.out.println("=============Número de Consoantes =============");
                    System.out.println("============= "+consoante+" =============");
                    break;
                case 5:
                    System.out.println("SISTEMA ENCERRADO!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }
    }
}