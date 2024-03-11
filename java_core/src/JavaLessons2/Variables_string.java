package JavaLessons2;

public class Variables_string {
    public static void main(String[] args) {
        char a = 'q';
        String abc = "qwerty";
        //System.out.println(a);
        //System.out.println(abc);
        System.out.println(abc.charAt(5)); // Обращение к символу
        System.out.println(abc.toUpperCase()); // Сделать все символы большими
        int size_string = abc.length(); // Размер строки
        char[] MyArrayChar = abc.toCharArray(); // Сделать массив из char
        for(int i = 0; i < size_string; i++){
            System.out.print(MyArrayChar[i]);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.print("Size string - ");
        System.out.println(size_string);
        if(abc.isEmpty()){ // Пустая или нет
            System.out.println("String is empty!");
        }
        else{
            System.out.println("String in not empty!");
        }

        String str1 = "1234567";
        String str2 = "654321";
        String res = str1 + str2; // Сложение двух строк в одну
        System.out.println(res);

    }
}
