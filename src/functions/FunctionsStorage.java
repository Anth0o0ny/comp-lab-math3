package functions;

public class FunctionsStorage {

    private static final AbstractFunction[] FUNCTIONS = {
            new FirstFunction(),
            new SecondFunction(),
            new ThirdFunction(),
            new ForthFunction()
    };

    public static AbstractFunction[] getFUNCTIONS() {
        return FUNCTIONS;
    }

}
