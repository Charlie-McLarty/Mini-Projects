public class main {
    public static void main(String[] args){
        //Select the decimal or binary number to be converted
        int decimal = 35;
        int binary = 5;

        convertDecimalToBinary(decimal);
    }
    public static void convertDecimalToBinary(int decimal){
        System.out.print(decimal + " in binary is: ");
        int[] binaryArray = new int[32];

        for (int i = 0; i < 32; i++){
            binaryArray[i] = decimal % 2;
            decimal /= 2;
        }
        for (int j = binaryArray.length - 1 ; j >= 0; j--){
            System.out.print(binaryArray[j]);
        }
    }
}