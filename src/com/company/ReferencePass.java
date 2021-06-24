package com.company;

import java.lang.reflect.Member;

public class ReferencePass {
    public static void main(String[] args){
        ReferencePass reference = new ReferencePass();
        reference.callPassByReference();
    }

    public void callPassByReference(){
        MemberDTO member = new MemberDTO("Sam");
    }
}
