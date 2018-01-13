package model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Match {

    public abstract String getMap();
    public abstract String getType();
    public abstract String getDecision();
    public abstract String getSpeed();
    public abstract double getDate();

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

}
