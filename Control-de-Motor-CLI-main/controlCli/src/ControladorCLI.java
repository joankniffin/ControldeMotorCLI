import java.text.SimpleDateFormat;
import java.util.*;

public class ControladorCLI {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ControladorCLI obj = new ControladorCLI();
        String formattedDate = obj.fecha();
        System.out.println(formattedDate);

        int choice;
        do {
            menu();
            System.out.print("Elige una opción: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("El motor está girando a la derecha ");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("El motor está girando a la izquierda");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("El motor se ha detenido");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Adios!");
                    System.out.println("");
                    break;
                default:
                    System.out.println("No existe esa opción, por favor elige una opción válida");
                    System.out.println("");
            }
        } while (choice != 4);
    }

    public String fecha() {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy hh:mm aa");
        long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);
        String dateFormateada = formato.format(date);
        return dateFormateada;
    }

    public static void menu() {
        System.out.println("====================");
        System.out.println("== MENU ==");
        System.out.println("====================");
        System.out.println("1. Spin right");
        System.out.println("2. Spin left");
        System.out.println("3. Stop");
        System.out.println("4. Exit");
    }
}
