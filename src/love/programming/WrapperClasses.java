package love.programming;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer myInteger = 20;
        System.out.println(myInteger);

        // auto boxing

        Integer myObjectInteger = new Integer (10);
        System.out.println(myObjectInteger.toString());

               // normal object

        int a = myObjectInteger ;
        System.out.println(a);

        // unboxing
    }
}
