package pl.eightbit;

import java.util.stream.Stream;

class BinaryGapCalculator {

    int calculate(int n) {
        // write your code in Java SE 8
        if (n < 1) {
            return 0;
        }

        String binaryString = Integer.toBinaryString(n);
        return Stream.of(splitBinary(binaryString))
                .filter(s -> !s.isEmpty())
                .map(String::length)
                .max(Integer::compareTo)
                .orElse(0);
    }

    private String[] splitBinary(String binaryString) {
        return binaryString.substring(0, binaryString.lastIndexOf("1"))
                .split("1");
    }
}
