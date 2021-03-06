package c.impl.list;

public enum HealthInsurance {
    LEVEL_ONE(1.0,1000),
    LEVEL_TWO(2.0,2000),
    LEVEL_THREE(3.2,3000),
    LEVEL_FOUR(4.5,4000),
    LEVEL_FIVE(5.6,5000),
    LEVEL_SIX(7.1,6000);

    private final double ratio;
    private final int maxSalary;
    HealthInsurance(double ratio, int maxSalary){
        this.ratio=ratio;
        this.maxSalary=maxSalary;

    }
    public double getRatio(){
        return ratio;
    }
    public static HealthInsurance getHealthInsurance(int salary) {
        if(salary<1000) {
            return LEVEL_ONE;
        } else if(salary<2000) {
            return LEVEL_TWO;
        } else if(salary<3000) {
            return LEVEL_THREE;
        } else if(salary<4000) {
            return LEVEL_FOUR;
        } else if(salary<5000) {
            return LEVEL_FIVE;
        } else {
            return LEVEL_SIX;
        }
    }
}
