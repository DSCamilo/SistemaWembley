
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Gestion_Proveedores {
    
     Connection conexion;
    Statement sentencia;  //sentencias Query insert,update,delete
    ResultSet consulta;   
    
    public void conectar(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conexion= DriverManager.getConnection("jdbc:mysql://localhost/base_wembley","root","");
            System.out.println("conexion exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro el driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro la base de datos");
        }
     
}   public void agregarproveedor(String sql){
    
      try {
              sentencia = conexion.createStatement();
              int valor= sentencia.executeUpdate(sql);
              
              if (valor>0) {
                   JOptionPane.showMessageDialog(null, "Proveedor registrado ");
              }
              System.out.println("Valor = "+valor);
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "no se pudo registrar proveedor "+sql);
              System.out.println(sql);
          }
          
    
}
}
