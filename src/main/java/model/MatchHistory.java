package model;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.List;


@AutoValue
public abstract class MatchHistory {

    @Json(name = "matches") public abstract List<Match> getMatches();

    public static Builder builder() {
        return new AutoValue_MatchHistory.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setMatches(List<Match> matches);
        public abstract MatchHistory build();
    }

    public static JsonAdapter<MatchHistory> jsonAdapter(Moshi moshi) {
        return new AutoValue_MatchHistory.MoshiJsonAdapter(moshi);
    }

}
