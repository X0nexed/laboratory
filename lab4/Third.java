import java.util.Map;
import java.util.HashMap;

public class Third {
    public record Data(int born, int died) {}
    public static void main(String[] args) {

        Map<String, Data> persons = new HashMap<>();
        persons.put("lenin", new Data(1870, 1924));
        persons.put("mao", new Data(1893, 1976));
        persons.put("gandhi", new Data(1869, 1948));
        persons.put("hirohito", new Data(1901, 1989));
        String key = "lenin";
        Data person = persons.get(key);
        if (person != null) {
            int ages_lenin_born = person.born();
            int lenin_dead = person.died();
            int age = lenin_dead - ages_lenin_born;
            System.out.println(age);
        }
        String key2 = "mao";
        Data person2 = persons.get(key2);
        if (person2 != null) {
            int ages_mao_born = person2.born();
            int mao_dead = person2.died();
            int age = mao_dead - ages_mao_born;
            System.out.println(age);
        }
        String key3 = "gandhi";
        Data person3 = persons.get(key3);
        if (person3 != null) {
            int ages_gandhi_born = person3.born();
            int gandi_dead = person3.died;
            int age = gandi_dead - ages_gandhi_born;
            System.out.println(age);
        }
        String key4 = "hirohito";
        Data person4 = persons.get(key4);
        if (person4 != null) {
            int ages_hirohito_born = person4.born();
            int hirohito_dead = person4.died();
            int age = hirohito_dead - ages_hirohito_born;
            System.out.println(age);
        }
    }
}
