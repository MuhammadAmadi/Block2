public class counter implements AutoCloseable
{
    private boolean openclose = true;
    private int count = 0;
    public void add (){
        if(openclose){
            count ++;
        }
        else {
            throw new RuntimeException("Метод Counter закрыт!");
        }

    }
    public boolean getOpen(){
        return openclose;
    }
    public int getCount(){
        return count;
    }

    @Override
    public void close(){
        openclose = false;
    }
}

