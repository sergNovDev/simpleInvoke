import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Book {

    private Long id;
    private String title;

    private String myMethod(String param){
        return "param="+param+" id="+this.id+" param="+this.title;
    }
}
