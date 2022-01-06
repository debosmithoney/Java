public class ConstChain {
    ConstChain() {
        this("");
        System.out.println("Default");
    }

    ConstChain(String str) {
        System.out.println("Parameterised");
    }

    public static void main(String[] args) {
        ConstChain obj = new ConstChain();
    }
}
