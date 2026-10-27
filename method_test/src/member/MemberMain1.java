package member;

public class MemberMain1 {
    static void main(String[] args) {
      //1. info 클래스를 new로 생성한다.
      Info1 info =new Info1();
      //2. 필요한 케서드를 호출한다.
       String result = info.memberInfo("안유진");
        System.out.println(result);

        result = info.memberInfo("안유진",26);
        System.out.println(result);

        result = info.memberInfo("안유진",26,173.2);
        System.out.println(result);

    }
}
