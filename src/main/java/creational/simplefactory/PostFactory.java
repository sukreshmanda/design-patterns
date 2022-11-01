package creational.simplefactory;

import java.time.LocalDate;

public class PostFactory {
    Post createPost(PostEnums enu){
        switch (enu){
            case BLOG_POST:
                return BlogPost.builder()
                        .url("http://blogspot.com")
                        .contents("No contents as of now")
                        .author("dumb minds")
                        .publishedOn(LocalDate.now())
                        .build();
            case NEWS_POST:
                return NewsPost.builder()
                        .journal("Newyork Times")
                        .title("Design patterns")
                        .publishedOn(String.valueOf(LocalDate.now()))
                        .contents("some contents exists")
                        .build();
            default:
                return null;
        }
    }
}
