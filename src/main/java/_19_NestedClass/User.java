package _19_NestedClass;

// User클래스에 빌더패턴을 적용시켜 주세요!
//public class User {
//    private String username;
//    private String password;
//
//    private User (Bd bd) {
//        this.username = bd.username;
//        this.password = bd.password;
//    }
//
//    public static Bd bd() {
//        return new Bd(); // 빌더의 기본생성자(필드 초기화 안되어있음)
//    }
//
//    public static class Bd {
//        private String username;
//        private String password;
//
//        public Bd username(String username) {
//            this.username = username;
//            return this;
//        }
//        public Bd password(String password) {
//            this.password = password;
//            return this;
//        }
//    }
//
//    public User bd() {
//        User r = new User(this);
//        return r;
//    }
//
//}
