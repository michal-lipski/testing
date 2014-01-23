package spaceship;


public class FlyingSaucer {

    Gun gun;
    int flyingSaucerPower;


    public FlyingSaucer(int flyingSaucerPower, int gunPower) {
        this.flyingSaucerPower = flyingSaucerPower;
        gun = new Gun(gunPower);
    }

    public int getPower() {
        return flyingSaucerPower * gun.getPower();
    }

    public void upgradeGun(int additionalPower) {
        gun.upgradeGun(additionalPower);
    }


}
