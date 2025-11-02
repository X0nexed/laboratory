import java.util.Arrays;
public class first {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15};
        int sum = 0;
        for (int  i = 0; i < numbers.length; i++) {
            sum += i;
        }

        System.out.println("first" + " ex. " + sum);
        main1(args);
        main2(args);
        main3(args);
        main4(args);
        }

        public static void main1(String[] args){

         int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
         int x = 0;
         for (int num : numbers){
                x += num;
         }

         System.out.println("Second" + " ex. " + x);

        }
        public static void main2(String[] args){
        int numbers = 2;
        while (numbers > 1){
            System.out.println("Third " + " ex. " + numbers);
            numbers--;
        }
        }
        public static void main3(String[] args) {
            int n = 0;
            do {
                System.out.println("Fourth " + " ex. " + n);
                n--;
            } while (n > 0);
            //alternative variation
            n = 2;
            do {
                System.out.println("Fourth_alt " + " ex. " + n);
                return;
            } while (n > 1);

        }
        public static void main4(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};

            int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
            System.out.println("Fifth " + " ex. " + sum);
        }
}


