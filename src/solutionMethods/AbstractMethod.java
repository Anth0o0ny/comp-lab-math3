package solutionMethods;

import data.Data;
import services.Printer;

public abstract class AbstractMethod {

    public Data data;

    public double k;

    public int currentPartitions;

    public double currentStep;

    private double currentAccuracy;

    private final String stringRepresentation;

    private final Printer printer = new Printer();

    public AbstractMethod(String representation) {
        stringRepresentation = representation;
    }

    public String getStringRepresentation() {
        return stringRepresentation;
    }

    public void iterationCycle() {
        printTitle();

        currentPartitions = Data.PARTITIONS_NUMBER;
        currentStep = calculateStepLength(currentPartitions);

        int iteration = 1;
        double valueOfCurrentPartitions;
        double valueOfPartitionsDividedTwo;

        do {
            valueOfCurrentPartitions = calculateValue(currentStep, currentPartitions);
            valueOfPartitionsDividedTwo = calculateValue(currentStep / 2, currentPartitions * 2);
            currentAccuracy = calculateAccuracy(valueOfPartitionsDividedTwo, valueOfCurrentPartitions);

            printIterationResult(rounding(valueOfCurrentPartitions), iteration);
            iteration++;

            currentPartitions*=2;
            currentStep = calculateStepLength(currentPartitions);
        }
        while (!checkRungeRule() && 50 >= iteration);

        if (iteration == 50) {
            printer.print("Достигнуто максимальное число итераций - 50");
        }
    }

    public double calculateStepLength(int currentPartitions) {
        return ((data.getTopLimit()- data.getBottomLimit())/ currentPartitions);
    }

    private double calculateAccuracy(double pastValue, double currentValue) {
        double numerator = Math.abs(pastValue - currentValue);

        return rounding(numerator);
    }

    public boolean checkRungeRule() {
        return currentAccuracy <= data.getAccuracy();
    }

    public abstract double calculateValue(double step, double partitions);

    private void printIterationResult(double value, int iteration) {
        printer.print(String.format("| %1$8d | %2$15d | %3$18s | %4$8s |", iteration, currentPartitions, value, currentAccuracy));
    }

    private void printTitle() {
        printer.print(String.format("| %1$s | %2$s | %3$s | %4$s |", "Итерация", "Число разбиений", "Значение интеграла", "Точность"));
    }

    public double rounding(double value) {
        double scale = Math.pow(10, Double.toString(data.getAccuracy()).length()-1);
        return Math.ceil(value * scale) / scale;
    }

}
