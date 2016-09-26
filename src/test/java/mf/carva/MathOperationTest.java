package mf.carva;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class MathOperationTest {

    @Test
    public void
    shouldCompareTwoInteger(){
        
        // ARRANGE
        int a = 10;
        int b = 20;

        // ACT
        MathOperation sut = new MathOperation();
        sut.compare(a,b);
        
        // ASSERT
        assertThat(a,is(equalTo(b)));
    }

}
