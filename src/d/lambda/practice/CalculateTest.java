package d.lambda.practice;

public class CalculateTest{
    public static void main(String[] args){
        Calculate calculateAdd = (a,b) -> a+b;
        System.out.println(calculateAdd.operation(1,2));
        Calculate calculateSub = (a,b) -> a-b;
        System.out.println(calculateSub.operation(3,4));
    }
    interface Calculate{
        int operation(int a,int b);
    }
}
