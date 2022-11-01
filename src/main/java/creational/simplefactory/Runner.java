package creational.simplefactory;

public class Runner {
    public static void main(String[] args) {
        PostFactory postFactory = new PostFactory();
        BlogPost blogPost = (BlogPost)postFactory.createPost(PostEnums.BLOG_POST);
        System.out.println(blogPost.getUrl());

        NewsPost newsPost = (NewsPost) postFactory.createPost(PostEnums.NEWS_POST);
        System.out.println(newsPost.getJournal());
    }
}
