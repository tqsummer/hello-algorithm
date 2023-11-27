package com.study.hello.algorithm.tuling.example;

/**
 * @author : fangxiangqian
 * @created : 2023/11/9
 **/
public class PrimeNumber {
    public static void main(String[] args) {
        int i = eratosthenes(100);
        System.out.println(i);
    }

    /**
     * 暴力法
     *
     * @param n
     * @return
     */
    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 埃氏筛法
     *
     * @param n
     * @return
     */
    public static int eratosthenes(int n) {
        int count = 0;
        boolean[] isPrim = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!isPrim[i]) {
                count++;
                for (int j = i * i; j < n; j += i) {
                    isPrim[j] = true;
                }
            }
        }
        return count;
    }
}
