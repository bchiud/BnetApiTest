import java.io.IOException;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import model.MatchHistory;
import model.MyAdapterFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

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

        // moshi
        Moshi moshi = new Moshi.Builder()
                .add(MyAdapterFactory.create())
                .build();
        JsonAdapter<MatchHistory> jsonAdapter = moshi.adapter(MatchHistory.class);

        MatchHistory matchHistory = null;
        try {
            matchHistory = jsonAdapter.fromJson(results);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println(matchHistory);


    }
}