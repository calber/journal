package org.calber.journal;

import org.calber.journal.models.River;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(JUnit4.class)
public class ApiTest {


    @Test
    public void api() throws Exception {
        ApiController controller = new ApiController();

        River r = controller.api.publication(JournalApi.PUBSTAG[0]).blockingLast();
    }
}
