package functions;

public class ThirdFunction extends AbstractFunction {

    ThirdFunction() {
        super("x^3 - 6x^2 + 6x - 21");
    }

    @Override
    public double solution(double arg) {
        return (Math.pow(arg, 3) - 6*Math.pow(arg, 2) + 6*arg - 21);
    }
}
