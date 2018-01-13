package model;

import java.util.List;

import com.google.auto.value.AutoValue;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

@AutoValue
public abstract class MatchHistory {

    @Json(name = "matches") public abstract List<Match> getMatches();

    // autoValue
    public static MatchHistory create(List<Match> matches) {
        return new AutoValue_MatchHistory(matches);
    }

    /*
    // autoValueBuilder
    public static Builder builder() {
        return new AutoValue_MatchHistory.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setMatches(List<Match> matches);
        public abstract MatchHistory build();
    }
    */

    // autoValueMoshi
    public static JsonAdapter<MatchHistory> jsonAdapter(Moshi moshi) {
        return new AutoValue_MatchHistory.MoshiJsonAdapter(moshi);
    }

}
