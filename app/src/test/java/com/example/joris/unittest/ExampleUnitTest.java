package com.example.joris.unittest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void validatorEmail_CorrectEmail(){
        assertThat(Validator.email("test@example.com"), is(true));
    }

    @Test
    public void validatorEmail_WrongEmail(){
        assertThat(Validator.email("test-example.com"), is(false));
    }
}