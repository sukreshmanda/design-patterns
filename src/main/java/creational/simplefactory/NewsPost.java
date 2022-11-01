package creational.simplefactory;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class NewsPost implements Post{
    private String title;
    private String contents;
    private String publishedOn;
    private String journal;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getContents() {
        return contents;
    }
}
