class num1 {
    protected int x;
    num1(int a) {
        x = a;
    }
}

class num2 extends num1 {
    protected int y;
    num2(int a, int b) {
        super(a);
        y = b;
    }
}

class tot extends num2 {
    tot(int a, int b) {
        super(a, b);
    }

    void total() {
        int tot = x + y;
        System.out.println(tot);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        tot t1 = new tot(10, 20);
        t1.total();
    }
}
