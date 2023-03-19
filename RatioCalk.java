package OOP5.model;

import OOP5.Logger;

public class RatioCalk extends SetDigits implements Model<Double> {
    @Override
    public Double sum() {
        Logger.logData("Сумма  чисел: "+(x + a));
        return (x + a);
    }

    @Override
    public Double mult() {
        Logger.logData("Произведение  чисел: " + (x * a));
        return (x * a);
    }

    @Override
    public Double divide() {
        Logger.logData("Деление  чисел: " + (x / a));
        return (x / a);
    }

    @Override
    public Double difference() {
        Logger.logData("Разность  чисел: " + (x - a));
        return (x - a);
    }
}
