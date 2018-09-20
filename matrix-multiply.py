import sys

#Jancy Capellan
#Zachary Katz


def main():
    n = int(sys.argv[1])
    # m1 = [[1,2,3], [4,5,6], [7,8,9]]
    # m2 = [[1,2,1], [3,1,1], [5,1,4]]
    m1 = makeMatrix(n)
    m2 = makeMatrix(n)

    m3 = multiply(m1, m2, n)
    for i in m3:
        print("[", end="")
        for j in i:
            print(str(j) + " ", end="")
        print("]")
    # print(multiply(m1, m2, n))


def makeMatrix(n):
    m3 = []
    for i in range(n):
        m3.append([])
        for j in range(n):
            m3[i].append(i+j)
    
    return m3

def multiply(m1, m2, n):
    m3 = []
    for i in range(n):
        m3.append([])


    #Loop through m1 rows (i: 0 to n exlusive)
    for i in range(n):
        #Loop through m2 columns (j: 0 to n exlusive)
        for j in range(n):
            #Get two arrays, call dot product
            m1_array = m1[i]
            m2_array = []
            for k in m2:
                m2_array.append(k[j])

            matrix_result = dot_product(m1_array, m2_array, n)
            #store result in (i, j) of m3
            m3[i].append(matrix_result)
            
    return m3

def dot_product(arr1, arr2, n):
    result = 0
    for i in range(n):
        result += arr1[i]*arr2[i]
    return result





if __name__ == "__main__":
    main()