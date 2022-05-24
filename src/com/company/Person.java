package com.company;

public abstract class AbstractPerson {

        String name;
        String designatione;

        public Person (){};

        public Person(String name, String disignatione) {
            this.name = name;
            designatione = disignatione;
        }

        String learn () {
            return("Human can learn");
        }
        String walk () {
            return("Human can wolk");
        }
        String abstractEat () {
            return("Human eats");
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", designatione='" + designatione + '\'' +
                    '}';
        }
    }

}
