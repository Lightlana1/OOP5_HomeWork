package OOP5;

import OOP5.model.ComplexCalc;

public class Main {
    public static void main(String[] args) {
        Logger.logData("");

        var m = new ComplexCalc();
        var n = new View();
        Presenter presenter = new Presenter(m, n);
        presenter.calculate();
        presenter.restart();
    }
}
