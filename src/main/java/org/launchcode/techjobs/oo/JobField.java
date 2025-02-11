package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
//    What fields do ALL FOUR of the classes have in common? id, nextid, value
//    Which constructors are the same in ALL FOUR classes?
//    What getters and setters do ALL of the classes share?
//    Which custom methods are identical in ALL of the classes?
private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }
    @Override
    public String toString() {
       if (this.value.isEmpty()) {
        return "Data not available";
        }
        return this.value;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        JobField.nextId = nextId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
