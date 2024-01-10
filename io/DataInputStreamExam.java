import java.io.*;

public class DataInputStreamExam{
    public static int read3(){
        int sum = 0;
        //data.txt로부터 int값 3개를 읽어들여서 sum에 더하세요.
        
        try(
            DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
        ){
           sum = in.readInt() + in.readInt() + in.readInt(); 
            
        } catch(Exception e) {
            
        }
        
        //아래는 테스트를 위한 코드입니다. 수정하지 마세요.     
        return sum;
    }
}