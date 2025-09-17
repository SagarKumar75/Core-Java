class Student {
    private String name;
    private int age;

    void setter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void getter() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setter("sagar", 21);
        s.getter();
    }

}
