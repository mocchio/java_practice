import java.io.*;
import java.net.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // TCP/IPを使った接続(書き込まれた内容の送信)
    Socket sock = new Socket("smtp.example.com", 60025);
    OutputStream os = sock.getOutputStream();
    os.write("HELLO smtp.example.com¥r¥n".getBytes()); // ¥r¥nを使って改行
    os.write("MAIL FROM: asaka@example.com¥r¥n".getBytes());
    os.flush();
    sock.close();
  }
}