import java.lang.String;
class TestBank{
    public static void main(String[] args) {
        Bank b;
        b= new MySBI();
        System.out.println(b.getRateOfInterest());
        System.out.println(b.getBankName());
        b= new MyPNB();
        System.out.println(b.getRateOfInterest());
        System.out.println(b.getBankName());
    }
}

abstract class Bank {
    abstract double getRateOfInterest();
    String getBankName() {
        return "No Specilised Bank";
    };
}

class MySBI extends Bank {
    double getRateOfInterest() {
        return 8.35;
    }
    String getBankName() {
        return "SBI Bank";
    }
}
class MyPNB extends Bank {
    double getRateOfInterest() {
        return 7.35;
    }
    String getBankName() {
        return "PNB Bank";
    }
}