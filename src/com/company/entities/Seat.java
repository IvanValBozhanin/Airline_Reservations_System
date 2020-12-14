package com.company.entities;

public class Seat {
    private int id;
    private Class _class;
    private boolean taken;

    public Seat(int id, Class _class) {
        setTaken(false);
        set_class(_class);
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Class get_class() {
        return _class;
    }

    public void set_class(Class _class) {
        this._class = _class;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }
}
