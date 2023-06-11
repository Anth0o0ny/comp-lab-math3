package functions;

public class FirstFunction extends functions.AbstractFunction {

    FirstFunction() {
        super("2x^3 - 2x^2 - 4x + 8");
    }

    @Override
    public double solution(double arg) {
        return (2*Math.pow(arg, 3) - 2*Math.pow(arg, 2) - 4*arg + 8);
    }
}
