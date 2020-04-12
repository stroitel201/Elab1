package Classes;

public class MyThread extends Thread
{

    private String msg;
    public MyThread(String msg)
    {
        this.msg=msg;
    }
    @Override
    public void run()
    {
        int counter =0;
        System.out.println(Thread.currentThread().getName());
        while(counter<50) {
            for (char ch : msg.toCharArray()) {
                if (counter == 50) {
                    System.out.print("\n");
                    break;
                }
                System.out.print(ch);
                System.out.flush();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter++;
            }
        }
        System.out.print("\n");
    }
}
