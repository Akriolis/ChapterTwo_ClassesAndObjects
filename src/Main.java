public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.size = 40;
        d.bark();

        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        one.playIt();

        GuessGame letsStart = new GuessGame();
        letsStart.startGame();

        DrumKit myDrum = new DrumKit();
        if (myDrum.snare == true){
            myDrum.playSnare();
        }
        myDrum.snare = false;
        myDrum.playTopHat();

        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x < 4){
            e1.hello();
            e1.count += 1;
            if(x == 3){
                e2.count = e2.count + 1;
            }
            if (x > 0){
                e2.count = e2.count + e1.count;
            }
            x += 1;
        }
        System.out.println(e2.count);


    }
}
