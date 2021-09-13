class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for(int[] p : points){
            Map<Integer, Integer> cnt = new HashMap<>();
            for(int[] q : points){
                int dis = (p[0] - q[0])*(p[0] - q[0]) + (p[1] - q[1])*(p[1] - q[1]);
                cnt.put(dis, cnt.getOrDefault(dis, 0) + 1);
            }
            for(Map.Entry<Integer, Integer> entry : cnt.entrySet()){
                int m = entry.getValue();
                res += m * (m-1);
            }
        }
        return res;
    }
}

/*
执行用时:162 ms ,在所有Java提交中击败了35.95%的用户
内存消耗:38.3 MB，在所有Java提交中击败了57.21%的用户

使用枚举 + 哈希表的方法
题目所描述的回旋镖可以视作一个 V 型的折线。我们可以枚举每个 points[i]，将其当作 V 型的拐点。设 points 中有 mm 个点到 points[i] 的距离均相等，我们需要从这 m 点中选出 2 个点当作回旋镖的 2 个端点，由于题目要求考虑元组的顺序，因此方案数即为在 m 个元素中选出 2 个不同元素的排列数，即：
  A_m^2 = m * (m-1)
据此，我们可以遍历 points，计算并统计所有点到 points[i] 的距离，将每个距离的出现次数记录在哈希表中，然后遍历哈希表，并用上述公式计算并累加回旋镖的个数。
在代码实现时，我们可以直接保存距离的平方，避免复杂的开方运算。
*/
