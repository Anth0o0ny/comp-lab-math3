package input.valueInput;

import input.InputMenu;

public class AccuracyInput extends AbstractInput implements InputMenu{

    @Override
    public void getUserInput() {
        boolean check;
        do {
            printer.print("Введите точность вычисления:");
            check = inputChecker(scanner.nextLine().trim());
        } while (!check);
    }

    @Override
    public boolean inputChecker(String input) {
        try{
            double parsedValue = Double.parseDouble(input.replace(",", "."));
            data.setAccuracy(parsedValue);
        } catch (NumberFormatException exception) {
            printer.print("Неверный формат введенного значения");
            return false;
        }
        return true;
    }
}
