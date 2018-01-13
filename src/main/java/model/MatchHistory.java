package model;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/*
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
*/

@AutoValue
public abstract class MatchHistory {

    @SerializedName("matches") public abstract List<Match> getMatches();

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

    // autoValueGson
    public static TypeAdapter<MatchHistory> typeAdapter(Gson gson) {
        return new AutoValue_MatchHistory.GsonTypeAdapter(gson);
    }

    /*
    // autoValueMoshi
    public static JsonAdapter<MatchHistory> jsonAdapter(Moshi moshi) {
        return new AutoValue_MatchHistory.MoshiJsonAdapter(moshi);
    }
    */
}
