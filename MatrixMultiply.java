

public class MatrixMultiply {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[][] m1 = makeMatrix(n);
        int[][] m2 = makeMatrix(n);
//        printMatrix(m1);
//        System.out.println();
//        printMatrix(m2);
//        System.out.println();
        
        int[][] m3 = multiply(m1, m2, n);
//        System.out.println();
//        System.out.println();
        printMatrix(m3);
    }
    
    private static void printMatrix(int[][] m) {
    	for(int[] x :  m) {
        	System.out.print("[");
        	for(int y : x) {
        		System.out.print(y + " ");
        	}
        	System.out.println("]");
        }
    }

    private static int[][] makeMatrix(int n) {
        int[][] m3 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                m3[i][j] = i + j;
            }
        }

        return m3;
    }
    
    private static int[][] multiply(int[][] m1, int[][]m2, int n) {
    	int[][] m3 = new int[n][n];
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			int[] m1_array = m1[i];
    			int[] m2_array = new int[n];
    			
    			int count = 0;
    			for(int[] k : m2) {
    				m2_array[count++] = k[j];
    			}
    			
    			
//    			System.out.print("\n\nm1:\n[");
//    			for(int x: m1_array) {
//    				System.out.print(x + " ");
//    			}
//    			System.out.println("]");
//    			System.out.print("m2:\n[");
//    			for(int x: m2_array) {
//    				System.out.print(x + " ");
//    			}
//    			System.out.println("]\n");
    			
    			int matrix_result = dot_product(m1_array, m2_array, n);
    			
    			m3[i][j] = matrix_result;
    		}
    	}
    	return m3;
    }
    
    private static int dot_product(int[] arr1, int[] arr2, int n) {
    	int result = 0;
    	for(int i = 0; i < n; i++) {
    		result += arr1[i] * arr2[i];
    	}
    	return result;
    	
    }

}

