package at.htl.football;

public class Match {

    private String homeName;
    private String guestName;
    private int homeGoals;
    private int guestGoals;

    public Match() {
    }

    public Match(String homeName, String guestName, int homeGoals, int guestGoals) {
        this.homeName = homeName;
        this.guestName = guestName;
        this.homeGoals = homeGoals;
        this.guestGoals = guestGoals;
    }

    public int getHomePoints() {
        if (homeGoals > guestGoals) {
            return 3;
        } else if (homeGoals == guestGoals) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getGuestPoints() {
        if (guestGoals > homeGoals) {
            return 3;
        } else if (guestGoals == homeGoals) {
            return 1;
        } else {
            return 0;
        }
    }

    //region Getter & Setter
    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getGuestGoals() {
        return guestGoals;
    }

    public void setGuestGoals(int guestGoals) {
        this.guestGoals = guestGoals;
    }
    //endregion
}
