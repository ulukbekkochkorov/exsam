package com.company;

    public class Programmer extends Person {
        private final String name;
        private String companyName;

        public Programmer(String name, String designatione, String companyName) {
            this.name = name;
            this.designatione = designatione;
            this.companyName = companyName;
        }
        public Programmer(String name, String designatione) {
            super(name, designatione);
        }
        @Override
        String eat() {
            return(name + " likes to eat steake");
        }
        @Override
        String learn() {
            return(name + " learns math");
        }
        @Override
        String walk () {
            return (name + " often wolks in the park");
        }

        @Override
        public String toString() {
            return "Programmer{" +
                    "name='" + name + '\'' +
                    ", designatione='" + designatione + '\'' +
                    ", companyName='" + companyName + '\'' +
                    '}';
        }

        String coding () {
            return (name + " is coding project");

        }
}
