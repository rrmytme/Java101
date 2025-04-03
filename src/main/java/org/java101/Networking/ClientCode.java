package org.java101.Networking;

import java.io.*;
        import java.net.*;

public class ClientCode {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(in.readLine()); // Output: Hello from Server!
        socket.close();
    }
}
