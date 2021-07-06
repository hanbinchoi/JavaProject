package d.finaltest;

import d.finaltest.handler.RequestHandler;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
    public static void main(String[] args){
        SocketServerSample server = new SocketServerSample();
        int port = 9000;
        server.run();
    }
    public void run(){
        ServerSocket server = null;
        try {
            server = new ServerSocket(9000);
            while (true){
                Socket socket = server.accept();
                RequestHandler handler = new RequestHandler(socket);
                handler.run();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(server != null){
                try {
                    server.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    private final int BUFFER_SIZE = 2048;

    public void start(int port){
        ServerSocket server = null;
        try {
            server=new ServerSocket(port);
            while (true){
                Socket socket = server.accept();

                //Request read
                InputStream request = new BufferedInputStream(socket.getInputStream());
                byte[] receivedBytes = new byte[BUFFER_SIZE];
                request.read(receivedBytes);
                String requestData = new String(receivedBytes).trim();
                System.out.println("RequestData = \n"+requestData);
                System.out.println("---------------------------");

                //Make Response data and Response.
                PrintStream response = new PrintStream(socket.getOutputStream());
                response.println("HTTP/1.1 200 OK");
                response.println("Content-type: text/html");
                response.println();
                response.print("It is working");
                response.flush();
                response.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(server != null){
                try {
                    server.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }


}
