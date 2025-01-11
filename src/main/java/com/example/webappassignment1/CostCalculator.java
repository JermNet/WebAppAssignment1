package com.example.webappassignment1;

import java.text.DecimalFormat;

// This does the bulk of the calculations, it's all put together in the main method so that my three objects can work on their own if need be
public class CostCalculator {
    // These are used in case the set variables in the assignment need to be changed (i.e. having a base labor charge of 2000 instead of 1000)
    private double baseLaborCharge, largeSurface, largeSurfaceCost;

    // To get area
    private double length, width;

    // There is a total here since calculating and returning are separate methods, this is done to return a formated and unformatted answer.
    // I would do that in the main class, but since we're working with money, it makes sense format in here.
    private double totalCost;
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");

    // House number is not here because it is irrelevant to calculate the cost. Since the house is just comprised of a number,
    // and isn't really important to anything being done, there is no "House" object (otherwise there would be).

    // Always good to have setters and getters
    public double getBaseLaborCharge() {
        return baseLaborCharge;
    }

    public void setBaseLaborCharge(double baseLaborCharge) {
        this.baseLaborCharge = baseLaborCharge;
    }

    public double getLargeSurface() {
        return largeSurface;
    }

    public void setLargeSurface(double largeSurface) {
        this.largeSurface = largeSurface;
    }

    public double getLargeSurfaceCost() {
        return largeSurfaceCost;
    }

    public void setLargeSurfaceCost(double largeSurfaceCost) {
        this.largeSurfaceCost = largeSurfaceCost;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    // Calculate the total cost using the variables here, didn't want to do trees and grass in here since the grass has more than one type
    // And it's best to have a method not need to be changed after its made (i.e. I'd have to add more ifs here if new grass types were added)
    public void calculateCost() {
        if (length*width > largeSurface) {
            totalCost += largeSurfaceCost;
        }
        totalCost += baseLaborCharge;
    }

    public double getCost() {
        return totalCost;
    }

    public double getFormatedCost() {
        return Double.parseDouble(decimalFormat.format(totalCost));
    }
}
