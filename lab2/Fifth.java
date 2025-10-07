import java.util.stream.IntStream;

public class Fifth {
    public static void main(String[] args) {
       int start = 15;
       int end = 31;
        IntStream.range(start, end)
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }
    }

