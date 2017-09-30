package ua.rd.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringRunner;
import ua.rd.RepositoryConfig;
import ua.rd.ServiceConfig;
import ua.rd.repository.TweetRepository;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


@RunWith(SpringRunner.class)
@ContextHierarchy({
        @ContextConfiguration(locations = "classpath:repoContext.xml"),
        @ContextConfiguration(classes = ServiceConfig.class)
        })

@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class SimpleTweetServiceTest {

    @Autowired
    private TweetService tweetService;

    public SimpleTweetServiceTest() {
        System.out.println("test created");
//        throw new RuntimeException();
    }

    @Test
    public void newTweetIsNotNull() throws Exception {
//        TweetService tweetService = new SimpleTweetService(rt);
        assertNotNull(tweetService.newTweet());
    }

    @Test
    public void newTweetTweersAreNotEqual() throws Exception {
//        TweetService tweetService = new SimpleTweetService(rt);
        assertNotSame(tweetService.newTweet(), tweetService.newTweet());
    }
}