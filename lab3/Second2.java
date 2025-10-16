import java.security.SecureRandom;
public class Second2 {

    public static void main(String[] args) {
        int length = 16;
        StringBuilder key = new StringBuilder(length);
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            key.append(CHARACTERS.charAt(randomIndex));
        }
        System.out.print(key);
    }
}