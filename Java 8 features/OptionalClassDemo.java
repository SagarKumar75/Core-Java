import java.util.*;

public class OptionalClassDemo {

    public static void main(String[] args) {
        String name = null;

        Optional<String> opt = Optional.ofNullable(name);

        System.out.println(opt.orElse("Default name")); // print default name
    }

}
