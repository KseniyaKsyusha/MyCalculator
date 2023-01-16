package ua.en.kosse.oksana.tommy;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.Scanner;

import static ua.en.kosse.oksana.tommy.Summacalc.*;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Calculator.class.getPackageName());
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation, applicationContext);
        System.out.println("Результат операции: " + result);
    }

    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation, BeanFactory applicationContext) {
        int result;
        switch (operation) {
            case '+' -> result = (int) applicationContext.getBean(String.valueOf(Summacalc.class), oper(num1, num2));
            case '-' -> result = Minuscalc.oper(num1, num2);
            case '*' -> result = Multiplicalc.oper(num1, num2);
            case '/' -> result = Divisioncalc.oper(num1, num2);
            default -> {
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation(), applicationContext);//рекурсия
            }
        }
        return result;
    }


}
