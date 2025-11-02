public class Second {
        public static void main(String[] args) {
            int[][] x = {
                    {3, 5, 9},
                    {1, 7, 2},
                    {8, 4, 6}
            };
            int max = x[0][0];

            for (int i = 0; i < x.length; i++){
                for (int j = 0; j < x[i].length; j++){
                    if (x[i][j] > max) {
                        max = x[i][j];
                    }
                }
            }
        System.out.println(max);
        }
}
