import api.MatchHistoryService;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.net.URL;

import model.Config;
import model.MatchHistory;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import utils.AdapterFactory;
import utils.ConfigService;

public class BnetApiTest {

    private static String apiKey;
    private static String locale;

    public static void main(String[] args) {

        /*
        get api key and locale
        setup bnet params
        */
        Config config = ConfigService.ConfigService();

        /*
        get match history data
        */
        MatchHistory matchHistory = MatchHistoryService.getMatchHistory(config);
        System.out.println(matchHistory);

    }
}