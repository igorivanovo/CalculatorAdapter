package org.example;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override

    public int sum(int arg0, int arg1) {
        double arg00 = arg0;
        double arg10 = arg1;
        double result = target.newFormula()
                .addOperand(arg00)
                .addOperand(arg10)
                .calculate(Calculator.Operation.SUM)
                .result;
        return (int) result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        //считаем через target
        double arg00 = arg0;
        double arg10 = arg1;
        double result = target.newFormula()
                .addOperand(arg00)
                .addOperand(arg10)
                .calculate(Calculator.Operation.MULT)
                .result;
        return (int) result;
    }

    @Override
    public int pow(int a, int b) {
        double a0 = a;
        double b0 = b;
        double result = target.newFormula()
                .addOperand(a0)
                .addOperand(b0)
                .calculate(Calculator.Operation.POW)
                .result;
        return (int) result;
    }
}
