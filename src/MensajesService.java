import java.util.Scanner;

public class MensajesService {
    public static void crear_mensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("tu nombre:");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crear_Mensaje_DB(registro);
    }
    public static void listar_mensaje(){

    }
    public static void borrar_mensaje(){

    }
    public static void editar_mensaje(){

    }
}
