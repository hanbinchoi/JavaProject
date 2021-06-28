package com.company;


public class MagicButton {
    public MagicButton(){

    }

    private EventListener listener;

    public void setListener(EventListener listener){
        this.listener=listener;
    }
    public void onClickProcess() {
        if(listener != null){
            listener.onClick();
        }
    }


    public void setButtonListener(MagicButton button){
        button.setListener(new EventListener() {
            public void onClick() {
                System.out.println("anonymous");
            }
        });
        button.onClickProcess();
    }

    public static void main(String[] args){
        MagicButton button = new MagicButton();
        button.setButtonListener(button);
    }
}
