package com.fooddelievery.genericss.boundedGenerics;

    public class NumericBox<T extends Number> {
        private T number1;

        public Double getSquare(T number) {
            this.number1 = number;
            Double d = (Double)  this.number1.doubleValue();
            return d*d;
        }

        public static void main(String[] args) {
            NumericBox<Integer> intBox = new NumericBox<>();  // ✅
            NumericBox<Double> doubleBox = new NumericBox<>(); // ✅
          System.out.println(intBox.getSquare(5));

            /// NumericBox<String> stringBox = new NumericBox<>(); // ❌ Compile error
        }


    }
