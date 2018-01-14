import model.*;
import model.Ladder;
import utils.BnetApi;
import utils.ConfigService;

public class BnetApiTest {

    public static void main(String[] args) {

        /*
        get api key and locale
        setup bnet params
        */
        Config config = ConfigService.ConfigService();
        //
        BnetApi<MatchHistory> mH = new BnetApi<MatchHistory>(MatchHistory.class, config);
        System.out.println(mH.callApi());

        BnetApi<Ladder> lL = new BnetApi<Ladder>(Ladder.class, config);
        System.out.println(lL.callApi());

        /*
        // TODO: this json has categories at bottom. need to revise data model
        BnetApi<AchievementList> aL = new BnetApi<AchievementList>(AchievementList.class, config);
        System.out.println(aL.callApi());
        */

    }
}