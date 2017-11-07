package com;

import com.Bookstore;
import org.junit.Assert;
import org.junit.Test;

public class TestBookStore {
    @Test
    public void testBookStoreValidPrices() {
        Bookstore store1 = new Bookstore(300.0, 50.0, 4.0, 25.0);
        String result = store1.buyBooks();
        Assert.assertEquals((Object)"8 Books, $9 remaining", (Object)result);
        Bookstore store2 = new Bookstore(334534.85, 33.35, 2.99, 15.0);
        result = store2.buyBooks();
        Assert.assertEquals((Object)"22297 Books, $14.19 remaining", (Object)result);
        Bookstore store3 = new Bookstore(8050.0, 22.0, 3.5, 10.0);
        result = store3.buyBooks();
        Assert.assertEquals((Object)"802 Books, $3 remaining", (Object)result);
        Bookstore store4 = new Bookstore(300.0, 400.0, 50.0, 25.0);
        result = store4.buyBooks();
        Assert.assertEquals((Object)"0 Books, $300 remaining", (Object)result);
        Bookstore store5 = new Bookstore(0.0, 50.0, 4.0, 25.0);
        result = store5.buyBooks();
        Assert.assertEquals((Object)"0 Books, $0 remaining", (Object)result);
    }

    @Test
    public void testBookStoreBigStores() {
        Bookstore store1 = new Bookstore(8.000000099E7, 199.89, 4.03, 50.0);
        String result = store1.buyBooks();
        Assert.assertEquals((Object)"1599942 Books, $38.26 remaining", (Object)result);
        Bookstore store2 = new Bookstore(2.343550445E7, 25.45, 2.0, 2.0);
        result = store2.buyBooks();
        Assert.assertEquals((Object)"11717677 Books, $1.05 remaining", (Object)result);
        Bookstore store3 = new Bookstore(1.425524566E7, 45236.45, 54.3, 40.0);
        result = store3.buyBooks();
        Assert.assertEquals((Object)"421 Books, $11363.21 remaining", (Object)result);
        Bookstore store4 = new Bookstore(9999999.98, 999.99, 9.99, 9.99);
        result = store4.buyBooks();
        Assert.assertEquals((Object)"996041 Books, $0.89 remaining", (Object)result);
        Bookstore store5 = new Bookstore(5000000.0, 300.0, 40.99, 20.99);
        result = store5.buyBooks();
        Assert.assertEquals((Object)"238156 Books, $13.28 remaining", (Object)result);
    }

    @Test
    public void testBookStoreInValidPrices() {
        Boolean result = Bookstore.validateInputs(2.0E9, 50.0, 4.0, 25.0);
        Assert.assertEquals((Object)false, (Object)result);
        result = Bookstore.validateInputs(300.0, 2.0E9, 4.0, 25.0);
        Assert.assertEquals((Object)false, (Object)result);
        result = Bookstore.validateInputs(300.0, 50.0, 51.0, 25.0);
        Assert.assertEquals((Object)false, (Object)result);
        result = Bookstore.validateInputs(300.0, 50.0, 4.0, 55.0);
        Assert.assertEquals((Object)false, (Object)result);
        result = Bookstore.validateInputs(-34560.35, 56.0, 6.0, 20.0);
        Assert.assertEquals((Object)false, (Object)result);
        result = Bookstore.validateInputs(34560.35, -56.0, 6.0, 20.0);
        Assert.assertEquals((Object)false, (Object)result);
        result = Bookstore.validateInputs(34560.35, 56.0, -6.0, 20.0);
        Assert.assertEquals((Object)false, (Object)result);
        result = Bookstore.validateInputs(34560.35, 56.0, 6.0, -20.0);
        Assert.assertEquals((Object)false, (Object)result);
    }
}

