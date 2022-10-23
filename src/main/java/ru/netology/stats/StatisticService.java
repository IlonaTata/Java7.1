package ru.netology.stats;

public class StatisticService {

    public int generalSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        int i = 12;
        int sumMonth = generalSales(sales) / i;

        return sumMonth;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lessAverage(int[] sales) {
        int Mouth = averageAmount(sales);
        int mouthLessMouth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < Mouth) {
                mouthLessMouth++;
            }
        }
        return mouthLessMouth;
    }

    public int moreAverage(int[] sales) {
        int sumMouth = averageAmount(sales);
        int moreMouth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sumMouth) {

                moreMouth++;
            }
        }
        return moreMouth;
    }

}




