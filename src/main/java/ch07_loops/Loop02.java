package ch07_loops;
/*

 */
public class Loop02 {
    public static void main(String[] args) {
        // 1일차 1교시입니다 ~ 1일차 3교시입니다 / 5일차 3교시입니다.
//        int day = 1;
//        while ( day < 6 ) {
//            int lesson = 1;                 // 반복문 내에 변수를 선언하고 초기화했습니다.
//            while(lesson < 4 ) {
//                System.out.println(day + "일차" + lesson + "교시입니다.");
//                lesson++;
//            }
//            day++;
//        }

        // 이상의 코드를 응용하여
        /*
            2 x 1 = 2
            2 x 2 = 4
            ...
            9 x 9 = 81
            가 출력되도록 2중 while문을 작성하시오.
         */
        int dan = 2;
        while ( dan < 10 ) {
            int num = 1;
            while(num < 10) {
                System.out.println(dan + " x " + num + " = " + (dan*num));
                num++;
            }
            dan++;
        }
    }
}
