package c.impl.list;

public class test {
    public static void main(String[] args){

        HealthInsurance[] value =new HealthInsurance[3];
        value[0] = HealthInsurance.getHealthInsurance(1500);
        value[1] = HealthInsurance.getHealthInsurance(5500);
        value[2] = HealthInsurance.getHealthInsurance(8000);

        for(int i=0;i<3;i++){
            System.out.println(value[i]+""+value[i].getRatio());
        }

    }

}
