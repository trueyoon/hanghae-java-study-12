package hanjiyoon.report7;

//6-21. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
//        메서드명: abs
//        기능 : 주어진 값의 절대값을 반환한다.
//        반환타입 : int
//        매개변수 : int value
class Exercise6_21 {
    /* (1) abs 메서드를 작성하시오. */
    public static int abs(int value){
//        if (value < 0) { return -value;}
//        else {return value;}
        return Math.abs(value);
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값: " + abs(value));
        value = -10;
        System.out.println(value + "의 절대값: " + abs(value));
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10