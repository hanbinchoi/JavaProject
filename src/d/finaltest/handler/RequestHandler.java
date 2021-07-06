package d.finaltest.handler;

import d.finaltest.dto.RequestDTO;
import d.finaltest.manager.RequestManager;
import d.finaltest.manager.ResponseManager;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;

public class RequestHandler extends Thread{
    private Socket socket;

    private RequestDTO dto;
    public void run(){
        //Request read
        try{
            RequestManager requestManager = new RequestManager(socket);
            dto = requestManager.readRequest();
            ResponseManager responseManager = new ResponseManager(socket,dto);
            responseManager.writeResponse();



        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public RequestHandler(Socket socket){
        this.socket = socket;
    }
}
