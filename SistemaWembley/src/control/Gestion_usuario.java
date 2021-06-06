
package control;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.IU_AccederSistema;
import vista.PaginaPrincipal;

public class Gestion_usuario {
    
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
                   JOptionPane.showMessageDialog(null, "Usuario registrado ");
              }
              System.out.println("Valor = "+valor);
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "no se pudo registrar usuario "+sql);
              System.out.println(sql);
          }
          
    
}
public void iniciarsesion(String sql){
        int resultado=0;
        try {
            sentencia=conexion.createStatement();
            consulta=sentencia.executeQuery(sql);
            
            if (consulta.next()) {
                resultado=1;
                    if (resultado==1) {
                           PaginaPrincipal principal=new PaginaPrincipal();
                           principal.setVisible(true);
                           IU_AccederSistema aceder=new IU_AccederSistema();
                           aceder.setVisible(false);
                }
            }else{
                 JOptionPane.showMessageDialog(null,"Error, Usuario o contraseña erroneas");
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error");
        }
}
}
