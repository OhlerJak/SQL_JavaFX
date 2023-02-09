package model;

import database.Database;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.SQLException;
import java.util.Collections;

public class Person {
    private final StringProperty vorname = new SimpleStringProperty();
    private final StringProperty wohnort = new SimpleStringProperty();
    private final StringProperty id = new SimpleStringProperty();

    public String getVorname() {
        return vorname.get();
    }

    public StringProperty vornameProperty() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname.set(vorname);
    }

    public String getWohnort() {
        return wohnort.get();
    }

    public StringProperty wohnortProperty() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort.set(wohnort);
    }

    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public ObservableList<Person> getPersonList() throws SQLException{
        Person[] data = Database.getInstance().getallData();


        return FXCollections.observableArrayList(data);
    }


    public int getIDasInt(){
        return Integer.parseInt(id.get());
    }
    public void setIDasInt(int id){
        setId(id+"");
    }
}
