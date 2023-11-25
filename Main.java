package IDK;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Age = new Scanner( System.in );

        System.out.println("Сколько вам лет?");
        System.out.println("(Напишите число!)");

        int a = Age.nextInt();

            if(a <= 0) {
                System.out.println("Вам " + a + " лет, в чём я очень сильно сомневаюсь)");
            }

            else if(a <= 1) {
                System.out.println("Вам " + a + " год!");
            }

            else if(a <= 4) {
                System.out.println("Вам " + a + " года!");
            }

            else if(a >= 5) {
                System.out.println("Вам " + a + " лет!");
            }
    }
}
