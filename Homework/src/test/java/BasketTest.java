import io.codelex.advancedtest.exercise2.*;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;


public class BasketTest {

    @Test
    public void basketWithMushrooms() throws BasketFullException {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        mushroomBasket.addToBasket(new Mushroom());
        String result = mushroomBasket.toString();
        Assertions.assertEquals("Basket{basket=[Mushroom{}]}", result);
    }

    @Test
    public void basketWithApples() throws BasketFullException {
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.addToBasket(new Apple());
        String result = appleBasket.toString();
        Assertions.assertEquals("Basket{basket=[Apple{}]}", result);
    }

    @Test
    public void emptyBasket() throws BasketEmptyException {
        BasketEmptyException thrown = Assertions.assertThrows(BasketEmptyException.class, () -> {
            Basket<Apple> appleBasket = new Basket<>();
            Apple apple = new Apple();
            appleBasket.removeFromBasket(apple);
        }, "The basket is empty");

        Assertions.assertEquals("The basket is empty", thrown.getMessage());
    }

    @Test
    public void fullBasket() throws BasketFullException {
        BasketFullException thrown = Assertions.assertThrows(BasketFullException.class, () -> {
            Basket<Apple> appleBasket = new Basket<>();

            while (true) {
                appleBasket.addToBasket(new Apple());
            }
        }, "The basket is full");

        Assertions.assertEquals("The basket is full", thrown.getMessage());

    }

}
