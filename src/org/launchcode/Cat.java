package org.launchcode;

public class Cat {

    private String name;
    private String breed;
    private String color;
    private int age;
    private boolean chonk;
    private boolean isHungry = true;
    private boolean isHappy = false;

    public Cat(String name, String color, String breed){
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void checkIsHappy(){
        System.out.println(this.isHappy);
    }
    public void hairball(){
        System.out.println("ARRRGGHHH");
    }

    public void meow(){
        System.out.println("Meow!");
    }

    public void petCat(){
        this.isHappy = true;
        System.out.println("Purrrrr");
    }

    public void feedCat(){
        this.isHungry = false;
        this.isHappy = true;
    }



//    public Mouse hunt()
}
