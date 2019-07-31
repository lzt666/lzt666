package javaclass;

public class SpecialAdd {
    public int addAB(int A, int B) {
        // write code here
        int xor,carry;
        while(B!=0){
            xor = A^B;
            carry = (A&B)<<1;
            A=xor;
            B=carry;
        }
        return A;
    }
}
