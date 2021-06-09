
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.IU_AccederSistema;
import vista.IU_ConsultarProveedor;
import vista.IU_Principal;


public class Control_Proveedores {
    
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
                    JOptionPane.showMessageDialog(null,"Acción realizada");
              }
              System.out.println("Valor = "+valor);
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "no se pudo registrar proveedor "+sql);
              System.out.println(sql);
          }
          
    
}
public String [] consultar(String sql){
      String datos[]=new String[4];
       String id="",nom="",tel="",corr="";
       String rrr;
    try {
              sentencia=conexion.createStatement();
              consulta=sentencia.executeQuery(sql);
             
              while(consulta.next()){
                 
                  id=String.valueOf(consulta.getInt("id_proveedor"));
                    nom=consulta.getString("nombre_e");
                  tel=String.valueOf(consulta.getString("telefono"));
                corr=consulta.getString("correo");
                  /*  datos[0]=id;
                  datos[1]=consulta.getString("nombre_e");
                  datos[2]=tel;
                  datos[3]=consulta.getString("correo");*/
                  
              }
               System.out.println(consulta.next());
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error");
          }
    return new String[]{id,nom,tel,corr};
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
