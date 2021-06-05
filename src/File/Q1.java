package File;

import java.util.Scanner;

import Manager.FileManager;
import static java.lang.System.out;

import java.io.File;
import java.io.Writer;

public class Q1 {
    public static Scanner readFile(FileManager fManager, String fileName) {
        return fManager.readFile(fileName);
    }

    public static void writeFile(FileManager fManager, String result) {
        fManager.writeFile("result1.txt", result);
    }

    public static int randomRange(int n1, int n2) {
        return (int) (Math.random() * (n2 - n1 + 1)) + n1;
    }

    public static int[] getRandomNumber(int[] randomArray) {
        int i = 0;
        // int getRandomNumber[] = new int[randomArray.length];
        int getRandomArray[] = new int[randomArray.length];
        String loopResult = ""; // 출력된 getRandomArray 값들을 저장

        // out.println(randomArray.length);

        for (i = 0; i < getRandomArray.length; i++) {
            getRandomArray[i] = randomRange(11, 99);
            // getRandomArray[i] = (int) (Math.random() * (99 - 11 + 1)) + 11;
            out.print(getRandomArray[i] + " ");
            loopResult += getRandomArray[i] + " ";
        }

        // out.println(getRandomArray.length + " -- length");

        return getRandomArray;
    }

    public static String printRandomNumber(int[] randomArray) {
        int i = 0;
        int getRandomArray[] = new int[randomArray.length];
        int printRandomArray[] = getRandomNumber(getRandomArray);
        String loopResult = "";

        for (i = 0; i < printRandomArray.length; i++) {
            printRandomArray[i] = randomArray[i];
            out.print(printRandomArray[i] + " ");
            loopResult += printRandomArray[i];
        }

        return loopResult;
    }

    public static double sumRandomNumber(int[] randomArray) {
        int i = 0;
        int getRandomArray[] = new int[randomArray.length];
        int sumRandomArray[] = getRandomNumber(getRandomArray);
        // out.println(sumRandomArray.length);

        double sum = 0;
        double average = 0;
        // double getRandomValue = 0;

        for (i = 0; i < sumRandomArray.length; i++) {
            // out.println(getRandomNumber(getRandomArray));
            sum += sumRandomArray[i];
            // sum += Double.valueOf(getRandomNumber(getRandomArray));
            // getRandomValue = Double.valueOf(getRandomValue(randomArray));
            // sum += getRandomNumber(randomArray);
            out.println(sum + " ");
        }

        average = sum / sumRandomArray.length;
        out.println(sum + " --> ");

        return average;
    }

    public static double averageRandomNumber(int[] randomArray) {
        int i = 0;
        int getRandomArray[] = new int[randomArray.length];
        // int sumRandomArray[] = getRandomNumber(getRandomArray);

        double sum = sumRandomNumber(getRandomArray);

        double average = 0;
        // average = sumRandomNumber(getRandomArray) / getRandomArray.length;
        average = sum / getRandomArray.length;

        return average;
        // double average = 0;

        // average = sum / averageRandomNumber.length;

        // return average;
    }

    public static double varianceRandomNumber(int[] randomArray, double average) {
        int i = 0;
        int getRandomArray[] = new int[randomArray.length];
        int varianceTotalArray[] = getRandomNumber(getRandomArray);
        out.println(varianceTotalArray.length);

        average = sumRandomNumber(getRandomArray);
        double total = 0;

        // out.println(varianceTotalArray.length);
        for (i = 0; i < getRandomArray.length; i++) {
            total += (varianceTotalArray[i] - average) * (varianceTotalArray[i] - average);
            out.println(total + " " + i);
        }

        return total;
    }

    // public static int[] varianceRandomNumber(int[] randomArray, double average) {
    // int i = 0;
    // double total = 0;
    // int getRandomArray[] = new int[randomArray.length];
    // int varianceRandomArray[] = getRandomNumber(getRandomArray);
    // double getSum = averageRandomNumber(getRandomArray, average);

    // for (i = 0; i < varianceRandomArray.length; i++) {
    // total += (varianceRandomArray[i] - getSum) * (varianceRandomArray[i] -
    // getSum);
    // out.println(total + " " + i);
    // }

    // return varianceRandomArray;
    // }

    public static String getData(int loopCount) {
        // RNDM
        // int randomArray = 0;
        int[] randomArray = new int[loopCount];

        double average = 0; // 평균
        double sum = 0; // 랜덤 값을 더하기 위한 합
        double variance; // 분산
        double standardDeviation; // 표준편차
        double total = 0; // 분산 값을 더하기 위한 값

        String result = ""; // 최종 결과 값
        String loopResult = ""; // sum 값을 저장하기 위한 값

        // 합계
        // for : 개별숫자합

        // 평균 : 합계 / loopCount

        // 분산
        // for : (개별숫자- 평균) 제곱

        // 표준편차
        // 분산 sqrt
        int i = 1;

        // 합계 저장 및 randomArray 출력
        // randomArray = getRandomNumber(randomArray);

        // for (i = 0; i < randomArray.length; i++) {
        // randomArray[i] = randomRange(11, 99);
        // out.print(randomArray[i] + " ");
        // }
        // loopResult = printRandomNumber(randomArray);
        // sum = sumRandomNumber(randomArray);

        // for (i = 0; i < randomArray.length; i++) {
        // // loopResult += randomArray[i] + " ";
        // sum += randomArray[i];
        // }

        // out.println(sum);

        // average = averageRandomNumber(randomArray); // 1
        // average = sum / randomArray.length; // 평균 계산
        // out.println(average);

        // 분산 값 저장
        // varianceRandomNumber(randomArray, average);
        // for (i = 0; i < randomArray.length; i++) {
        // total += (randomArray[i] - average) * (randomArray[i] - average);
        // // out.println(total + " " + i);
        // } // 1

        total = varianceRandomNumber(randomArray, average);
        out.println(total);

        // 분산 계산
        variance = total / loopCount;
        // out.print(variance);

        // 표준 편차
        standardDeviation = Math.sqrt(variance);

        out.print("\n");
        out.printf("평균 : %.2f", average);
        out.print("\n");

        out.printf("분산 : %.2f", variance);
        out.print("\n");

        out.printf("표준 편차 : %.2f", standardDeviation);
        out.print("\n");

        result = loopResult + "\n" + "평균 : " + String.format("%.2f", average) + "\n" + "분산 : "
                + String.format("%.2f", variance) + "\n" + "표준 편차 : " + String.format("%.2f", standardDeviation);

        return result;
    }

    public static void writeResult(int loopResult, FileManager mFM) {
        String getData = getData(loopResult);
        writeFile(mFM, getData);
    }

    public static void sub_main_q1(int userInput) {
        Scanner mainMenuInput = new Scanner(System.in);
        System.out.println("선택하세요.\n1. File 입출력\n2. 직접 입력");
        int selectNum = mainMenuInput.nextInt();

        File file = new File("data1.txt");

        Scanner fileReader = null;
        Writer fileWriter = null;

        FileManager mFM = new FileManager(file, fileWriter, fileReader);

        if (selectNum == 1) {
            fileReader = readFile(mFM, "data1.txt");
            int loopCount = Integer.parseInt(fileReader.nextLine());
            writeResult(loopCount, mFM);
            mainMenuInput.close();

        } else if (selectNum == 2) {
            fileReader = new Scanner(System.in);
            out.print("데이터의 수량을 입력해주세요 : ");
            int loopCount = Integer.parseInt(fileReader.nextLine());
            writeResult(loopCount, mFM);
            mainMenuInput.close();
        }
    }
}
