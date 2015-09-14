package com.company;

import java.util.Scanner;

/**
 * Created by isa on 9/14/15.
 */
public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void printOptions() {
        System.out.println("1 - Inserir caminho do arquivo para cálculo");
        System.out.println("2 - Sair");
        System.out.print("Resposta: ");
    }
    
    public String startMenu(){
        this.printOptions();
        return scanner.nextLine();
    }
}
