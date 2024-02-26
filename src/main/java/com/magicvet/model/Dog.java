package main.java.com.magicvet.model;

public class Dog extends Pet{

    private Size size;




    @Override
    public String toString() {
        return "Pet {"
                + "type = " + getType()
                + ", sex = " + getSex()
                + ", age = " + getAge()
                + ", name = " + getName()
                + ", size = " + getSize()
                + ", ownerName = " + getOwnerName()
                + ", registrationDate = " + getRegistrationDate().format(FORMATTER)
                + "}";
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public enum Size{
        XS(1),
        S(2),
        M(3),
        L(4),
        XL(5),
        UNKNOWN(0);

        private final int value;

        Size(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Size fromString(String value) {
            for(Size size: values()) {
                if(size.toString().equals(value)) {
                    return size;
                }
            }
            System.out.println("Unable to parse value'"+value+"' usind default value: "+ UNKNOWN);
            return UNKNOWN;
        }
    }

}
