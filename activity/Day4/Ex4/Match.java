import java.util.concurrent.CountDownLatch;

abstract public class Match{
   private int currentScore;
   private float currentOver;
   private int target;

    public Match()
    {

    }

    public Match(int currentScore, float currentOver, int target)
    {
        this.currentScore=currentScore;
        this.currentOver=currentOver;
        this.target=target;
    }
   

    public void setCurrentScore(int currentScore)
    {
        this.currentScore=currentScore;
    }
    public void setCurrentOver(float currentOver)
    {
        this.currentOver=currentOver;
    }
    public void setTarget(int target)
    {
        this.target=target;
    }

    public int getCurrentScore()
    {
        return this.currentScore;
    }

    public float getCurrentOver()
    {
        return this.currentOver;
    }

    public int getTarget()
    {
        return this.target;
    }

    abstract float calculateRunRate();
    abstract int calculateBalls();
    abstract void display(double reqRunrate, int balls);

}