import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ShoppingCartTest {

    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - red", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(3.5));
    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - blue", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(5.0));
    }

    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - green", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(4.40));
    }

    @Test
    void calculatePriceForMagicCards_brown() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - Brown", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(2.00));
    }

    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Black", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(6.80));
    }

    @Test
    void calculatePriceForMagicCards_blacklotus() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blacklotus", null, "Magic: The Gathering - Black Lotus", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(40000.00));
    }

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);


        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(100.0));
    }



    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(50.0));
    }

}
