package too_simple_for_testing;

import java.io.DataOutputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DelegationTest {

    @Test
    public void should_call_reformatter() throws Exception {
        //given

        //when

        //then

    }

    class SomeWriter {

        Reformater myReformatter = new Reformater();

        public DataOutputStream writeReformattedDataToStream(String message) {
            return myReformatter.doTheActualWorkAndWriteDataToStream(message);
        }
    }

    private class Reformater {
        public DataOutputStream doTheActualWorkAndWriteDataToStream(String message) {
            return new DataOutputStream(null);
        }
    }
}
