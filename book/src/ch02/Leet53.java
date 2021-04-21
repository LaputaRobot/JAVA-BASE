package ch02;

public class Leet53 {
    public static int max3(int a, int b, int c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }

    public static int maxSumRex(int[] a, int left, int right) {
        int center = (left + right) / 2;
        if (left == right) {
            return a[left];
        }
        int maxLeftSum = maxSumRex(a, left, center);
        int maxRightSum = maxSumRex(a, center + 1, right);

        int maxLeftBoardSum = -1000000, leftBoardSum = -1000000;
        for (int i = center; i >= left; i--) {
            leftBoardSum += a[i];
            if (leftBoardSum > maxLeftBoardSum) {
                maxLeftBoardSum = leftBoardSum;
            }
        }
        int maxRightBoardSum = -1000000, rightBoardSum = -1000000;
        for (int i = center + 1; i <= right; i++) {
            rightBoardSum += a[i];
            if (rightBoardSum > maxRightBoardSum) {
                maxRightBoardSum = rightBoardSum;
            }
        }
        return max3(maxLeftSum, maxRightSum, maxLeftBoardSum + maxRightBoardSum);
    }

    public static int maxSumArray(int[] a) {
        return maxSumRex(a, 0, a.length - 1);
    }

    public static int maxSubSum5(int[] a) {
        if (a.length == 1) return a[0];
        int left = 0, right = a.length - 1;
        int thisSum = a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            if (thisSum < 0) {
                left = i;
                thisSum = a[i];
            }
            thisSum += a[i];
        }
        thisSum = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            if (thisSum < 0) {
                right = i;
                thisSum = a[i];
            }
            thisSum += a[i];
        }
        System.out.println("left: " + left + " right: " + right);
        int sum = 0;
        if (left > right) {
            sum = a[0];
            for (int num : a) {
                if (num > sum) sum = num;
            }
        } else {
            for (int i = left; i <= right; i++) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static int maxSum5(int[] a) {
        int maxSum = a[0], thisSum = 0;
        for (int j = 0; j < a.length; j++) {
            if(a[j]>0) thisSum+=a[j];
            else {
                maxSum = thisSum;
            }
            maxSum=maxSum>thisSum?maxSum:thisSum;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a[] = {-3,-1};
        System.out.println(maxSum5(a));
    }
}
