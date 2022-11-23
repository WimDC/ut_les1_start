package ex02_product_description;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class productDescriptionTest {
    private final Product stella = new Product("Stella",33,5.369);
    private final Product jupiler = new Product("jupiler",50,5);
    private final Product invertedBier = new Product("soberer",25,-4.287);
    @Test
    public void decimalePercentage() {
        String result = stella.productDescription();
        assertEquals(" * 33CL 5,4%", result);
    }
    @Test
    public void absolutePercentage() {
        String result = jupiler.productDescription();
        assertEquals(" * 50CL 5%", result);
    }
    @Test
    public void negativePercentage() {
        String result = invertedBier.productDescription();
        assertEquals(" * 25CL -4,3%", result);
    }
}
