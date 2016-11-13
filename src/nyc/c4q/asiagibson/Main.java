package nyc.c4q.asiagibson;

public class Main {

    public static void main(String[] args) {
        // write your code here
   /*     int[] array = {2, 4, 6, 8, 10};

        int min = array[0];


        int target = array[2];
        int n = target;
        int first = 0;
        int last = n-1;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            System.out.println(min);
*/
        int [] options = {3,5,8,23,6,7};
        System.out.println(binarySearch(options[]));

    }
        public static int binarySearch(int[] array, int target) {
            int min = 0;
            int max = array.length -1;
            if (min <= max){
                int num = (max - min)/2;
                if(target < array[num]){
                    return min;
                }
                else if(target>array[num]){
                    return max;
                }else {
                    return num;
                }

            }


            return -1;
        };

}
}
