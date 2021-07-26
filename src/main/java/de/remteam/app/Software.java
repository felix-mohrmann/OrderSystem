package de.remteam.app;

import java.util.Objects;

public class Software implements Product {


    private final String name;
    private final int id;
    private String requirements;
    private int stock;

    public Software(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void addToStock(int stockEntrance) {
        this.stock += stockEntrance;
    }

    public String getRequirements() {
        return requirements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Software software = (Software) o;
        return id == software.id && Objects.equals(name, software.name);
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

