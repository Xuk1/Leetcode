class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat = 0;                               //船数
        int n = people.length;                      //人数
        boolean[] used = new boolean[n];            //存储人的状态，如果上船就为true，没上船就为false
        Arrays.fill(used, false);                   //刚开始所有人都没有上船
        Arrays.sort(people);                        //按重量从小到大排序
        for(int i=0; i<n/2; i++){                   //从重量最小的和重量最大的开始匹配，这样最有效率
            if(used[i] == false){
                for(int j=n-1; j>i; j--){
                    if(used[j] == false && people[i] + people[j] <= limit){
                        used[i] = true;
                        used[j] = true;
                        boat++;
                        break;
                    }
                }
            }
            
        }
        for(int i=0; i<n; i++){                     //能匹配上的人都匹配完了之后，再单独用船运输剩下的人
            if(used[i] == false){
                boat++;
            }
        }

        return boat;
    }
}

/*
执行用时:2732 ms ,在所有Java提交中击败了 5.22%的用户
内存消耗:45.8 MB ，在所有Java提交中击败了99.79%的用户
*/





/*********************************超时的一个可行的方法************************************/
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat = 0;                               //船数
        int n = people.length;                      //人数
        boolean[] used = new boolean[n];            //存储人的状态，如果上船就为true，没上船就为false
        Arrays.fill(used, false);                   //刚开始所有人都没有上船
        Arrays.sort(people);                        //按重量从小到大排序
        for(int i=0; i<=n/2; i++){
            for(int j=n-1; j>i; j--){
                if(used[i] == false && used[j] == false && people[i] + people[j] <= limit){
                    used[i] = true;
                    used[j] = true;
                    boat++;
                    break;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(used[i] == false){
                boat++;
            }
        }

        return boat;
    }
}
/*********************************超时的一个可行的方法************************************/
