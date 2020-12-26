package ba.unsa.etf.rpr.projekat;

import javafx.beans.property.SimpleStringProperty;

public enum SprintsHurdlesRelays {
    _100m ("100m"),
    _200m ("200m");

    private SimpleStringProperty discipline;

    SprintsHurdlesRelays(String opis) {
        this.discipline = new SimpleStringProperty(opis);
    }

    public String getOpis() {
        return discipline.get();
    }

    public SimpleStringProperty opisProperty() {
        return discipline;
    }

    public void setOpis(String opis) {
        this.discipline.set(opis);
    }

    @Override
    public String toString() {
        return "" + discipline;
    }
}
