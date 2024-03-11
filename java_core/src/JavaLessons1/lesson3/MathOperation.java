package lesson3;

public class MathOperation {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        //Прибавление
        int sum = x + y;
        //System.out.println(sum);

        //Вычитание
        int diff = x - y;
        //System.out.println(diff);

        //Умножение
        int multiply = x * y;
        //System.out.println(multiply);

        //Деление
        y = 3;
        double divide = (double) x / y;
        //System.out.println(divide);

        //Возведение в степень
        int ext = x * x;
        //System.out.println(ext);

        //Инкермент
        // x = x + 1;
        // x++;
        x += 10;
        //System.out.println(x);

        //Декремент
        // x = x - 1;
         x--;
        //System.out.println(x);

        //Деление на процент
        int number = 4;
        // 4 - 2 - 2 = 0
        // 5 - 2 - 2 = 1

        int modulo = number % 2;
        //System.out.println(modulo);

        //Скобки

        int z = (2 + 2) * 2;
        //System.out.println(z);


        double height = 2.03;
        int weight = 100;
        double ind = weight / (height * height);
        System.out.println(ind);
    }
}
