package ch23_lambda;

public class CalculatorMain {
    // 정적 메서드 정의
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        // 저희가 만든 interface인 calculator를 활용하여 작성할 예정
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        // 정적 메서드 호출합니다.
        System.out.println("2 + 3 = " + operate(2, 3, add));
        System.out.println("2 - 3 = " + operate(2, 3, sub));
        System.out.println("2 * 3 = " + operate(2, 3, mul));
        System.out.println("2 / 3 = " + operate(2, 3, div));

        Calculator div2 = (x, y) -> {
            if (y == 0) {
                System.out.println("0으로 나눌 수 없습니다,.");
                // 24번 라인만 작성하면 오류 발생합니다. 26번라인 필수
                return 0;
            }
            return x / y;
        };

//        System.out.println("4 / 0 = " + operate(3, 0, div));    // 예외 발생
        System.out.println("4 / 0 = " + operate(3, 0, div2));


    }
}
