package com.Eisen.daily.leetCode.easy;

import java.util.Arrays;
import java.util.List;

public class DefangingAnIPAddress_1108 {
    //Input: address = "1.1.1.1"
    //Output: "1[.]1[.]1[.]1"

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
