package com.example.webappassignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class WebAppAssignment1Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        // Initialize objects
        Grass fescue = (Grass) ctx.getBean("fescue");
        Grass bentgrass = (Grass) ctx.getBean("bentgrass");
        Grass campus = (Grass) ctx.getBean("campus");
        Tree tree = (Tree) ctx.getBean("tree");
        CostCalculator costCalculator = (CostCalculator) ctx.getBean("costcalculator");
        // In this main class since it has no bearing on anything else
        int houseNumber;

        Scanner key = new Scanner(System.in);
        String grassType;
        int treeNumber;
        double total = 0;

        System.out.println("Enter House Number: ");
        houseNumber = key.nextInt();
        System.out.println("Enter property length (feet): ");
        costCalculator.setLength(key.nextDouble());
        System.out.println("Enter property width (feet): ");
        costCalculator.setWidth(key.nextDouble());
        System.out.println("Enter type of grass (fescue, bentgrass, campus): ");
        // Need to do this since we're switching between data types
        key.nextLine();
        grassType = key.nextLine();
        System.out.println("Enter the number of trees: ");
        treeNumber = key.nextInt();

        // Calculations
        costCalculator.calculateCost();
        total += costCalculator.getFormatedCost();
        for (int i = 0; i < treeNumber; i++) {
            total += tree.getCost();
        }
        // switch can can also be used here, doesn't matter which.
        if (grassType.equalsIgnoreCase("fescue")) {
            total += (fescue.getCost()) * (costCalculator.getLength()*costCalculator.getWidth());
        }
        else if (grassType.equalsIgnoreCase("bentgrass")) {
            total += (bentgrass.getCost()) * (costCalculator.getLength()*costCalculator.getWidth());
        }
        else if (grassType.equalsIgnoreCase("campus")) {
            total += (campus.getCost()) * (costCalculator.getLength()*costCalculator.getWidth());
        }
        else {
            System.out.println("Invalid grass type, we'll give you the cheapest.");
            total += (campus.getCost()) * (costCalculator.getLength()*costCalculator.getWidth());
        }

        System.out.println("Total cost for house " + houseNumber + " is: " + total);

    }

}

