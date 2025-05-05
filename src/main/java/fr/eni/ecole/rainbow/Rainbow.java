package fr.eni.ecole.rainbow;

public enum Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, MAUVE, PURPLE;

    static Rainbow color = null;

    public static void selectColor(String color) {
        switch (color) {
            case "red" -> System.out.println("You chose the color " + Rainbow.RED);
            case "green" -> System.out.println("You chose the color " + Rainbow.GREEN);
            case "yellow" -> System.out.println("You chose the color " + Rainbow.YELLOW);
            case "blue" -> System.out.println("You chose the color " + Rainbow.BLUE);
            case "mauve" -> System.out.println("You chose the color " + Rainbow.MAUVE);
            case "purple" -> System.out.println("You chose the color " + Rainbow.PURPLE);
            default -> System.out.println("The color you chose is not in the rainbow");
        }

    }

    public static void nextColor(String color) {
        switch (color) {
            case "green" -> Rainbow.color = Rainbow.YELLOW;
            case "yellow" -> Rainbow.color = Rainbow.GREEN;
            case "blue" -> Rainbow.color = Rainbow.MAUVE;
            case "mauve" -> Rainbow.color = Rainbow.PURPLE;
            case "purple" -> Rainbow.color = Rainbow.RED;
            default -> Rainbow.color = Rainbow.ORANGE;
        }
        System.out.println("Rainbow color set to " + color);
    }

    public static String showMeTheRainbow() {
        return "Rainbow is " + Rainbow.RED + ", " + Rainbow.ORANGE + ", " + Rainbow.YELLOW + ", " + Rainbow.GREEN + ", " + Rainbow.BLUE + ", " + Rainbow.MAUVE + ", " + Rainbow.PURPLE;
    }

}
