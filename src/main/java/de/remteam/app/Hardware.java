package de.remteam.app;

import java.util.Objects;

public class Hardware implements Product{

    private final String name;
    private final int id;
    public String type;


    public Hardware(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return null;
    }

    public String getType() {
        return type;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int getStock() {
        return 0;
    }

    @Override
    public void addToStock(int stockEntrance) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hardware hardware = (Hardware) o;
        return id == hardware.id && Objects.equals(name, hardware.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return name;
    }
}
