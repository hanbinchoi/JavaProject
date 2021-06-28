package com.company;

public class Mypage {
    InputBox input;
    public static void main(String[] args){
        Mypage sample = new Mypage();

        sample.setUI();
        sample.pressKey();
    }
    public void setUI( ){
        input = new InputBox();
        KeyEventListener listener = new KeyEventListener() {
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            public void onKeyUp() {
                System.out.println("Key Up");
            }
        };
        input.setKeyListener(listener);

    }
    public void pressKey( ){
        input.listenerCalled(InputBox.KEY_UP);
        input.listenerCalled(InputBox.KEY_DOWN);

    }
}
