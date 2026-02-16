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

class try2{
    public static void main(String[] args){
        Runnable r1=new Runnable(){
            public void run(){
                System.out.println("Hello");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
    }
}


class try3{
    public static void main(String[] args){
        Runnable r1 = () -> {
            System.out.println("Hello");
        };
        Thread t1 = new Thread(r1);
        t1.start();
    }
}


class try4{
    int count = 0;
    synchronized void increment() {
        count++;
    }}

class try5{
    public static void main(String[] args)  throws InterruptedException{
        try4 t = new try4();
        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    t.increment();
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    t.increment();
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count :"+t.count);
    }
}

