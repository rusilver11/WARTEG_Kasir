/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siperpus;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Noobman
 */
public class MainClassKoneksi1 {

    /**
     * @param args the command line arguments
     */
    private static Statement statement;
    private static Connection koneksi;

    public static Connection getKoneksi() {

        if (koneksi == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/s2uas";
                String user = "root";
                String pass = "";
                koneksi = (Connection) DriverManager.getConnection(url, user,pass);
                System.out.println("Koneksi sukses");
            } catch (SQLException e) {
                System.out.println("Error Membuat Koneksi");
            } catch (ClassNotFoundException ex) {

                Logger.getLogger(MainClassKoneksi1.class.getName()).log(Level.SEVERE,
                        null, ex);
            }
        }
        return koneksi;
    }
    
    

}
