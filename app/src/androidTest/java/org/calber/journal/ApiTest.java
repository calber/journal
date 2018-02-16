package org.calber.journal;

import org.calber.journal.models.Article;
import org.calber.journal.models.River;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertNotNull;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(JUnit4.class)
public class ApiTest {


    @Test
    public void river() throws Exception {
        ApiController controller = new ApiController();

        River r = controller.api.publication(JournalApi.PUBSTAG[0]).blockingLast();
        for (Article a : r.response.articles) {
            assertNotNull(a.content);
            assertNotNull(a.images);
            assertNotNull(a.excerpt);
            assertNotNull(a.title);
        }
    }

    @Test
    public void tag() throws Exception {
        ApiController controller = new ApiController();

        River r = controller.api.slug(JournalApi.SLUGSTAG[0]).blockingLast();
        for (Article a : r.response.articles) {
            assertNotNull(a.content);
            assertNotNull(a.images);
            assertNotNull(a.excerpt);
            assertNotNull(a.title);
        }
    }
}
