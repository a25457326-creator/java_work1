package longin;
//아이디 : human / 비밀번호 : 1111
//아이디만 넣었을 때
//비밀번호만 넣었을 때
//둘 다 넣었을 때

public class LonginMain {
    static void main(String[] args) {
        //1. LoginCheck 생성
        LonginCheck longinCheck =new LonginCheck();

        //2.로그인 정보 생성
        String id="human";
        int password =1111;
        //2.아이디 확인
        if (longinCheck.isLoginOk(id)) {
            System.out.println("옳바른 아이디에요");
        } else{
            System.out.println("아이디를 확인하세요");
        }
        //3.비밀번호 확인
        if (longinCheck.isLoginOk(password)) {
            System.out.println("옳바른 비밀번호에요");
        } else{
            System.out.println("비밀번호를 확인하세요");

            //4.둘 다확인
            if(longinCheck.isLoginOk(id, password)) {
                System.out.println("로그인 성공");
            } else{
                System.out.println("로그인 실패");
    }
}
