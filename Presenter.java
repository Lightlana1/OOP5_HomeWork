package OOP5;

import OOP5.model.ComplexCalc;
import OOP5.model.RatioCalk;

public class Presenter {
    View view;
    ComplexCalc complexCalc;

    RatioCalk rc;

    public Presenter (ComplexCalc cc, View v){
        complexCalc = cc;
        view = v;
    }

    public void calculate(){
        int action = view.userInput("Выберите тип числа \n 1. Рациональные \n 2. Комплексные" );
        switch (action){
            case 1:
                actionRatio();
                break;
            case 2:
                actionComplex();
                break;
            default:
                System.out.println(" ");
        }
    }

    public void restart(){
        System.out.println(" ");
        int choice = view.userInput("Что делаем дальше? \n 1. Новое вычисление \n 2. Закрываем калькулятор" );
        switch (choice){
            case 1:
                calculate();
            case 2:
                System.out.println("Благодарим за использование нашего приложения!");
                break;
            default:
                System.out.println(" ");
        }

    }


    public void actionComplex(){
        complexCalc.setX(view.userDInput("Введите число х: "));
        complexCalc.setA(view.userDInput("Введите число а: "));

        complexCalc.setY(view.userDInput("Введите число y: "));
        complexCalc.setB(view.userDInput("Введите число b: "));

        switch (view.signSelect()){
            case 1:
                view.printComplex("Сумма: " + complexCalc.sum());
                break;
            case 2:
                view.printComplex("Разность: " + complexCalc.difference());
                break;
            case 3:
                view.printComplex("Произведение: " + complexCalc.mult());
                break;
            case 4:
                view.printComplex("Деление: " + complexCalc.divide());
                break;
            default:
                System.out.println(" ");
        }
    }

    public void actionRatio(){
        RatioCalk rc = new RatioCalk();
        rc.setX(view.userDInput("Введите число х: "));
        rc.setA(view.userDInput("Введите число y: "));

        switch (view.signSelect()){
            case 1:
                view.printRatio("Сумма: " + rc.sum());
                break;
            case 2:
                view.printRatio("Разность: " + rc.difference());
                break;
            case 3:
                view.printRatio("Произведение: " + rc.mult());
                break;
            case 4:
                view.printRatio("Деление: " + rc.divide());
                break;
            default:
                System.out.println(" ");
        }
    }


}
