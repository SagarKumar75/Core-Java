import java.time.*;

public class DateTimeDemo {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date: " + today);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);

    }

}
