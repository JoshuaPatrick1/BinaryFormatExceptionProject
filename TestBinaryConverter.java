public class TestBinaryConverter {
    public static void main(String[] args) {
        try {
            // Valid binary string
            String binary1 = "1011"; // should be 11
            int result1 = BinaryConverter.bin2Dec(binary1);
            System.out.println(binary1 + " = " + result1);

            // Invalid binary string
            String binary2 = "1021";
            int result2 = BinaryConverter.bin2Dec(binary2);
            System.out.println(binary2 + " = " + result2);

        } catch (BinaryFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
