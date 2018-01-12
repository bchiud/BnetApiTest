package model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class MatchHistory {

    abstract String Map();
    abstract String Type();
    abstract String Decision();
    abstract String Speed();
    abstract double Date();

    // static Builder builder() {
    //     return new AutoValue_MatchHistory.Builder();
    // }
    //
    // @AutoValue.Builder
    // abstract static class Builder {
    //     abstract Builder setName(String value);
    //     abstract Builder setType(String value);
    //     abstract Builder setDecision(String value);
    //     abstract Builder setSpeed(String value);
    //     abstract Builder setDate(double value);
    //     abstract MatchHistory build();
    // }

    public static MatchHistory create(String name,
                                      String type,
                                      String decision,
                                      String speed,
                                      double date) {
        return new AutoValue_MatchHistory(name, type, decision, speed, date);
    }
}
