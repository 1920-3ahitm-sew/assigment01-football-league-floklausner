package at.htl.football;

public class Team implements Comparable<Team> {

    private String name;
    private int points;
    private int wins;
    private int draws;
    private int defeats;
    private int goalsShot;
    private int goalsReceived;

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public void addMatch(Match match) {
        if (match.getHomeName().equals(name)) {
            points += match.getHomePoints();
            if (match.getHomePoints() == 3) {
                wins++;
            } else if (match.getHomePoints() == 1) {
                draws++;
            } else if (match.getHomePoints() == 0) {
                defeats++;
            }
            goalsShot += match.getHomeGoals();
            goalsReceived += match.getGuestGoals();
        } else if (match.getGuestName().equals(name)) {
            points += match.getGuestPoints();
            if (match.getGuestPoints() == 3) {
                wins++;
            } else if (match.getGuestPoints() == 1) {
                draws++;
            } else if (match.getGuestPoints() == 0) {
                defeats++;
            }
            goalsShot += match.getGuestGoals();
            goalsReceived += match.getHomeGoals();
        }
    }

    public int getGoalDifference() {
        return getGoalsShot() - getGoalsReceived();
    }

    public int compareTo(Team o) {
        if (points > o.getPoints()) {
            return 1;
        } else if (points < o.getPoints()) {
            return -1;
        } else {
            return Integer.compare(getGoalDifference(), o.getGoalDifference());
        }
    }

    //region Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getGoalsShot() {
        return goalsShot;
    }

    public void setGoalsShot(int goalsShot) {
        this.goalsShot = goalsShot;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public void setGoalsReceived(int goalsReceived) {
        this.goalsReceived = goalsReceived;
    }
    //endregion

}
