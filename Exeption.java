class Exeption{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero"+e.getMessage());
        }
        System.out.println("Program is running successfully");
    }
}

class Exeption1{
    public static void main(String[] args) {
        String s= null ;
        try {
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Null pointer exception"+e.getMessage());
        }
        System.out.println("Program is running successfully");
    }
}


class Exeption2{
    public static void main(String[] args) {
        int[] arr=new int[5];
        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println("Array index out of bound exception"+e.getMessage());
        }
        System.out.println("Program is running successfully");
    }
}