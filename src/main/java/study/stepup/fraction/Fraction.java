package study.stepup.fraction;

public class Fraction implements Fractionable{
    private int num;
    private int denum;
    public  Fraction(int num, int denum){
        if (denum == 0) throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        this.num = num;
        this.denum = denum;
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
        return (double) num/denum;
    }
}
