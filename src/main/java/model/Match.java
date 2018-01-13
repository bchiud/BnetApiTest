package model;

import com.google.auto.value.AutoValue;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/*
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
*/

@AutoValue
public abstract class Match {

    @SerializedName("map") public abstract String getMap();
    @SerializedName("type") public abstract String getType();
    @SerializedName("decision") public abstract String getDecision();
    @SerializedName("speed") public abstract String getSpeed();
    @SerializedName("date") public abstract double getDate();

    // autoValue
    public static Match create(String map,
                               String type,
                               String decision,
                               String speed,
                               double date) {
        return new AutoValue_Match(map, type, decision, speed, date);
    }

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

    // autoValueGson
    public static TypeAdapter<Match> typeAdapter(Gson gson) {
        return new AutoValue_Match.GsonTypeAdapter(gson);
    }

    /*
    // autoValueMoshi
    public static JsonAdapter<Match> jsonAdapter(Moshi moshi) {
        return new AutoValue_Match.MoshiJsonAdapter(moshi);
    }
    */

}
