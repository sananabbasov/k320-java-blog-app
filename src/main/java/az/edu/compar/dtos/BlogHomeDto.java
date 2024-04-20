package az.edu.compar.dtos;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BlogHomeDto {
    private Long id;
    private String title;
    private String photoUlr;
    private String category;
}
