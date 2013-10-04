package command_query;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

public class CommandQueryTest {

    //mamy kod na walec i kolo

    //test na command
    @Test
    public void test_wysokosc(){
        Walec walec = new Walec(5,2);

        walec.zwiekszWysokosc();

        assertThat(walec.h).isEqualTo(6);
    }
    //test na query
     @Test
    public void test_objetosc(){
           Walec walec = new Walec(5,2);

         int objetosc = walec.objetosc();

         assertThat(objetosc).isEqualTo(40);
     }
     //dont test internals - private method

    //dont test internals - verify that podstawa was called
    //dont test internals - mock podstawa
    @Test
    public void test_objetosc2(){
        Walec walec = new Walec(5,2);
       // when(podstawa.).


        int objetosc = walec.objetosc();

        assertThat(objetosc).isEqualTo(40);
    }




}

//outgoing command message has to be tested

class Walec{
    int h;
    int r;
    Kolo podstawa;

    public Walec(int h, int r) {

        this.h = h;
        this.r = r;
        this.podstawa = new Kolo(r);
    }

    public int objetosc(){
        return h * polePodstawy();
    }
    //outgoing query o pole podstawy   nie weryfikujemy bomamy wartosc

    private int polePodstawy() {
        Double v = 2.14 * r * r;
        return v.intValue();
    }

    public void wysokosc(int h) {
        this.h = h;
        //observer wysokosci veryfikujey przez verify
    }

    public void zwiekszWysokosc() {
        h++;
    }
}

 class Kolo {
     int r;

     public Kolo(int r) {
         this.r = r;
     }

     private int pole() {
         Double v = 2.14 * r * r;
         return v.intValue();
     }
}




