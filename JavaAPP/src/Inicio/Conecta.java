/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import javax.swing.JOptionPane;

public class Conecta {
    
       public static Connection getconn_OracleDebito() throws Exception{

            //Establece parametros de configuración para la base de datos
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String Host = "jdbc:oracle:thin:@serverName";
            String user = "C234831";
            String pass = "consola10";
            
            //Envia los valores de configuración de la base de datos
            return DriverManager.getConnection(Host, user, pass);
        }
        
        public static Connection getconn_OracleCredito() throws Exception{

            //Establece parametros de configuración para la base de datos
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String Host = "jdbc:oracle:thin:@ServerName";
            String user = "C234831";
            String pass = "consola10";
            
            //Envia los valores de configuración de la base de datos
            return DriverManager.getConnection(Host, user, pass);
        }
}
