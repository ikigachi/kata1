package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person lucas = new Person("Lucas", LocalDate.of(2000, 12, 12));

        System.out.println(lucas.age());
    }
}