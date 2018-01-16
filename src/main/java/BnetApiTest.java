import model.*;
import model.ladder.Ladder;
import model.matchHistory.MatchHistory;
import model.profile.Profile;
import model.profile.ProfileAchievement;
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
        BnetApi<MatchHistory> matchHistory = new BnetApi<MatchHistory>(MatchHistory.class, config);
        System.out.println(matchHistory.callApi());

        BnetApi<Ladder> ladder = new BnetApi<Ladder>(Ladder.class, config);
        System.out.println(ladder.callApi());

        BnetApi<Profile> profile = new BnetApi<>(Profile.class, config);
        System.out.println(profile.callApi());

        /*
        // TODO: this json has categories at bottom. need to revise data model
        BnetApi<AchievementList> aL = new BnetApi<AchievementList>(AchievementList.class, config);
        System.out.println(aL.callApi());
        */

    }
}