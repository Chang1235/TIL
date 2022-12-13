package stream_problem;

import java.util.stream.Stream;

public class Stream_5 {
    public static void main(String[] args) {
        String[] strArr = {"aaa","bb","c","dddd"};
        Stream<String> stringStream = Stream.of(strArr);

        int sum = stringStream.mapToInt(s->s.length()).sum();
        System.out.println("sum ="+sum);
    }
}
