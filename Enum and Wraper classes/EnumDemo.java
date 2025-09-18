enum Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}

public class EnumDemo {
    public static void main(String[] args) {
        Day today = Day.Monday;

        if (today == Day.Monday) {
            System.out.println("start of the week!");
        }

        // loop throigh enum values

        for (Day d : Day.values()) {
            System.out.println(d);
        }

    }

}
