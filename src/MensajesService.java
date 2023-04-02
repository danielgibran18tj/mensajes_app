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
        MensajesDAO.leer_mensajesDB();
    }
    public static void borrar_mensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("indica el ID del mensaje a borrar:");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrar_mensajeDB(id_mensaje);
    }
    public static void editar_mensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe tu nuevo mensaje:");
        String mensaje = sc.nextLine();
        System.out.println("nombre de nuevo autor:");
        String nombre = sc.nextLine();
        System.out.println("indica el ID del mensaje a editar:");
        int id_mensaje = sc.nextInt();

        Mensajes actualizacion = new Mensajes();
        actualizacion.setId_mensaje((id_mensaje));
        actualizacion.setMensaje(mensaje);
        actualizacion.setAutor_mensaje(nombre);
        MensajesDAO.actualizar_mensajeDB(actualizacion);
    }
}
