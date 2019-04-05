package hfnu.jsj.cn;

public class BImpl implements B {
    private A a;
    public void setA(A a)
    {
        this.a = a;
    }
    @Override
    public void say() {
        this.a.speak();
        System.out.println("B say hi!");
    }
}
