package Test;

import java.util.Scanner;

public class Test4 {
    /*歌唱比赛有6名评委打分，分数范围是【0-100】之间的整数。选手的最后得分为：去掉最高分、最低分的4个评委的平均分*/
    //1.定义一个数组，用来存储6名评委的打分（0-100）
    //2.求出数组的最大值
    //3.求出数组的最小值
    //4.求出数组中6个分数的总和
    public static void main(String[] args) {
        int[] scoresArr = getScores();
        for (int i = 0; i < scoresArr.length; i++) {
            System.out.println(scoresArr[i]);
        }
        int scoreMax = getMax(scoresArr);
        int scoreMin = getMin(scoresArr);
        int scoreSum = getSum(scoresArr);
        int result = (scoreSum - scoreMax - scoreMin) / 4;
        System.out.println(scoreMax);
        System.out.println(scoreMin);
        System.out.println(scoreSum);
        System.out.println(result);
    }

    //1.定义一个数组，用来存储6名评委的打分（0-100）
    public static int[] getScores() {
        //1.定义一个数组接收数据
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            System.out.print("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
                i++;
            } else {
                System.out.println("超出范围，请重新输入！");
            }
        }
        return arr;
    }

    //2.求出数组的最大值
    public static int getMax(int[] scoresArr) {
        int max = scoresArr[0];
        for (int i = 1; i < scoresArr.length; i++) {
            if (scoresArr[i] > max) {
                max = scoresArr[i];
            }
        }
        return max;
    }

    //3.求出数组的最小值
    public static int getMin(int[] scoresArr) {
        int min = scoresArr[0];
        for (int i = 1; i < scoresArr.length; i++) {
            if (scoresArr[i] < min) {
                min = scoresArr[i];
            }
        }
        return min;
    }

    //4.求出数组中6个分数的总和
    public static int getSum(int[] scoresArr) {
        int sum = 0;
        for (int i = 0; i < scoresArr.length; i++) {
            sum += scoresArr[i];
        }
        return sum;
    }

}
