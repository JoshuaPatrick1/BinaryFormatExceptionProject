public class BinaryConverter {

    // Convert binary string to decimal
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        // Validate: only '0' or '1' allowed
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException(
                    "Invalid binary character: '" + ch + "' at position " + i);
            }
        }

        // If valid, parse manually
        int decimalValue = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            decimalValue = decimalValue * 2 + (binaryString.charAt(i) - '0');
        }
        return decimalValue;
    }
}
