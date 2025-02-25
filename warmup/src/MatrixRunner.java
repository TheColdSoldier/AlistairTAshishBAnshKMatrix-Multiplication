//Alistair Tran and Ashish Bhogasamudram
public class MatrixRunner {

    public static void main(String[] args) {
        
        Double[][] m1 = {
                {1.0, 2.0, 3.0, 5.0},
                {4.0, 5.0, 6.0, 7.0},
                {7.0, 8.0, 9.0, 9.0}
        };

        Double[][] m2 = {
                {1.0, 2.0, 3.0, 4.0, 5.0},
                {4.0, 5.0, 6.0, 7.0, 8.0},
                {7.0, 8.0, 9.0, 10.0, 11.0},
                {10.0, 11.0, 12.0, 13.0, 14.0}
        };

        
        Double[][] m3 = Matrix.multiply(m1, m2);

        
        if (m3 != null && m3.length > 0 && m3[0].length > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m3.length; i++) {
                for (int j = 0; j < m3[i].length; j++) {
                    sb.append(String.format("%5s", m3[i][j]) + " ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
        } else {
            System.out.println("Matrix multiplication is not possible due to incompatible sizes.");
        }
    }
}