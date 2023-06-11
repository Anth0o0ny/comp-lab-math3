package input;

import input.selectors.FunctionSelector;
import input.selectors.MethodSelector;
import input.valueInput.AccuracyInput;
import input.valueInput.IntegrationLimitInput;

public class SelectorLifecycle {

    private final InputMenu[] selectors = {
            new FunctionSelector(),
            new IntegrationLimitInput(),
            new AccuracyInput(),
            new MethodSelector()
    };


    public void lifecycle() {
        for (InputMenu selector: selectors) {
            selector.getUserInput();
        }
        InputMenu.data.getMethod().data = InputMenu.data;
        InputMenu.data.getMethod().iterationCycle();
    }

}

