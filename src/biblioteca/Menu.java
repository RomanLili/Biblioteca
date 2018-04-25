
import java.util.Scanner;


public class Menu {
    
    public static int desplegarMenu (String texto, int max) {
        Scanner sc = new Scanner(System.in);
    int opcion;
   do {
       System.out.println(texto);
       opcion =sc.nextInt();
       if (opcion < 1 || opcion > max)
        System.out.println("Error: opcion no valida...\n");
   } while (opcion < 1 || opcion > max);
   return opcion;
}
    
    
}
