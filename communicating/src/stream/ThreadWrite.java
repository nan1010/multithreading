package stream;

import java.io.PipedOutputStream;

public class ThreadWrite extends Thread{
        private WriteData writeData;
        private PipedOutputStream outputStream;

        public ThreadWrite(WriteData writeData, PipedOutputStream outputStream){
            super();
            this.outputStream = outputStream;
            this.writeData = writeData;
        }

        @Override
        public void run(){
            writeData.writeMethod(outputStream);
        }
}
