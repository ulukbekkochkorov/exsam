package com.company;

public abstract class AbstractPerson implements Walkable,Learnable {

        String name;
        String designatione;

        public AbstractPerson (){};

        public AbstractPerson (String name, String disignatione) {
            this.name = name;
            this. designatione = disignatione;
        }

              String abstractEat () {
            return("Human eats");
        }

    @Override
    public void learn() {

    }

    @Override
    public void walk() {

    }

    @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", designatione='" + designatione + '\'' +
                    '}';
        }
    }


