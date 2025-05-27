import java.lang.reflect.Method;

public class DynamicInspector {
    public void displayWelcome() {
        System.out.println("Welcome to Reflection Demo!");
    }

    public static void main(String[] args) throws Exception {
        Class<?> dynamicClass = Class.forName("DynamicInspector");
        Object instance = dynamicClass.getDeclaredConstructor().newInstance();
        Method[] allMethods = dynamicClass.getDeclaredMethods();

        for (Method eachMethod : allMethods) {
            System.out.println("Invoking method: " + eachMethod.getName());
            eachMethod.invoke(instance);
        }
    }
}