package comparator;

import java.util.Comparator;
import simulation.Team;

/**
 * Created by ahngu on 11/13/2017.
 */

public class CompTeamORYPG implements Comparator<Team> {
    @Override
    public int compare(Team a, Team b) {
        return a.teamOppRushYards / a.numGames() < b.teamOppRushYards / b.numGames() ? -1 : a.teamOppRushYards / a.numGames() == b.teamOppRushYards / b.numGames() ? 0 : 1;
    }
}
