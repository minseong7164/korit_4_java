package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        // 객체 생성
        ObjectTest objectTest1 = new ObjectTest("김민성","부산광역시 사상구");
        objectTest1.displayInfo();
        System.out.println();
        System.out.println(objectTest1);

        Teacher teacher1 = new Teacher("김교사","부산해사고등학교");
        System.out.println(teacher1);

    }
}
