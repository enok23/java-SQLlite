/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grstionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author RLCR
 */
public class GestionBD {
    
    Connection conexion =null;
    Statement  sentencia =null;
    ResultSet resultados =null;
    String nombrebd= "empresa.sqlite";
    String driver = "org.sqlite.JDBC";
    String URL = "jdbc:sqlite:"+nombrebd;
    
    public void crearBD(){
        
        try{
            Class.forName(driver);
            conexion =DriverManager.getConnection(URL);
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("error" + e.getMessage());
       }
        System.out.println("base de datos creada con exito");
    }
    
    
}
