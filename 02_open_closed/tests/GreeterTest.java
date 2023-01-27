import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {
    @Test
    public void testSaysHello() {
        Greeter greeter = new Greeter();
        assertEquals("Hello.", greeter.greet());
    }

    @Test
    public void testSaysHelloFormally() {
        Greeter greeter = new Greeter(new FormalFormality());
//        greeter.setFormality("formal");
        assertEquals("Good evening", greeter.greet());
    }

    @Test
    public void testSaysHelloCasually() {
        Greeter greeter = new Greeter(new CasualFormality());
//        greeter.setFormality("casual");
        assertEquals("Goodday?", greeter.greet());
    }

    @Test
    public void testSaysHelloIntimately() {
        Greeter greeter = new Greeter(new IntimateFormality());
//        greeter.setFormality("intimate");
        assertEquals("Hello darling!", greeter.greet());
    }
}
