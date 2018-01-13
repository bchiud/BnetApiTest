package api;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import model.Config;
import model.MatchHistory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import utils.AdapterFactory;

public class MatchHistoryService {

    public MatchHistory MatchHistoryService(Config config) {

        OkHttpClient client = new OkHttpClient();

        // https://dev.battle.net/io-docs
        Request request = new Request.Builder()
                .url("https://us.api.battle.net/sc2/profile/4014615/1/LieZ/matches?locale=" + config.locale() + "&apikey=" + config.apiKey())
                .build();

        Response response = null;
        String results = null;
        try {
            response = client.newCall(request).execute();
            results = response.body().string();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        Moshi moshi = new Moshi.Builder()
                .add(AdapterFactory.create())
                .build();
        JsonAdapter<MatchHistory> matchHistoryJsonAdapter = moshi.adapter(MatchHistory.class);

        MatchHistory matchHistory = null;
        try {
            matchHistory = matchHistoryJsonAdapter.fromJson(results);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        return matchHistory;
    }
}
