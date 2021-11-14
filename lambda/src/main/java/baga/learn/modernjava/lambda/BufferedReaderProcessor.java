package baga.learn.modernjava.lambda;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {
    public String process(BufferedReader br) throws IOException;
}
