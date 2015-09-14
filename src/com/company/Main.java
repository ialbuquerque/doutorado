package com.company;

public class Main {
    private static Menu menu = new Menu();
    private static String option;

    public static void main(String[] args) {
        option = menu.startMenu();
        
        if (option.equals("1")) {
            System.out.println("Aguarde, estamos processando suas informações!");
            
        } else if (option.equals("2")) {
            System.exit(0);

        } else {
            System.out.println("Código não reconhecido, tente novamente");
            option = menu.startMenu();
        }
        
        CSVReader csvReader = new CSVReader();
        csvReader.run("/Users/isa/Documents/BSI/doutorado/test/resources/example.csv");
    }
}
