package com.company;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main   {
    public static void main(String[] args) {
        try{
            IntBuffer buffer = IntBuffer.allocate(1024);
            buffer.get();
            printBuffer("get",buffer);
            buffer.mark();
            printBuffer("mark",buffer);
            buffer.get();
            printBuffer("get",buffer);
            buffer.reset();
            printBuffer("reset",buffer);
            buffer.rewind();
            printBuffer("rewind",buffer);
            buffer.clear();
            printBuffer("clear",buffer);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void printBuffer(String job, IntBuffer buffer){
        System.out.println(job);
        System.out.format("buffer position = %d remaining = %d, limit = %d\n",buffer.position(),buffer.remaining(),buffer.limit());
    }
}