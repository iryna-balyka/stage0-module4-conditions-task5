package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int a;
        if (year % 400 == 0) {
            a = 0;
        } else if (year % 100 == 0){
            a = 1;
        } else if (year % 4 ==0) {
            a = 0;
        } else a = 1;
        switch (a){
            case 0:
                System.out.println("leap");
                break;
            case 1:
                System.out.println("not leap");
        }
    }
}
