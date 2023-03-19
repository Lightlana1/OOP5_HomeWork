package OOP5;

import java.util.Scanner;

public class View {
    public static int userInput(String msg){
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }
    public static Double userDInput(String msg){
        Scanner sc = new Scanner(System.in);
        Double inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = Double.parseDouble(sc.next());
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }

    public void printRatio(String str){
        System.out.println(str);
    }
    public void printComplex(String str){
        System.out.println(str);
    }

    public int signSelect(){
        int sign = userInput("Выберите действие: " +
                "\n\t1. Сложение"+
                "\n\t2. Вычитание" +
                "\n\t3. Умножение" +
                "\n\t4. Деление");
        return sign;
    }



}
