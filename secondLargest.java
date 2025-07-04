public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {19, 13, 14, 2, 5, 17, 18};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element");
        } else {
            System.out.println("Second largest element is " + second);
        }
    }
}
