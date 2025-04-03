package org.java101.Networking;

import java.io.*;
        import java.net.*;

public class ServerCode {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        Socket socket = server.accept();
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Hello from Server!");
        socket.close();
    }
}
