package collections.enumExample;

public class Basic {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday

        // every enum constant here is by default
        // public, static, and final.
        // type is week
    }

    public static void main(String[] args) {

        Week day = Week.Friday;

        for(Week d : Week.values()){
            System.out.println(d);
        }
    }
}
