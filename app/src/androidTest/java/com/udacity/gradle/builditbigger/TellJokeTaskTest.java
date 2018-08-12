package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;

import com.bill.android.jokeproviderjavalib.JokeProvider;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

@RunWith(AndroidJUnit4.class)
public class TellJokeTaskTest {

    JokeProvider jp = new JokeProvider();

    @Test
    public void testTellJokeTask() throws InterruptedException {
        final CountDownLatch signal = new CountDownLatch(1);

        new TellJokeTask(){
            @Override
            protected void onPostExecute(String s) {
                Assert.assertNotEquals("", s);
                Assert.assertNotNull(s);
                signal.countDown();
            }
        }.execute((Context)null);
        signal.await();
    }
}
