// package task_3;

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int opcio;

//         do {
//             System.out.println("--- Creador de Figures ---");
//             System.out.println("Quin objecte vols crear?");
//             System.out.println(
//                     "1. Triangle\n2. Quadrat\n3. Rectangle\n4. Trapezi\n5. Rombe\n6. Paral·lelogram\n7. Cercle\n0. Sortir");
//             System.out.print("Opció: ");
//             opcio = sc.nextInt();

//             if (opcio >= 1 && opcio <= 7) {
//                 Figura f = null;
//                 boolean usaConstructoraBasica = Math.random() < 0.5;

//                 if (usaConstructoraBasica) {
//                     System.out.println("[INFO] Utilitzant constructora BÀSICA.");
//                     switch (opcio) {
//                         case 1:
//                             f = new Triangle();
//                             break;
//                         case 2:
//                             f = new Quadrat();
//                             break;
//                         case 3:
//                             f = new Rectangle();
//                             break;
//                         case 4:
//                             f = new Trapezi();
//                             break;
//                         case 5:
//                             f = new Rombe();
//                             break;
//                         case 6:
//                             f = new Pararllelogram();
//                             break;
//                         case 7:
//                             f = new Cercle();
//                             break;
//                     }
//                     f.llegirDades(sc);
//                 } else {
//                     System.out.println("[INFO] Utilitzant constructora COMPLEXA.");
//                     switch (opcio) {
//                         case 1:
//                             System.out.print("Introdueix base i altura (separats per espai): ");
//                             f = new Triangle(sc.nextInt(), sc.nextInt());
//                             break;
//                         case 2:
//                             System.out.print("Introdueix el costat: ");
//                             f = new Quadrat(sc.nextInt());
//                             break;
//                         case 3:
//                             System.out.print("Introdueix costat 1 i costat 2: ");
//                             f = new Rectangle(sc.nextInt(), sc.nextInt());
//                             break;
//                         case 4:
//                             System.out.print("Introdueix base menor, base major i altura: ");
//                             f = new Trapezi(sc.nextInt(), sc.nextInt(), sc.nextInt());
//                             break;
//                         case 5:
//                             System.out.print("Introdueix diagonal major i diagonal menor: ");
//                             f = new Rombe(sc.nextInt(), sc.nextInt());
//                             break;
//                         case 6:
//                             System.out.print("Introdueix base i altura: ");
//                             f = new Pararllelogram(sc.nextInt(), sc.nextInt());
//                             break;
//                         case 7:
//                             System.out.print("Introdueix el radi: ");
//                             f = new Cercle(sc.nextInt());
//                             break;
//                     }
//                 }

//                 if (f != null) {
//                     f.imprimirDades();
//                 }
//             }
//         } while (opcio != 0);

//         sc.close();
//         System.out.println("Programa finalitzat.");
//     }
// }

package task_3;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(24, 23);

        Quadrat quadrat = new Quadrat(3);
        Rectangle rectangle = new Rectangle();
        rectangle.setCostat1(6);
        rectangle.setCostat2(8);
        Trapezi trapezi = new Trapezi(10, 15, 18);
        Rombe rombe = new Rombe(12, 8);
        Pararllelogram paral = new Pararllelogram(5, 10);
        Cercle cercle = new Cercle(23);

        triangle.imprimirDades();
        quadrat.imprimirDades();
        rectangle.imprimirDades();
        trapezi.imprimirDades();
        rombe.imprimirDades();
        paral.imprimirDades();
        cercle.imprimirDades();
    }
}