package MyCompany.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DTOModelTest {
    private static DTOModel model;

    @BeforeAll
    public static void init() {
        model = new DTOModel();
    }

    @Test
    public void getNameTest() {
        System.out.println("Starting getNameTest");
        final String name = "Greg";
        model.setName(name);
        assertEquals(name, model.getName(), "getName method FAILS");
    }
}
