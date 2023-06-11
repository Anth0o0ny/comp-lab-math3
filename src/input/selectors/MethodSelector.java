package input.selectors;

import input.InputMenu;
import solutionMethods.AbstractMethod;
import solutionMethods.MethodsStorage;

public class MethodSelector extends AbstractSelector implements InputMenu {

    @Override
    public void getUserInput() {
        boolean check;
        do {
            printer.print("Доступно 5 методов решения интеграла:");
            printChoices();
            printer.print("Выберите метод решения,указв его порядковый номер:");
            check = inputChecker(scanner.nextLine().trim());
        } while (!check);
    }

    @Override
    public boolean inputChecker(String input) {
        switch (input) {
            case "1":
                data.setMethod(MethodsStorage.getMETHODS()[0]);
                return true;
            case "2":
                data.setMethod(MethodsStorage.getMETHODS()[1]);
                return true;
            case "3":
                data.setMethod(MethodsStorage.getMETHODS()[2]);
                return true;
            case "4":
                data.setMethod(MethodsStorage.getMETHODS()[3]);
                return true;
            case "5":
                data.setMethod(MethodsStorage.getMETHODS()[4]);
                return true;
            case "test":
                data.setMethod(MethodsStorage.getMETHODS()[5]);
            default:
                return false;
        }
    }

    @Override
    public void printChoices() {
        AbstractMethod[] methods = MethodsStorage.getMETHODS();
        for (int i = 0; i < methods.length; i++) {
            printer.print((i+1) + " : " + methods[i].getStringRepresentation());
        }
    }
}
