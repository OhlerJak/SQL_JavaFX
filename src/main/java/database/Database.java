package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static Database instance;

    static {
        try {
            instance = new Database();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Database getInstance() {
        return instance;
    }

    private Connection c;

    public Database() throws SQLException {
        c = DriverManager.getConnection("jdbc:derby://localhost:1527/CooleDB","app","password");
        // Create DB
        Statement s = c.createStatement();
        s.executeUpdate("CREATE TABLE IF NOT EXISTS Adresse(id int primary key, wohnort varchar(255));");
        s.executeUpdate("CREATE TABLE IF NOT EXISTS Person(id int primary key , name varchar(255), adresse int, foreign key (adresse) references Adresse(id));");
    }

    public Connection getConnection() {
        return c;
    }

    public Statement getStatement() throws SQLException {
        return c.createStatement();
    }
}
