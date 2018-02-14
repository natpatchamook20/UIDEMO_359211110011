package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class dbConnection {

    private static final String SOCONN ="jdbc:sqlite:school.sqlite";

    public static Connection getConnection(){

        try {

            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SOCONN);
        }catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;




        }



    }//getConection




