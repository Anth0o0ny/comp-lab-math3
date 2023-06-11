package input.selectors;

import services.Printer;

public abstract class AbstractSelector {

    public final Printer printer = new Printer();

    public abstract void printChoices();

}
