import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {
    public static void crear_Mensaje_DB(Mensajes mensaje) {
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps = null;        // crear insercion de datos
            try{
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("mensaje creado!!");
            }catch(SQLException ex){
                System.out.println("ex");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leer_mensajesDB(){
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection conexion = db_connect.get_connection()){
            String query = "SELECT * FROM mensajes";
            /*String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
            String query = "SELECT * FROM mensajes WHERE `id_mensaje` = ?";*/
            ps = conexion.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
                System.out.println("ID:"+ rs.getInt("id_mensaje"));
                System.out.println("Mensaje:"+ rs.getString("mensaje"));
                System.out.println("Autor:"+ rs.getString("autor_mensaje"));
                System.out.println("Fecha:"+ rs.getString("fecha_mensaje"));
                System.out.println("");
            }
        }catch (SQLException e){
            System.out.println("no se pudo recuperar los mensajes");
            System.out.println(e);
        }
    }
    public static void borrar_mensajeDB(int id_mensaje){
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection conexion = db_connect.get_connection()){
            try{
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                ps=conexion.prepareStatement(query);
                ps.setInt(1,id_mensaje);
                ps.executeUpdate();
                System.out.println("el mensaje a sido borrado");
            }catch(SQLException ex){
                System.out.println("ex");
                System.out.println("no se pudo recuperar los mensajes");
            }
        }catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void actualizar_mensajeDB(Mensajes mensaje){

    }

}
