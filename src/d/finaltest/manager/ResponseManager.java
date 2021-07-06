package d.finaltest.manager;

import d.finaltest.dto.RequestDTO;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;

public class ResponseManager {
    private Socket socket;
    private RequestDTO dto;
    private final int BUFFER_SIZE = 2048;
    public ResponseManager(Socket socket, RequestDTO dto){
        this.socket=socket;
        this.dto = dto;
    }
    public void writeResponse(){
        try{
            InputStream request = new BufferedInputStream(socket.getInputStream());
            byte[] receivedBytes = new byte[BUFFER_SIZE];
            request.read(receivedBytes);
            String requestData = new String(receivedBytes).trim();
            String[] requestSplit = requestData.split(" ");
            dto.setRequestMethod(requestSplit[0]);
            dto.setUri(requestSplit[1]);
            dto.setHttpVersion(requestSplit[2]);
            System.out.println("RequestData = \n"+requestData);
            System.out.println("---------------------------");
            PrintStream response = new PrintStream(socket.getOutputStream());
            response.println("HTTP/1.1 200 OK");
            response.println("Content-type: text/html");
            response.println();
            //Make Response data and Response.
            if(dto.getUri().equals("/today")){

                response.print(new Date());
                response.flush();
                response.close();
            }else{
                response.print("It is working");
                response.flush();
                response.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
