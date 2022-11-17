package com.Eisen.daily.leetCode.easy;

public class ConvertTheTemperature_2469 {
    public double[] convertTemperature(double celsius) {

//        Kelvin = Celsius + 273.15
//        Fahrenheit = Celsius * 1.80 + 32.00
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
