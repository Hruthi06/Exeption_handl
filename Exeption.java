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


class Exeption3{
    public static void main(String[] args) {
        String s="Hello";
        try {
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("cannot convert string to integer"+e.getMessage());
        }
        System.out.println("Program is running successfully");
    }
}

class Exeption4{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero"+e.getMessage());
        }
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("Program is running successfully");
    }
}

class Exeption5{
    public static void main(String[] args) {
        int a = -1;
        if (a<0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        System.out.println("Value is :"+a );
    }
}


class Exeption6{
    public static void main(String[] args) {
        try {
            
            methodThatThrowsException();
        } catch (Exception e) {
           System.out.println("Caught an exception"+e.getMessage());
        }
    }

    public static void methodThatThrowsException() throws Exception {
        throw new Exception("This is a custom exception message");
    }
}