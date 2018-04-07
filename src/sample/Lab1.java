package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.sql.*;

public class Lab1 {


    @FXML
    private Button opn;

    @FXML
    public void openDB(){
//sfvdf
            try {
                Class.forName("org.postgresql.Driver");
                String url = "jdbc:postgresql://80.93.62.246:3306/db_dsf_4";
                String login = "dbu_dsf_4";
                String password = "Ftg2856hQS";
                Connection con = DriverManager.getConnection(url, login, password);
                try {
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM zal_info");
                    while (rs.next()) {
                        String str = rs.getString("contact_id") + ":" + rs.getString(2);
                        System.out.println("Contact:" + str);
                    }
                    rs.close();
                    stmt.close();
                } finally {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

}
