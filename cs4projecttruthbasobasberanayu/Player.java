package cs4projecttruthbasobasberanayu;

public class Player {

    private String name;
    private int totalPoints;
    private boolean angelActive;
    private boolean doubleTroubleActive;
    
    public Player(String n) {
        name = n;
    }
    public void powerUp(String t) {
        if (t.equals("flying")) {
            angelActive = true;
        }
        if (t.equals("aquatic")) {
            doubleTroubleActive = true;
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public boolean isAngelActive() {
        return angelActive;
    }

    public void setAngelActive(boolean angelActive) {
        this.angelActive = angelActive;
    }

    public boolean isDoubleTroubleActive() {
        return doubleTroubleActive;
    }

    public void setDoubleTroubleActive(boolean doubleTroubleActive) {
        this.doubleTroubleActive = doubleTroubleActive;
    }
    
}