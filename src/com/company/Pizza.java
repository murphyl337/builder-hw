package com.company;

public class Pizza {
  private final boolean hasCheese;
  private final boolean hasSauce;
  private final boolean hasPepperoni;
  private final boolean hasBlackOlive;
  private final boolean hasPineapple;

  private Pizza(PizzaBuilder builder) {
    this.hasCheese  = builder.hasCheese;
    this.hasSauce = builder.hasSauce;
    this.hasPepperoni = builder.hasPepporoni;
    this.hasBlackOlive = builder.hasBlackOlive;
    this.hasPineapple = builder.hasPineapple;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("----------------------------------------\n");
    sb.append("Has Cheese: " + this.hasCheese + "\n");
    sb.append("Has Sauce: " + this.hasSauce + "\n");
    sb.append("Has Pepperoni: " + this.hasPepperoni + "\n");
    sb.append("Has Black Olive: " + this.hasBlackOlive + "\n");
    sb.append("----------------------------------------");
    return sb.toString();
  }

  public static class PizzaBuilder {
    private boolean hasCheese;
    private boolean hasSauce;
    private boolean hasPepporoni;
    private boolean hasBlackOlive;
    private boolean hasPineapple;

    public PizzaBuilder() {
      this.hasCheese = true;
      this.hasSauce = true;
    }

    public PizzaBuilder hasBlackOlive(boolean hasBO) {
      this.hasBlackOlive = hasBO;
      return this;
    }

    public PizzaBuilder hasPepporoni(boolean hasPep) {
      this.hasPepporoni = hasPep;
      return this;
    }

    public PizzaBuilder hasPineapple(boolean hasPine) {
      this.hasPineapple = false;
      throw new IllegalArgumentException("Stop...Don't ever put pineapple on pizza.");
    }

    public PizzaBuilder takeOffCheese() {
      this.hasCheese = false;
      return this;
    }

    public PizzaBuilder takeOffSauce() {
      this.hasSauce = false;
      return this;
    }

    public Pizza build() {
      return new Pizza(this);
    }
  }
}