public class FinalVariable {
    public static void main(String[] args) {
        final int num1 = 100;
        int num2=200;
        if(num1==100){
            num2= num1+2000;
        }
        System.out.println(num2);
    }
    // final class cannot be extended
}
