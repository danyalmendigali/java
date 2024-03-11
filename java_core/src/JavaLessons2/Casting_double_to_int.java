package JavaLessons2;

public class Casting_double_to_int {
    public static void main(String[] args) {
        double aa = 5.5;
        //int a = (int)aa;
        int a = (int)Math.ceil(aa);
        int a1 = (int)Math.floor(aa);
        int a2 = (int) aa;
        System.out.print("Default: ");
        System.out.println(a2);

        System.out.print("Round down: ");
        System.out.println(a1);

        System.out.print("Round up: ");
        System.out.println(a);
    }
}
