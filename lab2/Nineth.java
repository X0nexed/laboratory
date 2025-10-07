public class Nineth {
    static class Contact {
        String name;
        String phone;

        Contact(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        // создаем массив и сразу присваиваем туда элементы
        Contact[] arr = new Contact[]{
                new Contact("Marcus Aurelius", "+380445554433"),
                new Contact("Ethan Cole", "+1 (202) 555-0147"),
                new Contact("Liam Carter", "+1 (415) 555-2673")};

        // for-each
        for (Contact contact : arr) {
            System.out.println("name: " + contact.name + " " + contact.phone);
        }
    }
}