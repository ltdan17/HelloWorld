/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author gesanchez21
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello " + getName());

    }

    public static String getName() {
        String name = null;

        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        if (name.isEmpty()) {
            name = "Dan";
        }

        return name;
    }

}
