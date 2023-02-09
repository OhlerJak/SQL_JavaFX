package database;

import model.Person;

import java.sql.*;
import java.util.List;

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
        c = DriverManager.getConnection("jdbc:derby://localhost:1527/PersonDB;create=true","app","password");
        // Create DB
        Statement s = c.createStatement();
        try{
            s.executeUpdate("CREATE TABLE Adresse(id int primary key, wohnort varchar(255));");
            s.executeUpdate("CREATE TABLE Person(id int primary key , name varchar(255), adresse int, foreign key (adresse) references Adresse(id));");
        }catch (SQLException e){
            // Passt schon ...
        }
    }

    public Connection getConnection() {
        return c;
    }

    public void insertAdresse(){
//        PreparedStatement ps = c.prepareStatement()
        // PreparedStatement ps = c.createStatement()
    }


    public Person[] getallData() throws SQLException{
        PreparedStatement ps = c.prepareStatement("SELECT * FROM Person p INNER JOIN Adresse a ON a.id=p.adresse");
        ResultSet rs = ps.executeQuery();
        System.out.println(rs);;
        return null;
    }
}
