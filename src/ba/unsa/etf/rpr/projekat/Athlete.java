package ba.unsa.etf.rpr.projekat;

import javafx.beans.property.SimpleStringProperty;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Athlete {
    private SimpleStringProperty name;
    private SimpleStringProperty surname;
    private Date birthDate;
    private Map<AthleticDiscipline, String> personalRecords;

    public Athlete(String name, String surname, Date birthDate) {
        this.name = new SimpleStringProperty(name);
        this.surname = new SimpleStringProperty(surname);
        this.birthDate = birthDate;
        personalRecords = new HashMap<>();
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getSurname() {
        return surname.get();
    }

    public SimpleStringProperty surnameProperty() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Map<AthleticDiscipline, String> getPersonalRecords() {
        return personalRecords;
    }

    public void setPersonalRecords(Map<AthleticDiscipline, String> personalRecords) {
        this.personalRecords = personalRecords;
    }
}
