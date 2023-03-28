import java.util.ArrayList;

public class StandUpComic extends Entertainer{
    private ArrayList<String> jokes;

    public StandUpComic(String comedyStyle, ArrayList<String> jokes) {
        super(comedyStyle);
        this.jokes = jokes;
    }

    @Override
    public String getTalent() {
        return "Comedy style: " + super.getTalent();
    }

    public String randomJoke(){
        int temp = (int) (Math.random()* jokes.size());
        return jokes.get(temp);
    }
}
