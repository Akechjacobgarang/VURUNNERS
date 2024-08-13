/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runner;

/**
 *
 * @author PRINT 24 LF
 */
public class Runner {
    private String name;
    private int time;

    public Runner(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public static void main(String[] args) {
        Runner[] runners = {
            new Runner("Elena", 341),
            new Runner("Thomas", 273),
            new Runner("Hamilton", 278),
            new Runner("Suzie", 329),
            new Runner("Phil", 445),
            new Runner("Matt", 402),
            new Runner("Alex", 388),
            new Runner("Emma", 275),
            new Runner("John", 243),
            new Runner("James", 334),
            new Runner("Jane", 412),
            new Runner("Emily", 393),
            new Runner("Daniel", 299),
            new Runner("Neda", 343),
            new Runner("Aaron", 317),
            new Runner("Kate", 265)
        };

        Runner fastestRunner = runners[0];
        Runner secondFastestRunner = runners[1];

        if (fastestRunner.getTime() > secondFastestRunner.getTime()) {
            Runner temp = fastestRunner;
            fastestRunner = secondFastestRunner;
            secondFastestRunner = temp;
        }

        for (int i = 2; i < runners.length; i++) {
            if (runners[i].getTime() < fastestRunner.getTime()) {
                secondFastestRunner = fastestRunner;
                fastestRunner = runners[i];
            } else if (runners[i].getTime() < secondFastestRunner.getTime()) {
                secondFastestRunner = runners[i];
            }
        }

        System.out.println("Fastest runner: " + fastestRunner.getName() + " (" + fastestRunner.getTime() + " minutes)");
        System.out.println("Second fastest runner: " + secondFastestRunner.getName() + " (" + secondFastestRunner.getTime() + " minutes)");
    }
}

