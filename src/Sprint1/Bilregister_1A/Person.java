package Sprint1.Bilregister_1A;
public class Person {
    private String name, address;
    private int age;

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getAddress() {
        return this.address;
    }
    protected void setAddress(String address) {
        this.address = address;
    }

    protected int getAge() {
        return this.age;
    }
    protected void setAge(int age) {
        this.age = age;
    }
}