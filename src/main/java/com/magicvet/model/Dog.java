package main.java.com.magicvet.model;

public class Dog extends Pet{

    private String size;

    @Override
    public String toString() {
        return "Pet {"
                + "\n\t\t type = " + getType()
                + ", sex = " + getSex()
                + ", age = " + getAge()
                + ", name = " + getName()
                + ", size = " + size
                + ", ownerName = " + getOwnerName()
                + "\n\t}";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


}
