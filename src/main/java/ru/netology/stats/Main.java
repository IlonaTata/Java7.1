package ru.netology.stats;

public class Main {

    public static void main(String[] args) {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualsales = service.generalSales(sales);
        System.out.println(actualsales);

        StatisticService less = new StatisticService();
        int mouthLessMouth = less.lessAverage(sales);
        System.out.println(mouthLessMouth);

    }
}