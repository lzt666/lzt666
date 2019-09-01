package javaclass;

public class FrogJump {
    public int JumpFloorII(int target) {
        int sum=0;
if (target==0){
    return 0;
}else {
    sum= (int) Math.pow(2,target-1);
}
return sum;
    }
}
