package map;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import map.Tile;

import java.util.HashMap;
import java.io.Serializable;

class Location implements Serializable {
    private final long serialVersionID;
    private final int locationID;
    private String name;
    private String description;
    private List<ArrayList<Tile>> grid;
    private int length;
    private int height;

    public Location(String name) {
        this.serialVersionID = 1L;
        this.locationID = 0;
        this.name = name;
        this.grid = new ArrayList<ArrayList<Tile>>();
    }
    public String getName() {
        return name;
    }
    public int getLength() {
        return length;
    }
    public int getHeight() {
        return height;
    }
}