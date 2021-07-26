package de.remteam.app;

import java.util.Objects;

public interface Product {

    public String getName();

    public int getId();

    public int getStock();

    public void addToStock(int stockEntrance);
}