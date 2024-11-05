public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Ashum ashum = new Ashum();
        Ashum ashum1=new Ashum(2);
        Ashum ashum2=new Ashum(3,ashum1);
        System.out.println(ashum+"\n"+ashum1+"\n"+ashum2);
    }
}

class Ashum {
    int val;
    Ashum ashum;

    public Ashum() {
    }

    public Ashum(int val) {
        this.val = val;
    }

    public Ashum(int val, Ashum ashum) {
        this.val = val;
        this.ashum = ashum;
    }
}
