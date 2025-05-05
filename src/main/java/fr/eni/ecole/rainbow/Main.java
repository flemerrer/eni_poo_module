package fr.eni.ecole.rainbow;

public class Main {
    public static void main(String[] args) {

        System.out.println(Rainbow.showMeTheRainbow());
        System.out.println(Rainbow.MAUVE);
        Rainbow.selectColor("blue");
        Rainbow.nextColor("red");
        Rainbow.nextColor("blurp");
    }
    }
