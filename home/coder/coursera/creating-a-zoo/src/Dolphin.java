public class Dolphin extends Animal{
    private String color;
    private int swimmingSpeed;

    public String getColor() {
        return color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(String nameOfAnimal, String color, int swimmingSpeed) {
        super(nameOfAnimal);
        this.color = color;
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood(){
        System.out.println("Dolphin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish");
    }

    void swimming(){
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour");
    }
}
