import com.squareup.moshi.Moshi;
import model.Match;
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

        // http://www.vogella.com/tutorials/JavaLibrary-OkHttp/article.html
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://www.vogella.com/index.html")
                .build();

        // https://dev.battle.net/io-docs
        request = new Request.Builder()
                .url("https://us.api.battle.net/sc2/profile/4014615/1/LieZ/matches?locale=en_US&apikey=ufpgqhpsu29c7cavcdkdajqmdv65ee23")
                .build();

        // params
        // HttpUrl.Builder urlBuilder = HttpUrl.parse("https://api.github.help").newBuilder();
        // urlBuilder.addQueryParameter("v", "1.0");
        // urlBuilder.addQueryParameter("user", "vogella");
        // String url = urlBuilder.build().toString();

        // auth
        // Request request = new Request.Builder()
        //         .header("Authorization", "your token")
        //         .url("https://api.github.com/users/vogella")
        //         .build();

        Response response = null;
        String results = null;
        try {
            response = client.newCall(request).execute();
            results = response.body().string();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println(results);

        Match asdf = Match.create("Seeds of Aiur",
                "TWOS",
                "LOSS",
                "FASTER",
                1515554710);
        System.out.println(asdf.getType());

        List<Match> a = new ArrayList<Match>();
        a.add(asdf);
        a.add(asdf);
        a.add(asdf);

        System.out.println(a.get(0).getType());

        Moshi moshi = new Moshi.Builder().build();
        // JsonAdapter<AutoValue_MatchHistory> jsonAdapter = moshi.adapter(AutoValue_MatchHistory.class);

        // Match[] matches = null;
        //
        // try {
        //     matches = jsonAdapter.fromJson(results);
        // } catch(IOException ioe) {
        //     ioe.printStackTrace();
        // }
        //
        // System.out.println(matches[0].toString());




        // asdf.type();

        // MatchHistory asdf = MatchHistory.builder()
        //         .setMap("Seeds of Aiur")
        //         .setType("TWOS")
        //         .setDecision("LOSS")
        //         .setSpeed("FASTER")
        //         .setDate(1515554710)
        //         .build();

        // asdf.getType();
        //
        // System.o
        // System.out.println(asdf.getT  );

    }
}