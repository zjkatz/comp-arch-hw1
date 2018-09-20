#include <stdio.h>
#include <stdlib.h>



int main(int argc, char** argv) {
    int n = atoi(argv[1]);

    int m1[n][n], m2[n][n], m3[n][n];
    for (int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            m1[i][j] = i+j;
            m2[i][j] = i+j;
        }
    }
   

    
    // for (int i = 0; i < n; i++) {
    //     printf("[");
    //     for(int j = 0; j < n; j++) {
    //         int x = m2[i][j];
    //         printf("%d ", x);
            
    //     }
    //     printf("]\n");
    // }
    // printf("\n");

    
    //multiply code:
    for(int i = 0; i < n; i++) {
    	for(int j = 0; j < n; j++) {
            int m1_array[n];
            for(int k = 0; k < n; k++) {
                m1_array[k] = m1[i][k];
            }
            // m1_array = m1[i];

            int m2_array[n];

            int count = 0;
            for(int k = 0; k < n; k++) {
                m2_array[count++] = m2[k][j];
            }


            // printf("m1_array: [");
            // for(int z = 0; z < n; z++) {
            //     printf("%d ", m1_array[z]);
            // }
            // printf("]");
            
            // printf("\nm2_array: [");
            // for(int z = 0; z < n; z++) {
            //     printf("%d ", m2_array[z]);
            // }
            // printf("]\n\n");

            //Dot product
            int result = 0;
    	    for(int i = 0; i < n; i++) {
    		    result += m1_array[i] * m2_array[i];
    	    }

            m3[i][j] = result;


            

        }
    }

    // printf(m1);
    for (int i = 0; i < n; i++) {
        printf("[");
        for(int j = 0; j < n; j++) {
            int x = m3[i][j];
            printf("%d ", x);
            
        }
        printf("]\n");
    }
    // printf("\n");

    return 0;


}

 
  
    			

    			