import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import ru.netology.stats.StatisticService;

public class StatsServiceTest {
    @Test

    public void findGeneralSales() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 180;
        int actualsales = service.generalSales(sales);
        Assertions.assertEquals(expectedSales, actualsales);
    }

    @Test
    public void findAverageamount() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.averageAmount(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void findMaxSales() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMax = 6;
        int actualMax = service.maxSales(sales);
        Assertions.assertEquals(expectedMax, actualMax);

    }

    @Test
    public void findMinSales() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 9;
        int actualMin = service.minSales(sales);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void findlessAverage() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedLess = 5;
        int actualLess = service.lessAverage(sales);
        Assertions.assertEquals(expectedLess, actualLess);
    }

    @Test
    public void findmoreAverage() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 5;
        int actualsales = service.moreAverage(sales);
        Assertions.assertEquals(expectedSales, actualsales);
    }
}