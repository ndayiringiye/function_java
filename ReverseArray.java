public class ReverseArray{
    public static void main(String[] args){
    int [] ages = {34, 45, 67, 56};
    int left = 0;
    int right = ages.length-1;
    while(left < right){
        int temp = ages[left];
        ages[left] = ages[right];
        ages[right] = temp;
        ++left;
        --right;
    }
    System.out.print("Reverse array:");
    for(int numb : ages){
        System.out.println(numb + "");
    }
    }
}