package es.moki.ratelimitj.core;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RateLimitUtilsTest {

    @Test
    public void shouldReturnFirst() {
        Object one = new Object();
        Object two = new Object();

        assertThat(RateLimitUtils.coalesce(one, two)).isEqualTo(one);
    }

    @Test
    public void shouldReturnSecond() {
        Object one = null;
        Object two = new Object();

        assertThat(RateLimitUtils.coalesce(one, two)).isEqualTo(two);
    }
}