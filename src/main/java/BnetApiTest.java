import model.*;
import model.achievements.AchievementList;
import model.ladder.Ladder;
import model.ladders.Ladders;
import model.matchHistory.MatchHistory;
import model.profile.Profile;
import model.profile.ProfileRewards;
import model.rewards.Rewards;
import utils.BnetApi;
import utils.ConfigService;

public class BnetApiTest {

    public static void main(String[] args) {

        // todo: ship projects with genereated and out files?

        /*
        get api key and locale
        setup bnet params
        */
        Config config = ConfigService.ConfigService();

        BnetApi<Profile> profile = new BnetApi<>(Profile.class, config);
        System.out.println(profile.callApi());

        BnetApi<Ladders> ladders = new BnetApi<Ladders>(Ladders.class, config);
        System.out.println(ladders.callApi());

        BnetApi<MatchHistory> matchHistory = new BnetApi<MatchHistory>(MatchHistory.class, config);
        System.out.println(matchHistory.callApi());

        BnetApi<Ladder> ladder = new BnetApi<Ladder>(Ladder.class, config);
        System.out.println(ladder.callApi());

        BnetApi<AchievementList> achievements = new BnetApi<AchievementList>(AchievementList.class, config);
        System.out.println(achievements.callApi());

        BnetApi<Rewards> rewards = new BnetApi<Rewards>(Rewards.class, config);
        System.out.println(rewards.callApi());

    }
}