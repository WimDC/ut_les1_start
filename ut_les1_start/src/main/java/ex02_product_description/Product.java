package ex02_product_description;

import java.text.DecimalFormat;

public class Product {

    private String name;
    private int size;
    private double percentage;

    public Product(String name, int size, double percentage) {
        this.name = name;
        this.size = size;
        this.percentage = percentage;
    }

    public Product() {
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
        System.out.println(p.productDescription());
        System.out.println(x.productDescription());
    }
}
