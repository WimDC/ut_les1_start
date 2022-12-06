package ex02_product_description;

import java.text.DecimalFormat;

public class Product {

    private String name;
    private int size;
    private double percentage;

    public Product(String name, int size, double percentage) {
        this.name = name;
        setSize(size);
        setPercentage(percentage);
    }

    public Product() {
    }

    public void setSize(int size) {
        if (size < 0) {
            size = size * -1;
        }
        this.size = size;
    }

    public void setPercentage(double percentage) {
        if (percentage < 0)  {
            percentage = percentage * -1;
        }
            this.percentage = percentage;
    }

    public String productDescription () {
        String ret = "";
        if (percentage == Math.floor(percentage)) {
            ret =" * "+ size +"CL "+String.format("%.0f", percentage)+"%";
        } else {
            ret =" * "+ size +"CL "+String.format("%.1f", percentage)+"%";
        }
        return ret;
    }
    public static void main(String[] args) {
        Product p = new Product("Jupiler",33,5.3654);
        Product x = new Product("Bier",50,6);
        Product y = new Product("soberer", 25, -4.33);
        Product z = new Product("thirst intensifier", -75, 9);
        System.out.println(p.productDescription());
        System.out.println(x.productDescription());
        System.out.println(y.productDescription());
        System.out.println(z.productDescription());
    }
}
