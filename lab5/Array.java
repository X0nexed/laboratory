import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        // Используем 'var' для краткости (доступно с Java 10+)
        var arr = new CustomArray<String>();

        arr.push("first");
        arr.push("second");
        arr.push("third");

        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
        System.out.println("---");
        System.out.println(arr.pop());
        System.out.println(arr.pop());
        System.out.println(arr.pop());
        System.out.println(arr.pop());
    }
}

/**
 * Сокращенная версия класса CustomArray
 */
class CustomArray<T> {

    // Инициализируем список сразу при объявлении,
    // это позволяет убрать явный конструктор.
    private List<T> list = new ArrayList<>();

    public void push(T value) {
        list.add(value);
    }

    public T pop() {
        // Используем тернарный оператор
        return list.isEmpty() ? null : list.remove(list.size() - 1);
    }

    public T get(int index) {
        // Используем тернарный оператор
        return (index < 0 || index >= list.size()) ? null : list.get(index);
    }
}