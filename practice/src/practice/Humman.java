package practice;

class Human{  //메인으로 가기 전에 메소드를 정의해 준다.
    String eyes="눈";
    String ears="귀";
    String nose="코";
    String mouth="입";
     
    void useEyes(){
        System.out.println(eyes+"으로 봄");
    }
    void useEars(){
        System.out.println(ears+"로 소리를 들음");
    }
    void useNose(){
        System.out.println(nose+"로 냄새를 맡음");
    }
    void useMouth(){
        System.out.println(mouth+"으로 욕을 함");
    }
}


public class Humman { //여기가 메인이구나.
	 
    public static void main(String[] args){
        Human human=new Human();
        human.eyes="쌍꺼풀 수술한 눈";
        human.useEyes();
        human.useEars();
        human.useNose();
    }
}
 