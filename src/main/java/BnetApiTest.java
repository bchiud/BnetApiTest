import model.Match;
import model.MatchHistory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BnetApiTest {

    private String apiKey = "ufpgqhpsu29c7cavcdkdajqmdv65ee23";

    public static void main(String[] args) {
        // okhttp to make connect
        // retrofit to turn into oject
        // moshi to turn json into pogo; used by retrofit

        OkHttpClient client = new OkHttpClient();

        // https://dev.battle.net/io-docs
        Request request = new Request.Builder()
                .url("https://us.api.battle.net/sc2/profile/4014615/1/LieZ/matches?locale=en_US&apikey=ufpgqhpsu29c7cavcdkdajqmdv65ee23")
                .build();

        Response response = null;
        String results = null;
        try {
            response = client.newCall(request).execute();
            results = response.body().string();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println(results);

        Match aMatch = Match.create("Seeds of Aiur",
                "TWOS",
                "LOSS",
                "FASTER",
                1515554710);

        /*
        Match aMatch = Match.builder()
                .setMap("Seeds of Aiur")
                .setType("TWOS")
                .setDecision("LOSS")
                .setSpeed("FASTER")
                .setDate(1515554710)
                .build();
        */

        System.out.println(aMatch.getType());

        List<Match> matches = new ArrayList<Match>();
        matches.add(aMatch);
        matches.add(aMatch);
        matches.add(aMatch);


        MatchHistory mh = MatchHistory.create(matches);

        /*
        MatchHistory mh = MatchHistory.builder()
                .setMatches(matches)
                .build();
        */

        System.out.println(mh.getMatches().get(0).getType());

    }
}