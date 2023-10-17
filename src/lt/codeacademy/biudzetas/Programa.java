package lt.codeacademy.biudzetas;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Biudzetas biudzetas = new Biudzetas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to DefinitelyNotAScamBank, use 1 for income, 2 for expense, 3 to check balance, 4 to show income, 5 to show expenses, 6 to delete income line, 7 to delete expense line, 0 to close."); //cia irasyti banko komandas (sukurti metoda vietoj println)
            int button = scanner.nextInt();

            switch (button) {
                case 1:
                    IrasasDTO irasas1 = getPajamuIrasas(scanner);
                    biudzetas.pridetiPajamuIrasa(irasas1);
                    break;
                case 2:
                    IrasasDTO irasas2 = getIslaiduIrasas(scanner);
                    biudzetas.pridetiIslaiduIrasa(irasas2);
                    break;
                case 3:
                    System.out.println("Your balance is: " + biudzetas.balansas());
                    break;
                case 4:
                    biudzetas.rodytiPajamas();
                    break;
                case 5:
                    biudzetas.rodytiIslaidas();
                    break;
                case 6:
                    System.out.println("Iveskite iraso, kuri norite istrinti, id");
                    biudzetas.istrintiPajamuIrasa(scanner.nextInt());
                    break;
                case 7:
                    System.out.println("Iveskite iraso, kuri norite istrinti, id");
                    biudzetas.istrintiIslaiduIrasa(scanner.nextInt());
                    break;
                case 0:
                    System.out.println("Thank you for using DefinitelyNotAScamBank!");
                    scanner.close();
                    return; // return vietoj break, kad sustotu be error
                default:
                    System.out.println("Enter a valid command!");
                    break;
            }
        }
    }

    private static IrasasDTO getIrasas(Scanner sc) {

        IrasasDTO irasas = new IrasasDTO();
        System.out.println("Iveskite suma");
        irasas.setSuma(sc.nextInt());
        System.out.println("Iveskite kategorija");
        irasas.setKategorija(sc.next());
        System.out.println("Iveskite papildoma info");
        irasas.setPapildomaInfo(sc.next());
        return irasas;
    }

    private static IrasasDTO getPajamuIrasas(Scanner sc) {
        IrasasDTO pajamuIrasas = getIrasas(sc);
        System.out.println("Iveskite ar i banka");
        pajamuIrasas.setArIBanka(sc.nextBoolean());
        return pajamuIrasas;
    }

    private static IrasasDTO getIslaiduIrasas(Scanner sc) {
        IrasasDTO islaiduIrasas = getIrasas(sc);
        System.out.println("Iveskite atsiskaitymo buda");
        islaiduIrasas.setAtsiskaitymoBudas(sc.next());
        return islaiduIrasas;
    }
}