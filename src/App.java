import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Alcancia Mon = new Alcancia();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
            
            System.out.println("MENU ALCANCIA");
            System.out.println("1. INGRESAR MONEDAS $50");
            System.out.println("2. INGRESAR MONEDAS $100");
            System.out.println("3. INGRESAR MONEDAS $200");
            System.out.println("4. INGRESAR MONEDAS $500");
            System.out.println("5. INGRESAR MONEDAS $1000");
            System.out.println("6. CANTIDAD DE MONEDAS");
            System.out.println("7. CANTIDAD DE DINERO");
            System.out.println("8. CANTIDAD DE MONEDAS POR DENOMINACION");
            System.out.println("9. CANTIDAD DE DINERO POR DENOMINACION");
            System.out.println("0. SALIR");
            System.out.println("");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 0:
                        salir = true;
                    case 1:
                        System.out.println("DIGITE NUMERO MONEDAS");
                        Mon.setM_50(sn.nextInt());
                        break;
                    case 2:
                        System.out.println("DIGITE NUMERO MONEDAS");
                        Mon.setM_100(sn.nextInt());
                        break;
                    case 3:
                        System.out.println("DIGITE NUMERO MONEDAS");
                        Mon.setM_200(sn.nextInt());
                        break;
                    case 4:
                        System.out.println("DIGITE NUMERO MONEDAS");
                        Mon.setM_500(sn.nextInt());
                        break;
                    case 5:
                        System.out.println("DIGITE NUMERO MONEDAS");
                        Mon.setM_1000(sn.nextInt());
                        break; 
                    case 6:
                        System.out.println("TOTAL DE MONEDAS : " + Mon.Tot_Monedas());
                        break;
                    case 7:
                        System.out.println("TOTAL EN DINERO : " + Mon.Tot_dinero());
                        break;
                    case 8:
                        System.out.println("1. MONEDAS $50");
                        System.out.println("2. MONEDAS $100");
                        System.out.println("3. MONEDAS $200");
                        System.out.println("4. MONEDAS $500");
                        System.out.println("5. MONEDAS $1000");
                        System.out.println("Escribe una de las opciones");
                        System.out.println("TOTAL DE MONEDAS : " + Mon.Tot_Monedas_Denominacion(sn.nextInt()));
                        break;
                    case 9:
                        System.out.println("1. INGRESAR MONEDAS $50");
                        System.out.println("2. INGRESAR MONEDAS $100");
                        System.out.println("3. INGRESAR MONEDAS $200");
                        System.out.println("4. INGRESAR MONEDAS $500");
                        System.out.println("5. INGRESAR MONEDAS $1000");
                        System.out.println("Escribe una de las opciones");
                        System.out.println("TOTAL EN DINERO : " + Mon.Tot_Dinero_Denominacion(sn.nextInt()));
                        break;                     
                }
                System.out.println("");
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
