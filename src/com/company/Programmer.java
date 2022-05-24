package com.company;

    public class Programmer extends AbstractPerson {

        private String companyName;

        public Programmer(String name, String disignatione, String companyName) {
            super(name, disignatione);
            this.companyName = companyName;
        }

        @Override
        public String abstractEat() {
            return (name + " likes eat steak");
        }
        @Override
        public void learn() {
            System.out.println(name+ " is learning English");

        }
        @Override
        public void walk() {
            System.out.println(name+ " likes walk");

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
