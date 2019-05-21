package com.example.oopsolution;

import android.util.Log;

public class Human {
    private String name;
    private int age;
    private int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void eat(){
        Log.d("Human","i am eating food");
        }
    public void sleep(){
        Log.d("Human","zzzzzzzzzzzzz");
    }

    public int sleep(int hours) {
        Log.d("Human","i am sleeping for" + hours + "hours");
        return (hours);
    }

    public void speak(String speech){
        Log.d("Human",speech);
    }
    public void birthday(){
        int age = getAge();
        age = age + 1;
        setAge(age);
    }
}
