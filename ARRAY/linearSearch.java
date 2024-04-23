package ARRAY;

public class linearSearch {
    public static void search(String menu[],String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i]==key){
                System.out.println("Key at index of " +i);
            }
            else{
                System.out.println("key not found at index of " +i);
            }
        }
    }
    public static void main(String[] args) {
        int num[] ={2,3,4,6,7};
        String menu[] ={"Samosa","banana","kela"};
        String key ="Samosa";
        search(menu, key);
    }
}
