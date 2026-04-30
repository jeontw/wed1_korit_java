package _16_Interface;

// 인터페이스
public interface Animal {
    // 필드가 존재하지 않음(heap메모리가 x)
    // static은 선언가능(상수만)
    // public static final가 생략되어 있음
    public static final String name = "포유류";

    // 모든 메서드는 public abstract 취급
    public abstract void sound();
    void move();
}
