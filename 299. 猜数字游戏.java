class Solution {
    public String getHint(String secret, String guess) {
        int n = secret.length();
        int[] nums = new int[10];
        int A = 0, B = 0;
        for(int i=0; i<n; i++){
            if(secret.charAt(i) == guess.charAt(i)){
                A++;
            }else{
                if(nums[guess.charAt(i) - '0']-- > 0){
                    B++;
                }
                if(nums[secret.charAt(i) - '0']++ < 0){
                    B++;
                }
            }
        }
        return A + "A" + B + "B";
    }
}

/*
//nums[]数组下标表示0~9这9个数字，值表示数字的“状态”（初始为0）
//for循环遍历时候，发现secret和guess当前位不一样，
//那么我们做两件事：1.判断。2.更新状态。
//下面我以guess的if举例，secret同理
if(nums[guess.charAt(i)-'0'] > 0) countB++; //1.guess判断值是否>0，
                                            //若>0说明secret出现过该数字
                                            //同时注意secret和guess当前位不一样
                                            //说明该数字属于数字猜对了但是位置不对，即countB

nums[guess.charAt(i)-'0']--;                //2.guess将值--
                                            //一方面，表示该数字已经计算过，避免重复
                                            //另一方面，--是为了供以后secret判断<0

if(nums[secret.charAt(i)-'0'] < 0) countB++; 
nums[secret.charAt(i)-'0']++;
*/
