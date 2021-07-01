package d.lang;

public class NumberObjects {
    public long parseLong(String data){
        try{
            return Long.parseLong(data);
        }catch (NumberFormatException e){
            System.out.println(data+" is not a number.");
            return -1;
        }
    }

    public void printOtherBase(long value){
        System.out.println(Long.toBinaryString(value));
        System.out.println(Long.toHexString(value));
        System.out.println(Long.toOctalString(value));

    }
    public static void main(String[] args){
        NumberObjects obj = new NumberObjects();

        obj.printOtherBase(obj.parseLong("aas"));
        obj.printOtherBase(obj.parseLong("1024"));


    }


}
