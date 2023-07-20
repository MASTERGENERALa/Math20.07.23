package Math;

public class MyMath {
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Result of addition: " + result);
    }
}
