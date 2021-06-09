
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Control_Ventas {
    
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
     
}   public void agregarproducto(String sql){
    
      try {
              sentencia = conexion.createStatement();
              int valor= sentencia.executeUpdate(sql);
              
              if (valor>0) {
                   JOptionPane.showMessageDialog(null, "Accion realizada ");
              }
              System.out.println("Valor = "+valor);
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "no se pudo registrar  "+sql);
              System.out.println(sql);
          }
          
    
}
public String [] consultar(String sql){
      String datos[]=new String[4];
       String nombrep="";
        String precio="";
       String cantidad="";
       String total="";
       String nombrec="";
       String documentoc="";
    try {
              sentencia=conexion.createStatement();
              consulta=sentencia.executeQuery(sql);
             
              while(consulta.next()){
                  nombrep=consulta.getString("nombre_p");
                    precio=String.valueOf(consulta.getString("precio"));
                    cantidad=String.valueOf(consulta.getString("cantidad"));
                    total=String.valueOf(consulta.getInt("total"));
                    nombrec=consulta.getString("nombre_c");
                    documentoc=String.valueOf(consulta.getInt("documento_c"));
                
                  System.out.println(sql);
              }
                
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error");
               
          }
    return new String[]{nombrep,precio,cantidad,total,nombrec,documentoc};
}
public void eliminar(String sql){
    
    try {
              sentencia = conexion.createStatement();
              int valor= sentencia.executeUpdate(sql);
              
              if (valor>0) {
                   JOptionPane.showMessageDialog(null, "Eliminado ");
              }
              System.out.println("Valor = "+valor);
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al eliminar");
          }
          
}
 public void modificar(String sql){
          try {
              sentencia = conexion.createStatement();
              int valor= sentencia.executeUpdate(sql);
              
              if (valor>0) {
                   JOptionPane.showMessageDialog(null, "Modificado");
              }
              System.out.println("Valor = "+valor);
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al modificar");
          }
          
       
        
    }
}
