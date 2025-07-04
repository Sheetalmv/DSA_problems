public class maxElement{
    public static void main(String[] args) {
    int arr[]={23,7,9,90,45};
    int maxElement=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>maxElement){
            maxElement=arr[i];
        }
    }
    System.out.println("Maximum element in array is:"+maxElement);
}
}