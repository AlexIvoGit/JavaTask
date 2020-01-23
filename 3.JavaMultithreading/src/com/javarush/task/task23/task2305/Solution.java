package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution solution = new Solution();
        Solution solution1 = new Solution();
        Solution.InnerClass i1 = new Solution().new InnerClass();
        Solution.InnerClass i2 = new Solution().new InnerClass();
        solution.innerClasses = new InnerClass[]{i1, i2};
        solution1.innerClasses = new InnerClass[]{i2, i1};
        Solution[] solutions = new Solution[]{solution, solution1};
        return solutions;
    }

    public static void main(String[] args) {

    }
}
