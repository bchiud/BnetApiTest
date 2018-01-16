package model.profile;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.List;

@AutoValue
public abstract class Rewards {
    @Json(name = "selected") public abstract List<Long> selected();
    @Json(name = "earned") public abstract List<Long> earned();

    public static Builder Builder() {
        return new AutoValue_Rewards.Builder();
    }

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder setSelected(List<Long> value);
        public abstract Builder setEarned(List<Long> value);
        public abstract Rewards build();
    }

    public static JsonAdapter<Rewards> jsonAdapter(Moshi moshi) {
        return new AutoValue_Rewards.MoshiJsonAdapter(moshi);
    }

}
