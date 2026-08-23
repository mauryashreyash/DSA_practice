// Check if a number is Armstrong Number or not

// Problem Statement:Given an integer N, return true it is an Armstrong number otherwise return false.

// An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

class Armstrong{
    public static void checkForArmstrong(int a){
        int original = a;
        int temp = a;
        int sum = 0;
        int count = 0;

                // Count number of digits
        while (temp > 0) {
        temp = temp / 10;
        count++;
        }
        temp = original;


        while (temp > 0 ){
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            // count++;
            temp = temp / 10;
        }
        if(original == sum ){ 
            System.out.println("yes it is armstrong number");
        }else{
            System.out.println("NO! it is not armstrong number");
        }
    }
    public static void main (String [] args){
        int a = 153;
        checkForArmstrong(a);
    }
}