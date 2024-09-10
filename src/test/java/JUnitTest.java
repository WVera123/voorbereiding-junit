import nl.han.ica.oose.dea.testedfizzbuzz.FizzBuzzExecutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    private FizzBuzzExecutor sut;
    @BeforeEach
    public void setup(){
        //Arrange
        sut = new FizzBuzzExecutor();
    }
    @Test
    void executeWithValidIntTest(){
        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals("37", testValue);
    }
    @Test
    void executeFizzWhenDevidedByThree(){

        // Act
        var testValue = sut.execute(3);

        // Assert
        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    void executeBuzzWhenDevidedByFive(){

        // Act
        var testValue = sut.execute(5);

        // Assert
        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    void executeFizzBuzzWhenDevidedByFifteen(){

        // Act
        var testValue = sut.execute(15);

        // Assert
        Assertions.assertEquals("FizzBuzz", testValue);
    }
}
