

package sorting;

public class SS_01 {

    public void ss(int[] arr) {
        int getMax = getMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<getMax)
            {

            }

        }

    }

    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public void swap(int x, int y)
    {
        int temp= x;
        x=y;
        y=temp;
    }
}
