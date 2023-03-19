package OOP5.model;

import OOP5.Logger;

public class Complex extends SetDigits {
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;

        Logger.logData("Комплексное число" + x + " , "+ y + "i создано");
    }

    @Override
    public String toString() {
        return (x + " " + y + "i");
    }
}
