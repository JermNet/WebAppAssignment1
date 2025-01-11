package com.example.webappassignment1;
import java.text.DecimalFormat;

// Since all the grass is measured in a price per number of feet, this grass class can be any type of grass as long as there's a cost variable
// I have also added a name variable to make things clearer
public class Grass {
    private double cost;
    private String name;
    // Used to round to 2 decimal places
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");

    // Rounded to 2 decimals since we're working with money
    public double getFormatedCost() {
        return Double.parseDouble(decimalFormat.format(cost));
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Always good to have a toString()
    public String toString() {
        return "The cost of " + name + " grass is " + cost;
    }
}