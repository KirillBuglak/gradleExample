package MyCompany.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomeIntegTest {
    // TODO: 9/15/23 This class is created only for class naming purposes

    @Test
    public void someTest(){
        int i = 1;
        System.out.println("INTEGRATION TEST");
        Assertions.assertNotEquals(i,1);
    }
}
