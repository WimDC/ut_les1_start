package ex04_hellofresh;

public class Ingredient {
    private String name;
    private String unit;
    private double amount;

    public Ingredient(String name, String unit, double amount) {
        this.name = name;
        this.unit = unit;
        this.amount = amount;
    }

    public Ingredient() {
    }

    public String print(int nrOfPortions) {
        this.amount = amount * nrOfPortions;
        return amount+" "+unit+" "+name;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        Ingredient a = new Ingredient("zout", "gr", 5);
        System.out.println(a.print(5));
    }
}
