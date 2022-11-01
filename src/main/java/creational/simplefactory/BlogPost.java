package creational.simplefactory;

import lombok.*;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BlogPost implements Post{
    private String title;
    private String contents;
    private String url;
    private String author;
    private LocalDate publishedOn;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getContents() {
        return contents;
    }
}
