public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задание №2");
        for (int j=10; j>=1; j-- ) {
            System.out.println(j);
        }
        System.out.println();
        System.out.println("Задание №3");
        for (int a=0; a<17; a=a+2) {
            System.out.println(a);
        }
        System.out.println();
        System.out.println("Задание №4");
        for (int q=10; q>=-10; q--) {
            System.out.println(q);
        }
        System.out.println();
        System.out.println("Задание №5");
        for (int y=1904; y<=2096; y=y+4) {
            System.out.println(y + " год является високосным.");
        }
        System.out.println();
        System.out.println("Задача №6");
        for (int e=7; e<=98; e=e+7) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println("Задача №7");
        for (int t=1; t<=512; t=t*2) {
            System.out.println(t);
        }
        System.out.println();
        System.out.println("Задача №8");
        int monthSaving = 29000;
        int allSaving = 0;
        for (int m = 1; m<=12; m++) {
            allSaving = allSaving+monthSaving;
            System.out.println("Месяц "+ m +", сумма накоплений равна " + allSaving + " рублей.");
        }
        System.out.println();
        System.out.println("Задача №9");
        int monthSav = 29000;
        int allSav = 0;
        for (int n = 1; n<=12; n++) {
            allSav=allSav + allSav/100;
            allSav=allSav+monthSav;
            System.out.println("Месяц "+ n +", сумма накоплений равна " + allSav + " рублей.");
        }
        System.out.println();
        System.out.println("Задача №10");
        int result;
        for (int t=1; t<=10; t++) {
            result=2*t;
            System.out.println("2*"+t+"="+result);
        }
    }
}