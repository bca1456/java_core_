package task5;

public class A {
    private String q;
    private Integer a;
    private boolean z;

    public String getQA(){
        return q + a;
    }

    public double pow2A(){
        return Math.pow(a, 2);
    }

    @Override
    public String toString() {
        return "A{" +
                "q='" + q + '\'' +
                ", a=" + a +
                ", z=" + z +
                '}';
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public boolean isZ() {
        return z;
    }

    public void setZ(boolean z) {
        this.z = z;
    }

    public A(String q, Integer a, boolean z) {
        this.q = q;
        this.a = a;
        this.z = z;
    }
}
