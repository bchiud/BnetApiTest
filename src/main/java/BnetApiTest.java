import com.squareup.moshi.Moshi;
import model.MatchHistory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class BnetApiTest {


    private String apiKey = "ufpgqhpsu29c7cavcdkdajqmdv65ee23";


    public static void main(String[] args) {

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

        Moshi moshi = new Moshi.Builder().build();
        // JsonAdapter<BlackjackHand> jsonAdapter = moshi.adapter(BlackjackHand.class);
        //
        // BlackjackHand blackjackHand = jsonAdapter.fromJson(json);
        // System.out.println(blackjackHand);



        // okhttp to make connect
        // retrofit to turn into oject
        // moshi to turn json into pogo; used by retrofit


        // HttpURLConnection connection = (HttpURLConnection) url.openConnection();



    }

    MatchHistory asdf = MatchHistory.create("Seeds of Aiur",
            "TWOS",
            "LOSS",
            "FASTER",
            1515554710);

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
