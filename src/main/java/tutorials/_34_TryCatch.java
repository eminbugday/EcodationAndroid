package tutorials;

public class _34_TryCatch {

    public static void main(String[] args) {
        try {
            //sayi/0 = sinirsiz

            int number = 4 / 0;
            System.out.println(number);
        } catch (ArithmeticException ai) {
            ai.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {                 //kesinlikle calisacak
            System.out.println("her durumda bu satir calisacaktir  db.closed() port.closed");
        }
            System.out.println("her durumda bu satir calisacak");
    }
}
