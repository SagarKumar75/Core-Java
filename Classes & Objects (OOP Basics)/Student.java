
public class Student {

    String name;
    int age;
    char grade;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "sagar";
        s1.age = 21;
        s1.grade = 'A';

        s1.display();
    }

}
