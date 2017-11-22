package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    String[][] workers = {
            {"23421", "John", "Smith"},
            {"34214", "Ivone", "Novak"},
            {"98345", "Jessie", "Pinkman"},
            {"33434", "Walter", "White"},
            {"92354", "Clara", "Lanson"}
    };

    private Double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00
    };

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public Double[] getSalaries() {
        return salaries;
    }
}


