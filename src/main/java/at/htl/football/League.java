package at.htl.football;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {

    private List<Team> teams = new ArrayList<Team>();

    public void addMatchResult(Match match) {
        findOrCreateTeam(match.getHomeName()).addMatch(match);
        findOrCreateTeam(match.getGuestName()).addMatch(match);
    }

    private Team findOrCreateTeam(String teamToFind) {
        for (Team team : teams) {
            if (team.getName().equals(teamToFind)) {
                return team;
            }
        }
        Team newTeam = new Team(teamToFind);
        teams.add(newTeam);
        return newTeam;
    }

    public List<Team> getTable() {
        teams.sort(Collections.reverseOrder());
        return teams;
    }
}
