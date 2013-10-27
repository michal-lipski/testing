package $9_legacy_code;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import legacy_code.Validator;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class LegacyCodeTest {

    @Test
    public void should_be_null_for_null_string(){
        assertThat(Validator.isNull(null)).isTrue();
    }

    @Test
    @Parameters({"", " ", "null", " n ul l "})
    public void should_be_null_for_non_null_string(String string){
        assertThat(Validator.isNull(string)).isTrue();
    }

    @Test
    @Parameters({"\t", "a", " B ", "n", "nu", "nul", "\n", "\r", "\r\n"})
    public void should_not_be_null(String string){
        assertThat(Validator.isNull(string)).isFalse();
    }
}
