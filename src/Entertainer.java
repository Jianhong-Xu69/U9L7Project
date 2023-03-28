public class Entertainer {
    private String talent;

    public Entertainer(String t) {
        talent = t;
    }

    public String getTalent() {
        return talent;
    }

    public void announceTalent() {
        System.out.println("My talent is " + talent);
    }
}