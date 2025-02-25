//Alistair Tran and Ashish Bhogasamudram

public class Matrix {

    
    public static Double[][] multiply(Double[][] a, Double[][] b) {
        // Check if the matrices can be multiplied
        if (a[0].length != b.length) {
            // Return a null matrix if sizes are incompatible
            return new Double[][]{{null}};
        }

        int rowsA = a.length;
        int colsB = b[0].length;
        Double[][] result = new Double[rowsA][colsB];

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0.0; 
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }
}