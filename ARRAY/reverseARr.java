package ARRAY;

public class reverseARr {
    
        public static void reverse(int arr[]){
            int n = arr.length;
            for(int i=0; i<n/2;i++){
                for(int j=n; j>=n/2; j++){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                    System.out.println(arr[j]);
                }
                
            }
        }
        public static void main(String[] args) {
            int arr[] ={1,2,3,4,4,6};
            reverse(arr);
            
        }
        
    }
    

