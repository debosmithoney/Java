class CalcuTest{
    public static void main(String[] args) {
        CalcInterface obj = new Calc();
        obj.sum();
        obj.sub();
        obj.multi();
        obj.div();
    }
}

interface CalcInterface {
    public void sum();

    public void sub();

    public void multi();

    public void div();
}

class Calc implements CalcInterface {
    int a = 99, b = 9;

    public void sum() {
        System.out.println("Sum : " + (a + b));
    };

    public void sub() {
        System.out.println("Sub : " + (a - b));
    }

    public void multi() {
        System.out.println("Multi : " + (a * b));
    }

    public void div() {
        System.out.println("Div : " + (a / b));
    }
}
