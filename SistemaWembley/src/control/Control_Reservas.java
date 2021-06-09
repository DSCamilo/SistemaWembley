package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Control_Reservas {

    Connection conexion;
    Statement sentencia;  //sentencias Query insert,update,delete
    ResultSet consulta;

    public void conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conexion = DriverManager.getConnection("jdbc:mysql://localhost/base_wembley", "root", "");
            System.out.println("conexion exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro el driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro la base de datos");
        }

    }

    public void agregarproducto(String sql) {

        try {
            sentencia = conexion.createStatement();
            int valor = sentencia.executeUpdate(sql);

            if (valor > 0) {
                JOptionPane.showMessageDialog(null, "Accion realizada ");
            }
            System.out.println("Valor = " + valor);
            System.out.println(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo registrar  " + sql);
            System.out.println(sql);
        }

    }

    public String[] consultar(String sql) {

        String id = "";
        String fecha = "";
        String hora = "";
        String nom = "";

        String doc = "";
        try {
            sentencia = conexion.createStatement();
            consulta = sentencia.executeQuery(sql);

            while (consulta.next()) {
                id = String.valueOf(consulta.getInt("id_reserva"));
                fecha = consulta.getString("fecha");
                hora = consulta.getString("hora");
                nom = consulta.getString("nombre");
                doc = String.valueOf(consulta.getInt("documento"));

            }
            System.out.println(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return new String[]{id, fecha, hora, nom, doc};
    }

    public void eliminar(String sql) {

        try {
            sentencia = conexion.createStatement();
            int valor = sentencia.executeUpdate(sql);

            if (valor > 0) {
                JOptionPane.showMessageDialog(null, "Eliminado ");
            }
            System.out.println("Valor = " + valor);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        }

    }

    public void modificar(String sql) {
        try {
            sentencia = conexion.createStatement();
            int valor = sentencia.executeUpdate(sql);

            if (valor > 0) {
                JOptionPane.showMessageDialog(null, "Modificado");
            }
            System.out.println("Valor = " + valor);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar");
        }

    }
}
