package hfnu.jsj.cn;

public class DImpl implements D {
    private A a;
    private B b;
    private C c;
    public void setA(A a)
    {
        this.a = a;
    }
    public void setB(B b)
    {
        this.b = b;
    }
    public void setC(C c)
    {
        this.c = c;
    }
    @Override
    public void eat() {
        this.a.speak();
        this.b.say();
        this.c.sleep();
        System.out.println("D eat vegetables");
    }
}
