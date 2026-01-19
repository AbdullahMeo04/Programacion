import java.util.Scanner;

class Menu_interactiu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Num;

        do {
            // Show the menu
            System.out.println("\n--- MENÚ INTERACTIU ---");
            System.out.println("1. Mostrar un missatge de benvinguda.");
            System.out.println("2. Mostrar la data actual (simulada).");
            System.out.println("3. Realitzar una suma de dos nombres.");
            System.out.println("4. Sortir del programa.");
            System.out.print("Tria una opció (1-4): ");
            
            Num = scn.nextInt();

            // Handle user choice
            switch (Num) {
                case 1:
                    System.out.println("Benvingut al programa!");
                    break;

                case 2:
                    System.out.println("Avui és dimecres, 15 d’octubre de 2025."); // data simulada
                    break;

                case 3:
                    System.out.print("Introdueix el primer nombre: ");
                    int num1 = scn.nextInt();
                    System.out.print("Introdueix el segon nombre: ");
                    int num2 = scn.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La suma de " + num1 + " i " + num2 + " és: " + suma);
                    break;

                case 4:
                    System.out.println("Sortint del programa... Adéu!");
                    break;

                default:
                    System.out.println("Opció no vàlida. Torna-ho a provar.");
            }

        } while (Num != 4); // Repeat until user chooses 4
    }
}
