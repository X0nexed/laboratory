import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Interface {
    public void m1(int x) {}

    public String m2(String x, int y) {return x + y;}

    public boolean m3(int x, long y, int z) {return true;}

    public void m4() {}
    }
public class Fourth4 {
    public static void main(String[] args) {
    Interface iface = new Interface();

    Class<?> clazz = iface.getClass();

    Method[] declaredMethods = clazz.getDeclaredMethods();

    List<Object[]> methodsInfo = new ArrayList<>();

    for (Method method : declaredMethods) {
        String methodName = method.getName();
        int parameterCount = method.getParameterCount();

        methodsInfo.add(new Object[]{methodName, parameterCount});
    }
    for (Object[] info : methodsInfo) {
        System.out.println(Arrays.toString(info));
        }
    }
}