package OOP5.model;

import OOP5.Logger;

public class SetDigits {
    protected double x;
    protected double y;
    protected double a;
    protected double b;


    public void setX(double x) {
        this.x = x;
        Logger.logData("Число х: "+ x);
    }

    public void setY(double y) {
        this.y = y;
        Logger.logData("Число y: "+y);

    }

    public void setA(double a) {
        this.a = a;
        Logger.logData("Мнимая часть х: "+ a);

    }

    public void setB(double b) {
        this.b = b;
        Logger.logData("Мнимая часть y: "+ b);

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
