import java.util.ArrayList;

public class Tester
{
    public static void main(String[] args)
    {
        ArrayList<String> amazingJokes = new ArrayList<String>();
        amazingJokes.add("I like rice. Rice is great when you’re hungry and you want 2,000 of something.");
        amazingJokes.add("I had a paper route when I was a little kid; I was a paperboy. I was supposed to go to 2,000 houses, or two dumpsters.");
        amazingJokes.add("This shirt is dry-clean only, which means it’s dirty.");

        StandUpComic sam = new StandUpComic("amazing jokes", amazingJokes);

        // TEST CODE:
        System.out.println(sam.getTalent()); // should print:  Comedy style: amazing jokes
    }
}