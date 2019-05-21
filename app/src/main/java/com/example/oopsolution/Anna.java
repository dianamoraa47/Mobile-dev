package com.example.oopsolution;

public class Anna extends Human{
    private int height;
    public Anna(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public void eat(){
//        super.eat();
        int AnnaWeight  = getWeight();
        AnnaWeight = AnnaWeight + 2;
        setWeight(AnnaWeight);
    }
    @Override
    public void birthday(){
        int AnnaAge = getAge();
        AnnaAge = AnnaAge = 4;
        setAge(AnnaAge);
    }
}
