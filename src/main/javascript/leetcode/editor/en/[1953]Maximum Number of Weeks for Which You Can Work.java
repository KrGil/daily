//There are n projects numbered from 0 to n - 1. You are given an integer array 
//milestones where each milestones[i] denotes the number of milestones the iᵗʰ 
//project has. 
//
// You can work on the projects following these two rules: 
//
// 
// Every week, you will finish exactly one milestone of one project. You must 
//work every week. 
// You cannot work on two milestones from the same project for two consecutive 
//weeks. 
// 
//
// Once all the milestones of all the projects are finished, or if the only 
//milestones that you can work on will cause you to violate the above rules, you will 
//stop working. Note that you may not be able to finish every project's 
//milestones due to these constraints. 
//
// Return the maximum number of weeks you would be able to work on the projects 
//without violating the rules mentioned above. 
//
// 
// Example 1: 
//
// 
//Input: milestones = [1,2,3]
//Output: 6
//Explanation: One possible scenario is:
//​​​​- During the 1ˢᵗ week, you will work on a milestone of project 0.
//- During the 2ⁿᵈ week, you will work on a milestone of project 2.
//- During the 3ʳᵈ week, you will work on a milestone of project 1.
//- During the 4ᵗʰ week, you will work on a milestone of project 2.
//- During the 5ᵗʰ week, you will work on a milestone of project 1.
//- During the 6ᵗʰ week, you will work on a milestone of project 2.
//The total number of weeks is 6.
// 
//
// Example 2: 
//
// 
//Input: milestones = [5,2,1]
//Output: 7
//Explanation: One possible scenario is:
//- During the 1ˢᵗ week, you will work on a milestone of project 0.
//- During the 2ⁿᵈ week, you will work on a milestone of project 1.
//- During the 3ʳᵈ week, you will work on a milestone of project 0.
//- During the 4ᵗʰ week, you will work on a milestone of project 1.
//- During the 5ᵗʰ week, you will work on a milestone of project 0.
//- During the 6ᵗʰ week, you will work on a milestone of project 2.
//- During the 7ᵗʰ week, you will work on a milestone of project 0.
//The total number of weeks is 7.
//Note that you cannot work on the last milestone of project 0 on 8ᵗʰ week 
//because it would violate the rules.
//Thus, one milestone in project 0 will remain unfinished.
// 
//
// 
// Constraints: 
//
// 
// n == milestones.length 
// 1 <= n <= 10⁵ 
// 1 <= milestones[i] <= 10⁹ 
// 
//
// Related Topics Array Greedy 👍 553 👎 125


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long numberOfWeeks(int[] milestones) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)
