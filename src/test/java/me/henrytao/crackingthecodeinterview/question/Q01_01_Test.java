package me.henrytao.crackingthecodeinterview.question;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by henrytao on 1/16/16.
 */
public class Q01_01_Test {

    @Test
    public void testIsUniqueLetter() throws Exception {

        assertThat(Q01_01.isUniqueLetter("abcxyz"), equalTo(true));
        assertThat(Q01_01.isUniqueLetter("aabcde"), equalTo(false));
        assertThat(Q01_01.isUniqueLetter("XYZ"), equalTo(true));
        assertThat(Q01_01.isUniqueLetter("#abYx*"), equalTo(true));
        assertThat(Q01_01.isUniqueLetter("Ȃabc"), equalTo(false));
    }

    @Test
    public void testIsUnique() throws Exception {
        assertThat(Q01_01.isUnique("Ȃabc"), equalTo(true));
        assertThat(Q01_01.isUnique("ȂȂabc"), equalTo(false));
    }
}
