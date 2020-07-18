package stream;

import java.io.PipedInputStream;

public class ThreadRead extends Thread{
    private ReadData readData;
    private PipedInputStream inputStream;

    public ThreadRead(ReadData readData, PipedInputStream inputStream){
        super();
        this.inputStream = inputStream;
        this.readData = readData;
    }
    @Override
    public void run(){
        readData.readMethod(inputStream);
    }
}
