package model.matchHistory;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import org.jetbrains.annotations.Nullable;
import java.util.Optional;

@AutoValue
public abstract class Match {

    @Json(name = "map") @Nullable public abstract String map();
    @Json(name = "type") @Nullable abstract String type();
    @Json(name = "decision") @Nullable public abstract String decision();
    @Json(name = "speed") @Nullable public abstract String speed();
    @Json(name = "date") @Nullable public abstract Long date();

    public static Builder builder() {
        return new AutoValue_Match.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setMap(@Nullable String value);
        public abstract Builder setType(@Nullable String value);
        public abstract Builder setDecision(@Nullable String value);
        public abstract Builder setSpeed(@Nullable String value);
        public abstract Builder setDate(@Nullable Long value);
        public abstract Match build();
    }

    public static JsonAdapter<Match> jsonAdapter(Moshi moshi) {
        return new AutoValue_Match.MoshiJsonAdapter(moshi);
    }

}
