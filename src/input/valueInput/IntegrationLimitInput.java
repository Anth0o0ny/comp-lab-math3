package input.valueInput;

import input.InputMenu;

public class IntegrationLimitInput extends AbstractInput implements InputMenu {

    private final double[] limits = new double[2];

    @Override
    public void getUserInput() {
        boolean check;
        do {
            printer.print("Введите пределы интегрирования в виде 'a b' (обязательно a < b):");
            check = inputChecker(scanner.nextLine().trim());
        } while (!check);
    }

    @Override
    public boolean inputChecker(String input) {
        String[] values = input.split(" ", 2);
        try {
            for (int i = 0; i < 2; i++) {
                limits[i] = Double.parseDouble(values[i].replace(",", "."));
            }
            if (limits[0] >= limits[1]) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException exception) {
            printer.print("Неверный формат введенных данных");
            return false;
        }
        data.setBottomLimit(limits[0]);
        data.setTopLimit(limits[1]);
        return true;
    }
}
