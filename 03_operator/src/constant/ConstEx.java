package constant;
//패키지는 클래스의 위치를 나타내는 정보이다.
public class ConstEx {
   public static final String GROUP_NAME ="IVE";
    public static void main(String[] args) {
      final int MAX_MEMBER = 6; //d아이브의 멤버 수

        String name ="장원영";
        //static을 올려주고  : main 읽는다.lazy loading(지연로딩)
        name ="안유진";
        System.out.println("아이브 멤버 수:"+MAX_MEMBER);
        System.out.println("그룹 이름:"+ConstEx.GROUP_NAME);

    }
}
