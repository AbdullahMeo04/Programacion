import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Allotjament> list = new ArrayList<Allotjament>();        
        Scanner reader = new Scanner(System.in);

        list.add(new Habitacio("Room 101", 3));
        list.add(new Apartament("Blue Apartment", 4, 2, true));
        list.add(new CasaRural("Green Farmhouse", 6, true, false));        
        list.add(new Habitacio("Room 202", 1));
        list.add(new CasaRural("Can Soler", 8, true, true));

        int choice = 0;
        while (choice != 5) {
            System.out.println("\n--- Hotel Menu ---");
            System.out.println("1. Show available accommodations");       
            System.out.println("2. Reserve accommodation");
            System.out.println("3. Release accommodation");
            System.out.println("4. Custom Search");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            choice = reader.nextInt();
            reader.nextLine(); 

            switch (choice) {
                case 1:
                    for (int i = 0; i < list.size(); i++) {
                        Allotjament a = list.get(i);
                        if (a.isDisponible() == true) {
                            System.out.println(a.mostrarInformacio() + " - Price: " + a.calcularPreuPerNit() + " EUR");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter name to reserve: ");
                    String reserveName = reader.nextLine();
                    boolean reserveFound = false;
                    for (int i = 0; i < list.size(); i++) {
                        Allotjament a = list.get(i);
                        if (a.getNom().equalsIgnoreCase(reserveName)) {     
                            reserveFound = true;
                            if (a.reservar() == true) {
                                System.out.println("Reserved successfully."); 
                            } else {
                                System.out.println("Already occupied.");      
                            }
                        }
                    }
                    if (reserveFound == false) { System.out.println("Not found."); }
                    break;

                case 3:
                    System.out.print("Enter name to release: ");
                    String releaseName = reader.nextLine();
                    for (int i = 0; i < list.size(); i++) {
                        Allotjament a = list.get(i);
                        if (a.getNom().equalsIgnoreCase(releaseName)) {     
                            a.alliberar();
                            System.out.println("Released successfully.");     
                        }
                    }
                    break;

                case 4:
                    System.out.println("Search by: 1. Price | 2. Kitchen | 3. Pool");
                    int subChoice = reader.nextInt();
                    if (subChoice == 1) {
                        System.out.print("Max price: ");
                        double max = reader.nextDouble();
                        for (int i = 0; i < list.size(); i++) {
                            Allotjament a = list.get(i);
                            if (a.isDisponible() == true && a.calcularPreuPerNit() <= max) {
                                System.out.println(a.mostrarInformacio());
                            }
                        }
                    } else if (subChoice == 2) {
                        for (int i = 0; i < list.size(); i++) {
                            Allotjament a = list.get(i);
                            if (a instanceof Apartament && a.isDisponible()) {
                                Apartament apt = (Apartament) a;
                                if (apt.isTeCuina() == true) System.out.println(apt.mostrarInformacio());
                            }
                        }
                    } else if (subChoice == 3) {
                        for (int i = 0; i < list.size(); i++) {
                            Allotjament a = list.get(i);
                            if (a instanceof CasaRural && a.isDisponible()) {
                                CasaRural house = (CasaRural) a;
                                if (house.isTePiscina() == true) System.out.println(house.mostrarInformacio());
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
        reader.close(); 
    }
}