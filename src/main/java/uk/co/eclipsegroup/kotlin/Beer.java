package uk.co.eclipsegroup.kotlin;

import java.util.Objects;

public class Beer {
    private final String name;
    private final String type;
    private final int ibu;

    public Beer(String name, String type, int ibu) {
        this.name = name;
        this.type = type;
        this.ibu = ibu;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getIbu() {
        return ibu;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", ibu=" + ibu +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beer beer = (Beer) o;
        return ibu == beer.ibu && Objects.equals(name, beer.name) && Objects.equals(type, beer.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, ibu);
    }
}
