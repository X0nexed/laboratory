public class third3 {
    public static int ipToInt(String ip) {
                String[] octets = ip.split("\\.");
                if (octets.length != 4) {
                    throw new IllegalArgumentException("Неверный формат IPv4 адреса");
                }

                int result = 0;
                for (int i = 0; i < 4; i++) {

                    int octetValue = Integer.parseInt(octets[i]);

                    if (octetValue < 0 || octetValue > 255) {
                        throw new IllegalArgumentException("Значение октета должно быть от 0 до 255");
                    }
                    int shift = 8 * (3 - i);
                    result |= octetValue << shift;
                }

                return result;
            }
            public static int ipToInt() {
                return ipToInt("183.65.211.97");
            }

            public static void main(String[] args) {
                System.out.println(ipToInt("183.65.211.97"));
            }
        }

