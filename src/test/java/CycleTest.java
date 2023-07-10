import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

import ru.netology.services.Cycle;

public class CycleTest {

    @Test

    void ShouldCalculate3Month() {
        Cycle service = new Cycle();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int excepted = 3;
        int actual = service.calculate(income, expenses, threshold);

        System.out.println(excepted + "|" + actual);
        Assertions.assertEquals(excepted, actual);
    }

    @Test

    void ShouldCalculate2Month(){
        Cycle service = new Cycle();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int excepted = 2;
        int actual = service.calculate(income, expenses, threshold);

        System.out.println(excepted + "|" + actual);
        Assertions.assertEquals(excepted, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "CycleTest.csv")

    void TestSeveralCycles(int income, int expenses, int threshold, int excepted){
        Cycle service = new Cycle();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(excepted, actual);
    }

}


