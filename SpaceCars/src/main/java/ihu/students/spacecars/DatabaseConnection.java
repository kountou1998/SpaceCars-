package ihu.students.spacecars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    public static Connection databaseLink;
    public static Statement statement;
    public static Connection getDBConnection() {
        String url = "jdbc:postgresql://dblabs.iee.ihu.gr:5432/";
        String username = "it185263";
        String passwd = "Tbd2022!";
        try{
            Class.forName("org.postgresql.Driver");
            databaseLink = DriverManager.getConnection(url, username, passwd);
            statement = databaseLink.createStatement();

            statement.execute("CREATE OR REPLACE FUNCTION add_car(int, varchar, varchar, int, int) RETURNS VOID AS $$" +
                    "INSERT INTO CARS (" +
                    "CARID," +
                    "MAKE," +
                    "MODEL," +
                    "YEAR," +
                    "PRICE" +
                    ") VALUES ($1, $2, $3, $4, $5) "+
                    "$$ LANGUAGE SQL;");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return databaseLink;
    }
}
