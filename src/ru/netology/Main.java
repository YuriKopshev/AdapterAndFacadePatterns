package ru.netology;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Вычисления напрямую, через Calculator");
        System.out.println(calculator.newFormula()
                .addOperand(2)
                .addOperand(2)
                .calculate(Calculator.Operation.SUM)
                .result());
        System.out.println(calculator.newFormula()
                .addOperand(15)
                .addOperand(4)
                .calculate(Calculator.Operation.MULT)
                .result());
        System.out.println(calculator.newFormula()
                .addOperand(2)
                .addOperand(8)
                .calculate(Calculator.Operation.POW)
                .result());

        System.out.println("Вычисления через адаптер IntsCalculator");
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.mult(15, 4));
        System.out.println(intsCalc.pow(2, 8));
        System.out.println("===============" + "task 2");

        BinOps binOps = new BinOps();
        System.out.println(binOps.sum("1010","1010")); //10 + 10 в десятичной
        System.out.println(binOps.mult("1010","101")); //10 * 5 в десятичной
        System.out.println();

        //check
        System.out.println(Integer.toBinaryString(20));
        System.out.println(Integer.toBinaryString(50));
    }

}
