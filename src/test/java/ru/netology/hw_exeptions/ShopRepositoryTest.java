package ru.netology.hw_exeptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ShopRepositoryTest {

    @Test
    public void testRemoveWhenProductFound() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "картошка", 100);
        Product product2 = new Product(2, "яблоки", 200);
        Product product3 = new Product(3, "манго", 300);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(2);
        Product[] actual = repo.findAll();
        Product[] expected = {product1, product3};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testRemoveWhenProductNotFound() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "картошка", 100);
        Product product2 = new Product(2, "яблоки", 200);
        Product product3 = new Product(3, "манго", 300);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        Assertions.assertThrows(NotFoundException.class,
                () -> repo.remove(4)
        );

    }


}
