package incoming_command;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

//TESTING COMMAND METHODS
public class FlyingSaucerTest {

    @Test
    public void should_upgrade_gun_power() {
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);

        flyingSaucer.upgradeGun(5);

        assertThat(flyingSaucer.getPower()).isEqualTo(100);
    }
}
