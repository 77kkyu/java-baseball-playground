package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] values = "1,2".split(",");
        assertThat(values).containsExactly("1", "2");
        assertThat(values).contains("1", "2");
    }

    @Test
    void splitRemoveSpecialCharacters() {
        String[] values = "(1,2)".substring(1,4).split(",");
        assertThat(values).containsExactly("1", "2");
        assertThat(values).contains("1", "2");
    }

    @DisplayName("문자열 StringIndexOutOfBoundsException 에러 확인")
    @Test
    void outOfRange_error_check() throws Exception {
        String str = "abc";
        int index = 4;
        assertThatThrownBy(() -> str.charAt(index))
            .isInstanceOf(StringIndexOutOfBoundsException.class)
            .hasMessageContaining(String.valueOf(index));

        //junit5
        assertThrows(StringIndexOutOfBoundsException.class, () -> str.charAt(index));
    }
}
