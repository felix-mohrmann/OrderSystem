package de.remteam.app;

public class Hardware implements Product{

    private final String name;
    private final int id;

    public Hardware(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getId() {
        return 0;
    }
}
