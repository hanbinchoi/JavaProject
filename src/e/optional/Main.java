package e.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Main sample = new Main();
        sample.runThread();
    }
    private void getOptionalData(Optional<String> data) throws Exception{
        String defaultValue = "default";
//        String result1 = data.get();
        String result2 = data.orElse(defaultValue);
        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "sup";
            }
        };
        String result3 = data.orElseGet(stringSupplier);
        Supplier<Exception> exceptionSupplier = new Supplier<Exception>() {
            @Override
            public Exception get() {
                return new Exception();
            }
        };
        System.out.println(result2);
        System.out.println(result3);
        String result4 = data.orElseThrow(exceptionSupplier);
//        System.out.println(result1);

        System.out.println(result4);

    }
    private void runThread(){
        new Thread(() -> {
            Integer[] values = {1, 3, 5};
            List<Integer> list = Arrays.stream(values).collect(Collectors.toList());
            long a=list.stream().filter(x -> x>3).filter(x -> x>5).count();
            System.out.println(a);
        }).start();
    }
}
