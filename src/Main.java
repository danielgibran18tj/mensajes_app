import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("----------------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. crear mensaje");
            System.out.println("2. listar mensajes");
            System.out.println("3. editar mensajes");
            System.out.println("4. eliminar mensajes");
            System.out.println("5. salir");
            //leemos la opcion del usuario
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    MensajesService.crear_mensaje();
                    break;
                case 2:
                    MensajesService.listar_mensaje();
                    break;
                case 3:
                    MensajesService.editar_mensaje();
                    break;
                case 4:
                    MensajesService.borrar_mensaje();
                    break;
                default:
                    break;
            }
        }while(opcion != 5);

    }}