class MultiTest{
    public static void main(String[] args) {
        Z obj = new Sub();
        obj.methodX();
        obj.methodY();
        obj.methodZ();
    }
}

interface X {
    public void methodX();
}

interface Y {
    public void methodY();
}

interface Z extends X, Y {
    public void methodZ();
}

class Sub implements Z {
    public void methodX() {
        System.out.println("MethodX");
    }

    public void methodY() {
        System.out.println("MethodY");
    }

    public void methodZ() {
        System.out.println("MethodZ");
    }
}