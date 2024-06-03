import java.io.*;
 import java.net.*;
 public class DailyAdviceClient {
public void go() {
 try {
 Socket s = new Socket("127.0.0.1", 4200);
 InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
 BufferedReader reader = new BufferedReader(streamReader);
 String advice = reader.readLine();
 System.out.println("오늘의 조언: " + advice);
 } catch(IOException ex) {
 ex.printStackTrace();
 }
 } // go 메소드 끝
public static void main(String[] args) {
 DailyAdviceClient client = new DailyAdviceClient();
 client.go();
 }
 }
