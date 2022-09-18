public class Player {

    int number;

    public int guess(){
        int result = (int) (Math.random() * 10);
        return result;
    }
}
