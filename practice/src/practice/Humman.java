package practice;

class Human{  //�������� ���� ���� �޼ҵ带 ������ �ش�.
    String eyes="��";
    String ears="��";
    String nose="��";
    String mouth="��";
     
    void useEyes(){
        System.out.println(eyes+"���� ��");
    }
    void useEars(){
        System.out.println(ears+"�� �Ҹ��� ����");
    }
    void useNose(){
        System.out.println(nose+"�� ������ ����");
    }
    void useMouth(){
        System.out.println(mouth+"���� ���� ��");
    }
}


public class Humman { //���Ⱑ �����̱���.
	 
    public static void main(String[] args){
        Human human=new Human();
        human.eyes="�ֲ�Ǯ ������ ��";
        human.useEyes();
        human.useEars();
        human.useNose();
    }
}
 