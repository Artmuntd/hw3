public class Main {
    public static void main(String[] args) {

        // дз 1
        boolean isAlive = true;
        System.out.println( "Значение переменной  isAlive  типом boolean равно true");
        byte a = 3;
        System.out.println( "Значение переменной  byte  типом byte равно 3");
        int b = 3;
        System.out.println( "Значение переменной  int  типом byte равно 3");
        short c = 3;
        System.out.println( "Значение переменной  short  типом byte равно 3");
        long d = 3;
        System.out.println( "Значение переменной  long  типом byte равно 3");
        float x = 8.5F;
        System.out.println( "Значение переменной  float  типом byte равно 8.5");
        double y = 2.7;
        System.out.println( "Значение переменной  double  типом byte равно 8.5");

        // дз 2
        float first = 27.1F;
        long coed = 987_678_965_549l;
        double coed3 = 2.786;
        boolean coed4 = false;
        char coed5 = 569;
        short coed6 = -159;
        int coed7 = 27897;
        byte coed8 = 67;

        //дз 3
         int pupilsInFirstClass = 23;
         int pupilsInSecondClass = 27;
         int pupilsInThirdClass = 30;
         int papersCount = 480;
         int papersPerPupil = papersCount / (pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass);
         System.out.println( "На каджого ученика рассчитано "+ papersPerPupil + " листов бумаги");

        //дз 4
        int bottles = 16;
        int minutes = 2;
        int twentyMinutes = 20;
        int minutesInDay = 24 * 60;
        int mintesInThreeDays = 3 * minutesInDay;
        int mintesInMonth = 10 * mintesInThreeDays;

        // дз 5
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);

}

}

