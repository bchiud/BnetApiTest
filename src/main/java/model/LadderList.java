package model;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.List;

@AutoValue
public abstract class LadderList {

    @Json(name = "ladderMembers") public abstract List<LadderMember> ladderMembers();

    public static Builder builder() {
        return new AutoValue_LadderList.Builder();
    }

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder setLadderMembers(List<LadderMember> value);
        public abstract LadderList build();
    }

    public static JsonAdapter<LadderList> jsonAdapter(Moshi moshi) {
        return new AutoValue_LadderList.MoshiJsonAdapter(moshi);
    }
}
