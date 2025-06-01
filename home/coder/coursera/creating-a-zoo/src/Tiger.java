public class Tiger extends Animal implements Walk{
    private int numberOfStripes;
    private int speed;
    private int soundLevel;

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Tiger(String nameOfAnimal, int numberOfStripes, int speed, int levelOfRoar) {
        super(nameOfAnimal);
        this.numberOfStripes = numberOfStripes;
        this.speed = speed;
        this.soundLevel = soundLevel;
    }


    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    void walking(){
        System.out.println("Tiger: I am moving at the speed of " + speed + " mph");
    }


}
