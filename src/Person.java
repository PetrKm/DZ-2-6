public  class Person {

    protected String name;
    protected String sureName;
    protected int ticketsAmount;

    public Person(String name, String sureName, int ticketsAmount){
        this.name = name;
        this.sureName = sureName;
        this.ticketsAmount = ticketsAmount;
    }

    @Override
    public String toString() {
        return name + " " + sureName + " Осталось: " + ticketsAmount +" белета(ов).";
    }
}
