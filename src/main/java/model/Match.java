package model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Match {

    public abstract String getMap();
    public abstract String getType();
    public abstract String getDecision();
    public abstract String getSpeed();
    public abstract double getDate();

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


    public static Match create(String map,
                               String type,
                               String decision,
                               String speed,
                               double date) {
        return new AutoValue_Match(map, type, decision, speed, date);
    }
}
