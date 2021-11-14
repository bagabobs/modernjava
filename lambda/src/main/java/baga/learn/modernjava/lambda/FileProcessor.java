package baga.learn.modernjava.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    public String fileProcessor(BufferedReaderProcessor bpr) throws Exception {
        try(BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            return bpr.process(br);
        } catch(IOException io) {
            System.out.println(io.getMessage());
            throw new Exception("Gagal memproses file", io);
        }
    }
    public static void main(String[] args) throws Exception {
        FileProcessor fileProcessor = new FileProcessor();
        String result = fileProcessor.fileProcessor((BufferedReader br) -> br.readLine());
        System.out.println(result);

        String resultDua = fileProcessor.fileProcessor((BufferedReader br) -> br.readLine()+br.readLine());
        System.out.println(resultDua);
    }
}
