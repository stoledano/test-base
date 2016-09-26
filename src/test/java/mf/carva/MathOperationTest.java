package mf.carva;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MathOperationTest {

    @Test
    public void
    shouldCompareTwoInteger() {

        // ARRANGE
        int a = 10;
        int b = 20;

        // ACT
        MathOperation sut = new MathOperation();
        boolean equal = sut.compare(a, b);

        // ASSERT
        assertThat(equal, is(Boolean.FALSE));
    }

}
