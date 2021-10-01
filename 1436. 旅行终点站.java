class Solution {
    public String destCity(List<List<String>> paths) {
        int m = paths.size();               //路线组
        String res = "";
        List<String> start = new ArrayList<>();
        List<String> end = new ArrayList<>();
        for(int i=0; i<m; i++){
            start.add(paths.get(i).get(0));
            end.add(paths.get(i).get(1));
        }
        for(int i=0; i<m; i++){
            if(start.indexOf(end.get(i)) == -1){
                res = end.get(i);
            }
        }
        return res;
    }
}

/*
执行用时:3 ms ，在所有Java提交中击败了 30.79%的用户
内存消耗:38.2 MB，在所有Java提交中击败了 28.16%的用户

最终终点站肯定不会出现在出发地list中
*/
