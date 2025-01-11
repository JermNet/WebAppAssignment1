package com.example.webappassignment1;

import java.text.DecimalFormat;

// Similar to grass but without a name, in theory they could inherit from the same class, but since they're fairly different concepts,
// I opted to make them separate
public class Tree {
    private double cost;
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public double getFormatedCost() {
        return Double.parseDouble(decimalFormat.format(cost));
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // Always good to have a toString()
    public String toString() {
        return "The cost of a tree is: " + cost;
    }
}