package S1Arrays;

class Q1Secondlargest {
    int print2largest(int arr[], int n)
    {
        if (n < 2) return -1;
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > max)
            {
                max2 = max;  //will contain previous value of max
                max = arr[i];
            }
            //if max value is found in begenning of array,then if wont be executed
            //to update max2 value, therefore added another condition for it
            else if (arr[i] > max2 && arr[i] != max) max2 = arr[i];
        }
        if (max2 == Integer.MIN_VALUE)  return -1;
        return max2;
    }
}
