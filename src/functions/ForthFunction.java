package functions;

public class ForthFunction extends AbstractFunction {

    ForthFunction() {
        super("1/x");
    }

    @Override
    public double solution(double arg) {
        return (1/arg);
    }
}