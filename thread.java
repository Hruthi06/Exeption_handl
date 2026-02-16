class a extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hey Hello  "+i);

            try {
            Thread.sleep(10);
            } catch (Exception e) {
            
            }
        }
    }
}

class b extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("okey bye "+i);
            setPriority(10);

            try {
            Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}

class try1 {
    public static void main(String[] args) {
        a t1 = new a();
        b t2 = new b();
        System.out.println("Hello World");
        t1.start();
       
        t2.start();
    }
}