package model;

import java.util.List;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class MatchHistory {

    public abstract List<Match> getMatches();

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

}
