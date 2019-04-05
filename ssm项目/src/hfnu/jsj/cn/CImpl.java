package hfnu.jsj.cn;

public class CImpl implements C {
    private A a;
    private B b;
    public void setA(A a)
    {
        this.a = a;
    }
    public void setB(B b)
    {
        this.b = b;
    }
    @Override
    public void sleep() {
        this.a.speak();
        this.b.say();
        System.out.println("C is going to sleep");
    }
}
