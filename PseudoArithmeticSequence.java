public class PseudoArithmeticSequence {
    public static void main(String[] args) {
        int[] array = {2,5,6,8,9,12};
        int left=1,right=array.length-2;
            boolean chk=true;
            while(left<=right){
                if(array[left-1]+array[right+1]!=array[left]+array[right]){
                    chk=false;
                    break;
                }
                left++;
                right--;
            }
            if(chk){
                System.out.println("PAS");
                System.out.println((array[left-1]+array[right+1])*3);
            }
    }
}
