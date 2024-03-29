import study.stepup.fraction.Fractionable;

public class TestFraction implements Fractionable {
    private int num;
    private int denum;
    private int cnt = 0;
    public TestFraction(int num, int denum){
        if (denum == 0) throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        this.num = num;
        this.denum = denum;
    }

    public int getCnt() {
        return cnt;
    }

    @Override
    public void setNum(int num) {
        this.num = num;
    }
    @Override
    public void setDenum(int denum) {
        this.denum = denum;
    }
    @Override
    public double doubleValue(){
        //System.out.println("invoke double value");
        cnt++;
        return (double) num/denum;
    }
}
