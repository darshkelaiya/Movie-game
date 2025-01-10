
    class A {
    public A() {
        System.out.println("A");
    }
}

class AA extends A {
    public AA() {
        System.out.println("AA");
    }
}

class AAA extends AA {
    public AAA() {
        System.out.println("AAA");
    }
}

public class Test {
    public static void main(String[] args) {
        AA obj = new AAA();
    }
}
