public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int apples = 40000;
        byte oranges = 100;
        short pears = 30000;
        long cherry = 3000000L;
        float sugar = 123.456789f;
        double salt = 98.76543210567d;
        System.out.println("Значение переменной apples с типом int равно " + apples);
        System.out.println("Значение переменной oranges с типом byte равно " + oranges);
        System.out.println("Значение переменной pears с типом short равно " + pears);
        System.out.println("Значение переменной cherry с типом long равно " + cherry);
        System.out.println("Значение переменной sugar с типом float равно " + sugar);
        System.out.println("Значение переменной salt с типом double равно " + salt);

        //Задание 2
        System.out.println("Задание 2");
        float firstVar = 27.12f;
        long secondVar = 987678965549L;
        double thirdVar = 2.786;
        int fourthVar = 569;
        short fifthVar = -159;
        short sixthVar = 27897;
        byte seventhVar = 67;
        System.out.println(firstVar);
        System.out.println(secondVar);
        System.out.println(thirdVar);
        System.out.println(fourthVar);
        System.out.println(fifthVar);
        System.out.println(sixthVar);
        System.out.println(seventhVar);

        //Задание 3
        System.out.println("Задание 3");
        short teacherLyudmilaP = 23;
        short teacherAnnaS = 27;
        short teacherEkaterinaA = 30;
        int students = teacherLyudmilaP + teacherAnnaS + teacherEkaterinaA;
        short paper = 480;
        int studentPaper = paper / students;
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");

        //Задание 4
        System.out.println("Задание 4");
        int bottlePerMinute = 16 / 2;
        int time1 = 20;
        int time2 = 60 * 24;
        int time3 = time2 * 3;
        int time4 = time2 * 30;
        int bottlesPer20Minutes = bottlePerMinute * time1;
        int bottlesPerDay = bottlePerMinute * time2;
        int bottlesPer3Days = bottlePerMinute * time3;
        int bottlesPerMonth = bottlePerMinute * time4;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        //Задание 5
        System.out.println("Задание 5");
        byte paintCans = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int classroom = paintCans / (whiteColor + brownColor);
        int whitePaintCans = classroom * whiteColor;
        int brownPaintCans = classroom * brownColor;
        System.out.println("В школе, где " + classroom + " классов, нужно " + whitePaintCans + " банок белой краски и " + brownPaintCans + " банок коричневой краски");

        //Задание 6
        System.out.println("Задание 6");
        short bananas = 5;
        short milk = 200 / 100;
        short iceCream = 2;
        short eggs = 4;
        float bananaVol = 80;
        float milkVoltPer100 = 105;
        float iceCreamVol = 100;
        float eggsVol = 70;
        float bananaWeight = bananas * bananaVol;
        float milkWeight = milkVoltPer100 * milk;
        float iceCreamWeight = iceCream * iceCreamVol;
        float eggsWeight = eggs * eggsVol;
        float kilo = 1000;
        float totalWeight = (bananaWeight + iceCreamWeight + milkWeight + eggsWeight) / kilo;
        System.out.println("Вес спортзавтрака " + totalWeight + " кг");

        //Задание 7
        System.out.println("Задание 7");
        int weight = 7;
        int weightInGrams = weight * 1000;
        int portion1 = 250;
        int portion2 = 500;
        int maxDays = weightInGrams / portion1;
        int minDays = weightInGrams / portion2;
        int[] averageDays = {maxDays, minDays};
        int result = 0;
        for (int m : averageDays) {
            result += m;
        }

        System.out.println("При потере 250 грамм в день, спортсмен сбросит необходимый вес за " + maxDays + " дней");
        System.out.println("При потере 500 грамм в день, спортсмен сбросит необходимый вес за " + minDays + " дней");
        System.out.println("В среднем требуется " + result / averageDays.length + " дней, чтобы сбросить необходимый вес");

        //Задание 8
        System.out.println("Задание 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        byte months = 12;
        int revenueMasha = salaryMasha * months;
        int revenueDenis = salaryDenis * months;
        int revenueKristina = salaryKristina * months;
        float newSalaryMasha = salaryMasha * 1.1f;
        float newSalaryDenis = salaryDenis * 1.1f;
        float newSalaryKristina = salaryKristina * 1.1f;
        float newRevenueMasha = newSalaryMasha * months;
        float newRevenueDenis = newSalaryDenis * months;
        float newRevenueKristina = newSalaryKristina * months;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + (newRevenueMasha - revenueMasha) + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + (newRevenueDenis - revenueDenis) + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + (newRevenueKristina - revenueKristina) + " рублей");
    }
}