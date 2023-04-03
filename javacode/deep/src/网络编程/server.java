package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class server implements Runnable{
    private Socket sk;

    public server(Socket sk) {
        this.sk = sk;
    }

    @Override
    public void run() {
        try {
            InputStream is=sk.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String msg;
            while ((msg=br.readLine())!=null){
                System.out.println(sk.getRemoteSocketAddress()+":"+msg);
            }
        } catch (Exception e) {
            System.out.println("xia xian le");
        }
    }
}
