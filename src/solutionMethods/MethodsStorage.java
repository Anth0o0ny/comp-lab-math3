package solutionMethods;

import solutionMethods.rectangleMethod.RectangleMethodCenterModification;
import solutionMethods.rectangleMethod.RectangleMethodLeftModification;
import solutionMethods.rectangleMethod.RectangleMethodRightModification;
import solutionMethods.simpsonsMethod.SimpsonsMethod;
import solutionMethods.trapezoidalMethod.TrapezoidalMethod;

public class MethodsStorage {

    private static final AbstractMethod[] METHODS = {
            new RectangleMethodRightModification(),
            new RectangleMethodLeftModification(),
            new RectangleMethodCenterModification(),
            new SimpsonsMethod(),
            new TrapezoidalMethod(),
    };

    public static AbstractMethod[] getMETHODS() {
        return METHODS;
    }

}
