import java.util.function.Function;

class Seq {

    public static void main(String[] args) {

        Function<Double, Double> f1_1 = x -> x + 7.0;
        Function<Double, Double> f1_2 = x -> x * 2.0;

        double result1 = f1_1.compose(f1_2).apply(5.0);

        System.out.println("Пример 1 " + result1);

        double result2 = ((Function<Double, Double>)(x -> x * 2.0))
                .compose((Double x) -> x + 7.0)
                .apply(5.0);

        System.out.println("Пример 2 " + result2);


        Function<Double, Double> f3_1 = x -> x + 1.0;
        Function<Double, Double> f3_2 = x -> x * 2.0;
        Function<Double, Double> f3_3 = x -> x / 3.0;
        Function<Double, Double> f3_4 = x -> x - 4.0;

        double result3 = f3_1.compose(f3_2)
                .compose(f3_3)
                .compose(f3_4)
                .apply(7.0);

        System.out.println("Пример 3 " + result3);
    }
}