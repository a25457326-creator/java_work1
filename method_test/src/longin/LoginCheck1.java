package longin;

public class LoginCheck {

        // 기준 정보 설정
        private String correctId = "human";
        private String correctPw = "1111";

        // 1. 아이디만 넣었을 때 확인 (맞으면 true, 틀리면 false)
        public boolean check(String id) {
            if (id == null) {
                return false;
            }
            return correctId.equals(id);
        }

        // 2. 비밀번호만 넣었을 때 확인 (맞으면 true, 틀리면 false)
        public boolean checkPassword(String password) {
            if (password == null) {
                return false;
            }
            return correctPw.equals(password);
        }

        // 3. 아이디와 비밀번호 둘 다 넣었을 때 확인 (맞으면 true, 틀리면 false)
        public boolean check(String id, String password) {
            if (id == null || password == null) {
                return false;
            }
            return correctId.equals(id) && correctPw.equals(password);
        }
    }
2. LoginMain.java (실행 및 테스트 클래스)
    Java
package login;

    public class LoginMain {
        public static void main(String[] args) {
            LoginCheck
}
}
