
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class Client {

  static String ACK_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
"<voe:VOEvent xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""+
             "xmlns:voe=\"http://www.ivoa.net/xml/VOEvent/v2.0\""+
             "xsi:schemaLocation=\"http://www.ivoa.net/xml/VOEvent/v2.0"+
                                 "http://www.ivoa.net/xml/VOEvent/VOEvent-v2.0.xsd\""+
             "version=\"2.0\" role=\"ack\""+
             "ivorn=\"ivo://example/exciting_events#126\" />";

    private ServerSocket server;
    public Client(String ipAddress, String port1) throws Exception {
      int port = Integer.parseInt(port1);
        if (ipAddress != null && !ipAddress.isEmpty())
          this.server = new ServerSocket(port, 1, InetAddress.getByName(ipAddress));
        else
          this.server = new ServerSocket(port, 1, InetAddress.getLocalHost());
    }
    private void listen() throws Exception {
        String data = null;
        Socket client = this.server.accept();
        String clientAddress = client.getInetAddress().getHostAddress();
        System.out.println("\r\nNew connection from " + clientAddress);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(client.getInputStream()));
        while ( (data = in.readLine()) != null ) {
            System.out.println("\r\nMessage from " + clientAddress + ": " + data);
        }
        if(true){
          PrintWriter output = new PrintWriter(client.getOutputStream(), true);
          ack(output, ACK_XML);

        }
    }
    void ack(PrintWriter output, String message) {
        System.out.println("Sending: "+message);
        output.println(message);
    }
    public InetAddress getSocketAddress() {
        return this.server.getInetAddress();
    }

    public int getPort() {
        return this.server.getLocalPort();
    }
    public static void main(String[] args) throws Exception {
      Client app;
      if(args.length>0){
                app = new Client(args[0], args[1]);
        }else{
              app = new Client("127.0.0.1", "8098");//VOEvent broker default
        }
        System.out.println("\r\nRunning Server: " +
                "Host=" + app.getSocketAddress().getHostAddress() +
                " Port=" + app.getPort());

        app.listen();
    }
}
