/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dasun
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class dbconnect {

    Connection conn = null;
    ResultSet rs ;
    PreparedStatement pst ;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrollerp", "root", "Dbhagyalabs@122456");
        //    Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dasun\\Desktop\\Finakle ERP Solution\\PayrollEmp\\payollerp.sqlite","root","");
            return conn;
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }   
    }
}
