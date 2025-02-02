 import java.util.*;
 class Search2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numArr = ArrayUtility2D.input2DArray();
        System.out.println("Enter the number you want to search: ");
        int num = sc.nextInt();
        boolean isFound = search(numArr, num);
        if(isFound)
        {
            System.out.println("number was found");
        }
        else{
            System.out.println("number was not found");
        }
    }
    public static boolean search(int[][] numArr, int num)
    {
        int i = 0;
        while (i < numArr.length)
        {
           int j = 0;
           while (j < numArr[i].length) 
           {
            if (numArr[i][j] == num)
            {
                return true;
            }
            j++;
           }
           i++;
        }

        return false;
    }
}


        