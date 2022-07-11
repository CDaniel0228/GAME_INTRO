
package DuoGame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Informacion extends Conexion{
    
    public boolean registrar(Partida crear) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO linea (Contrasena, Jugador1, Jugador2, Monedas, Correctas, Respuesta ) VALUES(?,?,?,?,?,?)";

        try {
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, crear.getContraseña());
            ps.setString(2, crear.getJugador1());
            ps.setString(3, crear.getJugador2());
            ps.setInt(4, crear.getMonedas());
            ps.setInt(5, crear.getCorrectas());
            ps.setBoolean(6, crear.getRespuesta());
            ps.execute();
            
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean modificar(Partida crear) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE linea SET Contrasena=?, Jugador1=?, Jugador2=?, Monedas=?, Correctas=?, Respuesta=? WHERE Contrasena=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, crear.getContraseña());
            ps.setString(2, crear.getJugador1());
            ps.setString(3, crear.getJugador2());
            ps.setInt(4, crear.getMonedas());
            ps.setInt(5, crear.getCorrectas());
            ps.setBoolean(6, crear.getRespuesta());
            ps.setString(7, crear.getContraseña());
            
            ps.executeUpdate();
            
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminar(Partida crear) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM linea WHERE Contrasena=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, crear.getContraseña());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean buscar(Partida crear) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM linea WHERE Contrasena=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, crear.getContraseña());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
               crear.setContraseña(rs.getString("Contrasena"));
               crear.setJugador1(rs.getString("Jugador1"));
               crear.setJugador2(rs.getString("Jugador2"));
               crear.setMonedas(rs.getInt("Monedas"));
               crear.setCorrectas(rs.getInt("Correctas"));
               crear.setRespuesta(rs.getBoolean("Respuesta"));
               
               return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
