package spaceship;

/**
* Created with IntelliJ IDEA.
* User: mlip
* Date: 1/23/14
* Time: 1:03 PM
* To change this template use File | Settings | File Templates.
*/
public class Gun {
    private int power;

    public Gun(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void upgradeGun(int additionalPower) {
        power += additionalPower;
    }
}
