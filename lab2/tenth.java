import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, String> Namephone = new HashMap<>();


        Namephone.put("Marcus Aurelius", "+380445554433");
        Namephone.put("Ethan Cole", "+1 202 555 0147");
        Namephone.put("Liam Carter", "+1 (415) 555-2673");
        System.out.println("WhichPhone");
        String phone = input.nextLine();
        String id1 = Namephone.get(phone);
        System.out.println((id1));
    }
}