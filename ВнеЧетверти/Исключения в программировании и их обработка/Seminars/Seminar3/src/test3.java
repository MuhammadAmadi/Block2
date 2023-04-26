public class test3 {
    public static void main(String[] args){
        try (counter ctr = new counter()){
            ctr.add();
            ctr.add();
            System.out.println(ctr.getOpen());
            System.out.println(ctr.getCount());
        } catch (Exception e){
            System.out.println("Ошибка класс counter закрыт");
        }
        counter ctr2 = new counter();
        try {

            ctr2.add();
            ctr2.add();
            ctr2.add();
            System.out.println(ctr2.getCount());
            ctr2.close();
            ctr2.add();
            System.out.println(ctr2.getCount());
        }catch (Exception e){
            System.out.println("Ошибка класс counter закрыт");
        }finally {
            if(ctr2.getOpen()){
                ctr2.close();
            }
        }
    }
}
