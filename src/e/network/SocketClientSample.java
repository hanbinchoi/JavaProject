package e.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SocketClientSample {
    public static void main(String[] args){
        SocketClientSample sample = new SocketClientSample();
//        sample.sendSocketSample();
        sample.sendAndReceiveSocketData();
    }

    public void sendSocketSample(){
        for(int i=0;i<3;i++){
            sendSocketData("I liked java at"+new Date());
        }
        sendSocketData("EXIT");
    }
    public void sendSocketData(String data){
        Socket socket = null;
        try {
            System.out.println("Client: Connecting");
            socket=new Socket("127.0.0.1",9999);
            System.out.println("Client: Connect status = "+socket.isConnected());
            Thread.sleep(1000);
            OutputStream stream = socket.getOutputStream();
            BufferedOutputStream out = new BufferedOutputStream(stream);
            byte[] bytes = data.getBytes();
            out.write(bytes);
            System.out.println("Client:Send data");
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(socket != null){
                try{
                    socket.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void sendAndReceiveSocketData(){
        Socket socket = null;
        try {
            System.out.println("Client: Connecting");
            socket=new Socket("127.0.0.1",9999);
            System.out.println("Client: Connect status = "+socket.isConnected());
            Thread.sleep(1000);
            InputStream stream = socket.getInputStream();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(stream)
            );
            String data =null;
            StringBuilder receivedData = new StringBuilder();
            while((data=in.readLine()) != null){
                receivedData.append(data);
            }
            System.out.println("Received data: "+receivedData);
            in.close();
            stream.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(socket != null){
                try{
                    socket.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }


}
