package d.finaltest.manager;

import d.finaltest.dto.RequestDTO;

import java.net.Socket;

public class RequestManager {
    private Socket socket;
    private RequestDTO dto;
    public RequestManager(Socket socket){
        this.socket = socket;
    }
    public RequestDTO readRequest(){
        return new RequestDTO();
    }

}
