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
        MathOperation sut = new MathOperation();

        // ACT
        boolean equals = sut.compare(a, b);

        // ASSERT
        assertThat(equals, is(Boolean.FALSE));
    }

    @Test public void
    shouldCompareTwoEqualsIntegers(){

        // ARRANGE
        int a = 10;
        int c = 10;
        MathOperation sut = new MathOperation();

        // ACT
        boolean equals = sut.compare(a, c);

        // ASSERT
        assertThat(equals, is(Boolean.TRUE));

    }

}
