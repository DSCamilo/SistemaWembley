
package control;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import vista.IU_AccederSistema;
import vista.IU_Principal;
import vista.IU_Productos;

public class Control_Usuario {
    
    Connection conexion;
    Statement sentencia;  //sentencias Query insert,update,delete
    ResultSet consulta;   //consultas   
    
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
     
}   
public void registrarusuario(String sql){
          
      try {
              sentencia = conexion.createStatement();
              int valor= sentencia.executeUpdate(sql);
              
              if (valor>0) {
                   JOptionPane.showMessageDialog(null,"Acción realizada");
                  
              }
              System.out.println("Valor = "+valor);
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "no se pudo registrar usuario "+sql);
              System.out.println(sql);
          }
          
    
}
public void iniciarsesion(String sql,String tipo){
        int resultado=0;
          IU_Productos tip=new IU_Productos();
        try {
            sentencia=conexion.createStatement();
            consulta=sentencia.executeQuery(sql);
            
            if (consulta.next()) {
                resultado=1;
                    if (resultado==1) {
                           IU_Principal principal=new IU_Principal();
                           principal.comprobarusuario(tipo);
                         
                           principal.setVisible(true);
                           IU_AccederSistema acceder=new IU_AccederSistema();
                           acceder.setVisible(false);
                           
                           tip.comprobarusuario(tipo);
                }
            }else{
                 JOptionPane.showMessageDialog(null,"Error, Usuario o contraseña erroneas");
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error");
        }
}
public String [] consultar(String sql){
     
      
               String tipo="";
    try {
              sentencia=conexion.createStatement();
              consulta=sentencia.executeQuery(sql);
             
              while(consulta.next()){
                  tipo=consulta.getString("tipo");
                 
                  
              }
              
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error");
          }
    return new String[]{tipo};
}
}
