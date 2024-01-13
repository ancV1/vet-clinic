package main.java.com.magicvet.model;

public class Dog extends Pet{

    public static final String XS = "XS";
    public static final String S = "S";
    public static final String M = "M";
    public static final String L = "L";
    public static final String XL = "XL";
    private String size;

    public Dog(){}
    public Dog(String age){
        this.setAge(age);
    }

    @Override
    public String toString() {
        return "Pet {"
                + "type = " + getType()
                + ", sex = " + getSex()
                + ", age = " + getAge()
                + ", name = " + getName()
                + ", size = " + size
                + ", ownerName = " + getOwnerName()
                + "}";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


}
