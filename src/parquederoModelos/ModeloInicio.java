package parquederoModelos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class ModeloInicio {
    
    private String placa;
    private String servidor="jdbc:mysql://localhost/parqueadero";
    private String usuario="root";
    private String password="";

    public ModeloInicio() {
    }
    
    public Connection conectarBD(){
        
        Connection conexion = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(servidor,usuario,password);
            System.out.println("Exito conectandonos");
            return conexion;
            
        }catch(Exception error){            
            System.out.println("No se pudo conectar a la base de datos. "+error);
            return null;
        }
    }

    public String getServidor() {
        return servidor;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }
}
