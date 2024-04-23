package ARRAY;

public class marks_update {
    public static void updat_mark(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+8;
        }
    }
    public static void main(String[] args) {
        int marks[]={92,78,89};
        updat_mark(marks);
        for(int i=0; i<marks.length; i++){
            System.out.println(marks +"");
        }
        System.out.println();
    }
}
