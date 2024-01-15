/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smarthome;
import java.sql.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class SmartHome {

      Connection conn = null;
    public static Connection getConnection () {
        try{
            Connection conn = DriverManager.getConnection ("jdbc:mariadb://localhost/iot", "iot", "iot");
            Logger.getLogger(SmartHome.class.getName()).log(Level.SEVERE, "MariaDB connected", "OK");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    } 
}
