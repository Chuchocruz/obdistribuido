package com.ejemplo.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Calculator calculator = (Calculator) registry.lookup("CalculatorService");

            System.out.println("Suma: " + calculator.add(132, 28));
            System.out.println("Resta: " + calculator.subtract(29, 5));
            System.out.println("Multiplicación: " + calculator.multiply(12, 5));
            System.out.println("División: " + calculator.divide(169, 13));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
