import javax.swing.*;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Testjong {

    public static void main(String[] args) {
        //evenOrOdd();
        //maxNum();
        // incentive();
        //Grading();
        //welcom();
        //swtichTest();
        //Grading2();
        //stringIf();
        DaysInMonth();
    }

    public static void evenOrOdd() {
        Scanner input = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");
        int val = input.nextInt();

        if (val % 2 == 0) {
            System.out.println("입력된 정수는 짝수입니다.");
        } else {
            System.out.println(("입력된 정수는 홀수입니다."));
        }
        System.out.println(("프로그램이 종료되었습니다."));
        input.close();
    }

    public static void maxNum() {
        /*
        두개의 정수를 입력받아,더 큰 수를 출력하라
         */
        Scanner input = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int num1 = input.nextInt();
        System.out.println("두번째 정수 : ");
        int num2 = input.nextInt();

        int max;
        if (num1 > num2) {
            max = num1;
        } else {         //NUM1과 NUM2는 반드시 다른 값이 입력된다고 가정
            max = num2;
        }
        if (num1 > num2) {
            System.out.println("큰 수는: " + num1);
        } else {
            System.out.println("큰 수는:" + num2);
        }
        input.close();
    }

    public static void incentive() {
        //목표 실적 상수로 정의하자
        final int TARGET_SALES = 1000;
        int mySales; // 나의 실적을 저장할 변수
        //초과실적의 10%를 성과급으로 받는다. 단, 소숫점 이하는버린다. 성과급은 정수값으로 지급.
        int bonus = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("실적으로 입력하시오(단위: 만원) :");
        mySales = input.nextInt();

        //내 실적이 목표 실적을 초과했는지 검사.

        if (mySales > TARGET_SALES) {//목표 실적 초과한 경우
            //bonus =(int)((mySales - TARGET_SALES)* 0.1);
            bonus = (mySales - TARGET_SALES) / 10;
        } /* else {// 목표 실적 초과하지 않은 경우
            bonus = 0;
    } */
        System.out.println("실적은" + bonus);
        input.close();
    }

    public static void Grading(){
        /*
         *  성적을 입력받고 그 성적에 해당하는 A~F 등급을 출력
         */
        Scanner input = new Scanner(System.in);
        System.out.println("성적을 입력하시오: ");
        int score = input.nextInt();
        //score가 90~ 100이면 a
        if (score >= 90){
            System.out.println("학점 A");
        } //score 가 80~89이면 b
        else if (score >= 80 /*&& score < 90*/){
            System.out.println("학점 B");
        } //score 가 70~ 79이면 c
        else if (score >= 70 /*&& score <80*/ ){
            System.out.println("학점 C");
        } //score 가 60~69이면 D
        else if (score >= 60 /*&& score < 70 */){
            System.out.println("학점 D");
        } //score 가 50~69 이면 F 
        else 
            System.out.println("학점 F");
        input.close();
    }
    public static void welcom() {
        LocalDateTime dateTime = LocalDateTime.now();

        int currentHour = dateTime.getHour();

        if (currentHour < 11){     // 0~ 10시 까지
            System.out.println(("Good morning"));
        }else if (currentHour < 15){ // 11시 ~ 14시 까지
            System.out.println(("Good afternoon"));
        }else if (currentHour < 20){ // 15 ~ 20시 까지
            System.out.println(("Good evening"));
        }else { // 20 ~ 23시
            System.out.println(("Good night"));
        }

        // 계절에 맞는 인사말 출력하기
        System.out.println(dateTime.getMonth());
        System.out.println((dateTime.getMonthValue()));
        // 봄 : good Spring 여름: 많이 덥지요. 가을 : 날씨가 선선하네요 겨울: 많이 춥네요

    }
    public static void swtichTest(){
        Scanner input = new Scanner(System.in);
        // 사용자로부터 0 이상의 값을 입력받는다
        // 0을 입력받으면 "없음"을 출력
        // 1을 입력받으면 "하나"를 출력
        // 2를 입력받으면 "둘"을 출력
        // 3이상을 입려받으면"많음" 을 출력
        System.out.println("0 이상의 정수를 입력하세요 : ");
        int number = input.nextInt();
        /*
         *  if (number -- 0){
         * }else if (number == 1){
         * }else if (number == 2){
         * }else{
         * }         */

        switch(number) {
            case 0 :
                System.out.println("없음");
                break;
            case 1 :
                System.out.println("하나");
                break;
            case 2 :
                System.out.println("둘");
                break;
            default :
            System.out.println("많음");
        }
    
    }
    public static void Grading2(){
        // switch 문을 이용해 입력받은 점수에 따라 학점을 A ~ F 까지 출력
        Scanner input = new Scanner(System.in);
        System.out.println("성적을 입력하세요 : ");
        int score = input.nextInt();


        // score 가 90인 경우 score/10의 값은? 9.8 x .9
        // score 가 77인 경우 score/10의 값은? 6
        //----
        //score 90 ~ 99 일때 score/10의 값은 ? 9
        //score 80 ~ 89 일때 score/10의 값은? 8
        int gradeNum = score/10;
        char grade;
        switch (gradeNum) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'c';
                break;
            case 6:
                grade = 'd';
                break;
            default:
                grade = 'F';
        }

        System.out.println("학점 : " + grade);
        input.close();
    }
    public static void stringSwitch(){
        /*
         * 월의 이름을 영어로 입력받자
         * 그 영어로 입력받은 일에 해당하는 숫자를 쓰시오
         * jenuary 1
         * february 2
         * march 3
         * april 4
         * may 5
         * june 6
         * july 7
         * august 8
         * september 9
         * october 10
         * november 11
         * december 12
         */ 
        Scanner input = new Scanner(System.in);
        System.out.println("월의 이름을 영어로 입력하시오 : ");
        String month = input.next();
        month = month.toLowerCase(); //month 의 값을 소문자로 변환
        int monthNum = 0;
        switch (month) {
            case "jenuary":
                monthNum = 1;
                break;
            case "february":
                monthNum = 2;
                break;
            case "march":
                monthNum = 3;
                break;
            default:
                monthNum = 4;
        }
        if (monthNum > 3){
            System.out.println("4 이상");
        }

        input.close();
    }
    public static void stringIf(){
        Scanner input = new Scanner(System.in);
        System.out.println("월의 이름을 영어로 입력하시오 : ");
        String month = input.next();
        //month = month.toLowerCase(); //month 의 값을 소문자로 변환
        //equalsIgnoreCase 도 가능 
        int monthNum = 0 ;
        if (month.equalsIgnoreCase("jenuary")) {
            monthNum = 1;
        }else if (month.equalsIgnoreCase("february")) {
            monthNum = 2;
        }else if (month.equalsIgnoreCase("march")) {
            monthNum = 3;
        }else {
            monthNum = 4;
        }

        if (monthNum > 3) {
            System.out.println("4 이상");
        }else if (monthNum > 2){
            System.out.println("3 이상");
        }
        input.close();
    }
    public static void DaysInMonth(){
        int month;
        int days = 0;

        System.out.println("일수를 알고 싶은 월을 입력하시오 : ");
        Scanner input = new Scanner(System.in);

        month = input.nextInt();
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 31;
                break;
        }
        System.out.println("월의 날수는 " + days );
    }

    
}
