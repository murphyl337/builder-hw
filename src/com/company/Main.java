package com.company;

import com.company.Pizza.PizzaBuilder;

public class Main {

    public static void main(String[] args) {
	      Pizza myPizza = new PizzaBuilder().hasBlackOlive(true)
                            .hasPepporoni(true)
                            .build();

        System.out.println("Pizza 1: ");
	      System.out.println(myPizza.toString());

      Pizza anotherPizza = new PizzaBuilder().hasBlackOlive(true)
          .hasPepporoni(false)
          .build();

      System.out.println("Pizza 2: ");
      System.out.println(anotherPizza.toString());

      Pizza noCheese = new PizzaBuilder().hasBlackOlive(true)
          .hasPepporoni(false)
          .takeOffCheese()
          .build();

      System.out.println("Pizza 3: ");
      System.out.println(noCheese.toString());

      Pizza evil = new PizzaBuilder().hasBlackOlive(true)
          .hasPepporoni(false)
          .takeOffCheese()
          .hasPineapple(true)
          .build();

      System.out.println("Pizza 4: ");
      System.out.println(evil.toString());
    }
}
