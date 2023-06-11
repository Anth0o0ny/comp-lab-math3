package solutionMethods.rectangleMethod;

public class RectangleMethodCenterModification extends RectangleMethod {

    public RectangleMethodCenterModification() {
        super("Метод прямоугольников (Метод средних)");
        k = 2;
    }

    @Override
    public double calculateValue(double step, double partitions) {
        double sum = 0;
        double currentStartValue = (data.getBottomLimit() + step)/2;

        for (int i = 1; i < partitions; i++) {
            sum += rounding(data.getFunction().solution(currentStartValue + step * i));
        }

        return rounding(sum * step);
    }
}
