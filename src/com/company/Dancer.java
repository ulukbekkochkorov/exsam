package com.company;

public class Dancer extends AbstractPerson {
    String groupName;

    public Dancer(String name, String disignatione, String groupName) {
        super(name, disignatione);
        this.groupName = groupName;
    }

    @Override
    public String abstractEat() {

        return (name+ " is vigitarian");
    }

    @Override
    public void learn() {
        System.out.println(name+ " is learning lezginka");
        }

    @Override
    public void walk() {
        System.out.println(name+ " is walking in the park");

    }
    String dancing () {
        return (name + " is dancing salsa");
    }
    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + name + '\'' +
                ", designatione='" + designatione + '\'' +
                ", groupName='" + groupName + '\'' +
                "} " + super.toString();
    }
}

