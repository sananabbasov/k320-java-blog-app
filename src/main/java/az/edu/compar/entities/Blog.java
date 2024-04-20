package az.edu.compar.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Blog {
    private Long id;
    private String title;
    private String description;
    private String photoUlr;
    private String category;
    private String user;
}
