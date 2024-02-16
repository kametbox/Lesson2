package study.stepup.fraction;

public interface Fractionable {
    @Cache
    double doubleValue();
    @Mutator
    void setNum(int num);
    @Mutator
    void setDenum(int denum);
}
