public class Penguin extends Animal implements Swim, Walk{
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public Penguin(String nameOfAnimal, boolean isSwimming, int walkSpeed, int swimSpeed) {
        super(nameOfAnimal);
        this.isSwimming = isSwimming;
        this.walkSpeed = walkSpeed;
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingFood(){
        System.out.println("Penguin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted(){
        System.out.println("Penguin: I have eaten fish");
    }

    public void walking(){
        System.out.println("Penguin: I am moving at the speed of " + walkSpeed + " mph");
    }

    public void swimming(){
        System.out.println("Penguin: I am swimming at the speed of " + swimSpeed +  " nautical miles per hour");
    }
}
