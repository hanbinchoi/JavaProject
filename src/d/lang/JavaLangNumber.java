package d.lang;

public class JavaLangNumber {
    public static void main(String[] args){
        JavaLangNumber sample = new JavaLangNumber();
        sample.numberTypeCheck();

    }
    public void numberTypeCheck(){
        String value1 = "3";
        String value2 = "5";

        byte byte1 = Byte.parseByte(value1);
        byte byte2 = Byte.parseByte(value2);

        System.out.println(byte1+byte2);

        Integer refInt1 = Integer.valueOf(value1);
        Integer refInt2 = Integer.valueOf(value2);

        System.out.println(refInt1+refInt2+"7");

        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getenv("JAVA_HOME"));

        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println(System.nanoTime()-startNanoTime);

    }
}
