package spaceship;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class FlyingSaucerTest {

        @Test
    public void should_calculate_power(){
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);

        int power = flyingSaucer.getPower();

        Assertions.assertThat(power).isEqualTo(50);

    }
       @Test
    public void should_upgrade_gun_power(){
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);

        flyingSaucer.upgradeGun(5);

        Assertions.assertThat(flyingSaucer.getPower()).isEqualTo(100);
    }


    @Test
    public void should_call_gun_when_calculating_power() {
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);
        flyingSaucer.gun = mock(Gun.class);

        flyingSaucer.getPower();

        verify(flyingSaucer.gun).getPower();
    }

    @Test
    public void should_use_gun_power_to_calculate_power() {
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);
        flyingSaucer.gun = mock(Gun.class);
        when(flyingSaucer.gun.getPower()).thenReturn(5);

        flyingSaucer.getPower();

        Assertions.assertThat(flyingSaucer.getPower()).isEqualTo(50);
    }
}
