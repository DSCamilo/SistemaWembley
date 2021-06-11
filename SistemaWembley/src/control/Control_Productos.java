
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Control_Productos {
    
    
     Connection conexion;
    Statement sentencia;  //sentencias Query insert,update,delete
    ResultSet consulta;   
    
    
    public void conectar(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conexion= DriverManager.getConnection("jdbc:mysql://bmi9ixewooj1cgxwyjx5-mysql.services.clever-cloud.com/bmi9ixewooj1cgxwyjx5","um14flkww8cqs7rc","wnlvWhjXbNLTAM3dOZLw");
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
              JOptionPane.showMessageDialog(null, "no se pudo registrar proveedor "+sql);
              System.out.println(sql);
          }
          
    
}
public String [] consultar(String sql){
      String datos[]=new String[4];
       String nom="",des="";
       String pre="",can="";
               String id="";
    try {
              sentencia=conexion.createStatement();
              consulta=sentencia.executeQuery(sql);
             
              while(consulta.next()){
                  id=String.valueOf(consulta.getInt("id_producto"));
                    nom=consulta.getString("nombre_p");
                    des=consulta.getString("descripcion");
                    pre=String.valueOf(consulta.getInt("precio"));
                    can=String.valueOf(consulta.getInt("cantidad"));
                
                  
              }
              
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error");
          }
    return new String[]{id,nom,des,pre,can};
}
public void eliminar(String sql){
    
    try {
              sentencia = conexion.createStatement();
              int valor= sentencia.executeUpdate(sql);
              
              if (valor>0) {
                   JOptionPane.showMessageDialog(null, "Acción realizada ");
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
                   JOptionPane.showMessageDialog(null, "Acción realizada");
              }
              System.out.println("Valor = "+valor);
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al modificar");
          }
          
       
        
    }
}
