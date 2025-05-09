package ch09_classes;

public class Car {
    /*
        색상(빨강/노랑 etc), 속도(100, 200 etc) 필드를 정의하고
        drive() / break() / displayCarInfo() 메서드를 정의하시오.
        1. drive() 결과값
            : 빨강 자동차가 주행 중입니다.
              최고 속도는 100 입니다.
        2. break() 결과값
            : 빨강 자동차가 멈췄습니다.
        3. displayInfo() 결과값
            : 이 차의 색깔은 빨강색이고,
              최고 속도는 100km/h입니다. 그냥저냥입니다. -> 이 뒷 부분을 if문으로 쓸겁니다.

              이차의 색깔은 노랑색이고,
              최고 속도는 200km/h입니다. 빠릅니다.      -> 100이하면 그냥저냥 100 초과면
                                                      빠릅니다가 출력될 수 있도록
                                                       메서드를 정의하시오.
       다 작성하시면 car1의 색깔 빨강 / 속도 100으로 생성
       car2의 색깔 노랑 / 속도 200으로 생성한 후
       각각 drive()/break()/displayCarInfo()를 실행하시고, 콘솔창에 결과를 출력하시오.
     */
    int speed;
    String color;
    // 생성자를 배우면 해결되는 개념
//    String eval2 = (speed > 100 ? "빠릅니다." : "그냥저냥입니다." );

    public void dirve(){
        System.out.println(color + "자동차가 주행 중입니다.\n최고 속도는 " + speed + "입니다.");
    }

    public String brake(){
        return color + "자동차가 멈췄습니다.";
    }

    public void displayInfo(){
        String eval = (speed > 100 ? "빠릅니다." : "그냥저냥입니다." );
        System.out.println("이차의 색깔은 " + color + "이고, ");
        System.out.println("최고 속도는 " + speed + "km/h입니다." + eval);
    }

    // Constructor / ConstructorMain -> main
}
