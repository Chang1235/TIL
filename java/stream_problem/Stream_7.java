package stream_problem;

import java.util.Random;

public class Stream_7 {
    public static void main(String[] args) {
        new Random().ints(1,46)
                .distinct()
                .limit(6)
                .sorted()
                .forEach(System.out::println);
    }
}
