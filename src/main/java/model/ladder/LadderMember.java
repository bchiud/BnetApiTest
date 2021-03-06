package model.ladder;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import model.common.LadderCharacter;
import org.jetbrains.annotations.Nullable;

@AutoValue
public abstract class LadderMember {

    @Json(name = "character") public abstract LadderCharacter character();
    @Json(name = "joinTimestamp") public abstract Long joinTimestamp();
    @Json(name = "points") public abstract String points();
    @Json(name = "wins") public abstract Integer wins();
    @Json(name = "losses") public abstract Integer losses();
    @Json(name = "highestRank") public abstract Integer highestRank();
    @Json(name = "previousRank") public abstract Integer previousRank();
    @Json(name = "favoriteRaceP1") @Nullable public abstract String favoriteRaceP1();

    public static Builder builder() {
        return new AutoValue_LadderMember.Builder();
    }

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder setCharacter(LadderCharacter value);
        public abstract Builder setJoinTimestamp(Long realm);
        public abstract Builder setPoints(String value);
        public abstract Builder setWins(Integer value);
        public abstract Builder setLosses(Integer value);
        public abstract Builder setHighestRank(Integer value);
        public abstract Builder setPreviousRank(Integer value);
        public abstract Builder setFavoriteRaceP1(@Nullable String value);
        public abstract LadderMember build();
    }

    public static JsonAdapter<LadderMember> jsonAdapter(Moshi moshi) {
        return new AutoValue_LadderMember.MoshiJsonAdapter(moshi);
    }

}
