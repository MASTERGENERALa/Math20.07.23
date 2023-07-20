package Math;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        MyMath mathObject = new MyMath();
        Class<MyMath> mathClass = MyMath.class;

        try {
            Method mathSumMethod = mathClass.getDeclaredMethod("mathSum", int.class, int.class);
            if (mathSumMethod.isAnnotationPresent(Math.class)) {
                Math mathAnnotation = mathSumMethod.getAnnotation(Math.class);
                int num1 = mathAnnotation.num1();
                int num2 = mathAnnotation.num2();
                mathSumMethod.invoke(mathObject, num1, num2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
