package bootcoding.basic.matths.pattern;

public class TriangleNo {
    public static void main(String[] args) {
     triangleZeroOne(5);
    }
    public static void triangleZeroOne(int n){
        //outer loop
        for(int i=1;i<=n;i++) {
            //inner loop
            for(int j=1; j<=i;j++) {
                int sum =i+j;
                if(sum %2==0) { //even value
                    System.out.print(1);
                }
                else {
                    //odd value
                    System.out.print(0);
                }
            }
            System.out.println(  );
        }
    }

}
