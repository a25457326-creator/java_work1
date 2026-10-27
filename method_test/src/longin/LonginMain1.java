package longin;

public class LonginMain {
    //LoginMain 아이디: human/ 비밀번호:1111
    //1.아이디만 넣었을 때
    //2.비밀번호만 넣었을 때
    //3.둘 다 넣었을 때
    LoginCheck checker = new LoginCheck();

        System.out.println("=== 로그인 검증 프로그램 테스트 ===\n");

    // 1. 아이디만 넣었을 때 테스트
        System.out.println("1. 아이디만 넣었을 때 ('human' 입력):");
        System.out.println("결과: " + checker.check("human")); // true 예상
        System.out.println("결과 (틀린 아이디 'admin'): " + checker.check("admin")); // false 예상

        System.out.println("-----------------------------------");

    // 2. 비밀번호만 넣었을 때 테스트
        System.out.println("2. 비밀번호만 넣었을 때 ('1111' 입력):");
        System.out.println("결과: " + checker.checkPassword("1111")); // true 예상
        System.out.println("결과 (틀린 비밀번호 '0000'): " + checker.checkPassword("0000")); // false 예상

        System.out.println("-----------------------------------");

    // 3. 아이디와 비밀번호 둘 다 넣었을 때 테스트
        System.out.println("3. 아이디와 비밀번호 둘 다 넣었을 때 ('human', '1111' 입력):");
        System.out.println("결과: " + checker.check("human", "1111")); // true 예상
        System.out.println("결과 (아이디만 맞고 비번이 틀린 경우): " + checker.check("human", "1234")); // false 예상
}
}
        📌 주요 특징
//메서드 오버로딩(Overloading) 개념을 적용하여 매개변수의 개수(1개 또는 2개)에 따라 알맞은 검증 메서드가 실행되도록 설계했습니다.

//아이디와 비밀번호가 기준 정보(human, 1111)와 일치하는지 equals() 메서드를 사용해 안전하게 비교합니다.
}

