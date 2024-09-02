package com.Eisen.daily.leetCode.easy;

public class $2798_Number_of_Employees_Who_Met_the_Target {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int cnt = 0;
        for (int i = 0; i < hours.length; i++) {
            if(hours[i] >= target){
                cnt++;
            }
        }
        return cnt;
    }
}
