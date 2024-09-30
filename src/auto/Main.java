package auto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        int contatore = 0;
        do{
            System.out.println("0 - termina programma" +
                    "1 - aggiungi auto" +
                    "2 - modifica dati auto" +
                    "3 - visualizza dati auto");
            n = in.nextInt();
            switch(n){
                case 1:
                    System.out.println("inserisci i seguenti dati dell'auto");


            }
        }while(n != 0);
    }
}