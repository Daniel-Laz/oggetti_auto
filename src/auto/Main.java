package auto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        Auto a1 = new Auto("fiat","panda_diesel",3000);
        Auto a2 = new Auto("fiat","punto_benzina",3000);
        Auto a3 = new Auto("bmw","m4_benzina",29000);
        Auto a4 = new Auto("bmw","m5_benzina",30000);
        do{
            System.out.println("0 - termina programma\n" +
                    "1 - modifica dati auto\n" +
                    "2 - visualizza dati auto");
            n = in.nextInt();
            switch(n){
                case 1:
                    System.out.println("inserisci l'auto da modificare (a1,a2,a3,a4)\npoi inserisci i seguenti dati in ordine (marca ENTER modello ENTER prezzo ENTER)");
                    String auto = in.next();
                    if (auto.equals("a1")){
                        a1.setMarca(in.next());
                        a1.setModello(in.next());
                        a1.setPrezzo(in.nextInt());
                    }else if (auto.equals("a2")){
                        a2.setMarca(in.next());
                        a2.setModello(in.next());
                        a2.setPrezzo(in.nextInt());
                    }else if (auto.equals("a3")){
                        a3.setMarca(in.next());
                        a3.setModello(in.next());
                        a3.setPrezzo(in.nextInt());
                    }else if (auto.equals("a4")) {
                        a4.setMarca(in.next());
                        a4.setModello(in.next());
                        a4.setPrezzo(in.nextInt());
                    }
                    break;
                case 2:
                    System.out.println("inserisci l'auto da visualizzare (a1, a2, a3, a4)");
                    String auto1 = in.next();
                    if (auto1.equals("a1")){
                        System.out.println (a1.getMarca()+" - "+a1.getModello()+" - "+a1.getPrezzo());
                    }else if (auto1.equals("a2")){
                        System.out.println (a2.getMarca()+" - "+a2.getModello()+" - "+a2.getPrezzo());
                    }else if (auto1.equals("a3")){
                        System.out.println (a3.getMarca()+" - "+a3.getModello()+" - "+a3.getPrezzo());
                    }else if (auto1.equals("a4")) {
                        System.out.println (a4.getMarca()+" - "+a4.getModello()+" - "+a4.getPrezzo());
                    }
                    break;
            }
        }while(n != 0);
    }
}