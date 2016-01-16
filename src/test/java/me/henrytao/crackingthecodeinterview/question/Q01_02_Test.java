package me.henrytao.crackingthecodeinterview.question;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by henrytao on 1/16/16.
 */
public class Q01_02_Test {

    @Test
    public void testPermutation() throws Exception {
        assertThat(Q01_02.permutation("abc", "cba"), equalTo(true));
        assertThat(Q01_02.permutation("abc", "cab"), equalTo(true));
        assertThat(Q01_02.permutation("abc", "bacx"), equalTo(false));
    }
}
