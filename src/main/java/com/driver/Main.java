package com.driver;

public class Main {
    public static class Product {
        public int product(int x, int y) { return x+y;}
        public int product(int x, int y, int z) { return x+y+z; }
        public double product(double x, double y) {return x+y; }
    }
    public static void main(String[] args){
        Product p = new Product();
        p.product(7,8);
        p.product(7,8,9);
        p.product(7.0,8.0);
    }
}