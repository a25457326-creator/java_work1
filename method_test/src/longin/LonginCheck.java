package longin;
//아이디 : human / 비밀번호 : 1111
//아이디만 넣었을 때
//비밀번호만 넣었을 때
//둘 다 넣었을 때

public class LonginCheck {
    //아이디 확인
    public boolean isLoginOk(String id){
        if(id=="human") {
            return ture;
        }else{
            return false;
        }
    }
    //비밀번호 확인
    public boolean isLoginOk(int pw) {
        if (pw == 1111) return true;
        return false;
    }
    //아이디와 비번 확인
    public boolean isLoginOk(String id,int pw){
        if(id=="human"&& pw=1111) {
            return ture;
        }else{
            return false;
        }



    }
}
