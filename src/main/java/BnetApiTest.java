import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import model.MatchHistory;
import utils.AdapterFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import utils.ConfigService;

public class BnetApiTest {



    private static String apiKey;
    private static String locale;

    public static void main(String[] args) {

        /*
        get api key and locale
        */
        ConfigService configService = new ConfigService();
        apiKey = configService.getApiKey();
        locale = configService.getLocale();

        // okhttp to make connect
        // retrofit to turn into oject
        // moshi to turn json into pogo; used by retrofit

        OkHttpClient client = new OkHttpClient();

        // https://dev.battle.net/io-docs
        Request request = new Request.Builder()
                .url("https://us.api.battle.net/sc2/profile/4014615/1/LieZ/matches?locale=" + locale + "&apikey=" + apiKey)
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

        System.out.println(matchHistory);

    }
}