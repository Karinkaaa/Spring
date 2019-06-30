package spring.component;

import org.junit.Test;
import org.junit.Assert;

public class NumberAdderTest {

    @Test
    public void add() {
        OperationComponent component = new OperationComponent();
        int param1 = 1;
        int param2 = 2;
        int expect = 4;
        Assert.assertEquals(expect, component.add(param1, param2, expect));
    }
}