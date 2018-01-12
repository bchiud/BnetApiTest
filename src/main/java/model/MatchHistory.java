package model;

import com.google.auto.value.AutoValue;

import java.util.ArrayList;
import java.util.List;

@AutoValue
public abstract class MatchHistory {

    public abstract List<Match> getMatches();

    public static MatchHistory List(ArrayList<Match> matches) {
        return new AutoValue_MatchHistory(matches);
    }
}
