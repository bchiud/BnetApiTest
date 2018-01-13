package model;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

/*
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
*/

@AutoValue
public abstract class Match {

    @Json(name = "map") public abstract String map();
    @Json(name = "type") public abstract String type();
    @Json(name = "decision") public abstract String decision();
    @Json(name = "speed") public abstract String speed();
    @Json(name = "date") public abstract double date();

    /*
    // autoValue
    public static Match create(String map,
                               String type,
                               String decision,
                               String speed,
                               double date) {
        return new AutoValue_Match(map, type, decision, speed, date);
    }
    */

    /*
    // autoValueBuilder
    public static Builder builder() {
        return new AutoValue_Match.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setMap(String value);
        public abstract Builder setType(String value);
        public abstract Builder setDecision(String value);
        public abstract Builder setSpeed(String value);
        public abstract Builder setDate(double value);
        public abstract Match build();
    }
    */

    /*
    // autoValueGson
    public static TypeAdapter<Match> typeAdapter(Gson gson) {
        return new AutoValue_Match.GsonTypeAdapter(gson);
    }
    */

    // autoValueMoshi
    public static JsonAdapter<Match> jsonAdapter(Moshi moshi) {
        return new AutoValue_Match.MoshiJsonAdapter(moshi);
    }

}
