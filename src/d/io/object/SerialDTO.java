package d.io.object;

import java.io.Serializable;

public class SerialDTO implements Serializable {
    private String bookName;
    private int bookOrder;
    private boolean bestSeller;
    private long soldPerDay;
    private String bookTypes = "IT";
    static final long serialVersionUID = 1L;

    public SerialDTO(String bookName, int bookOrder, boolean bestSeller,
                     long soldPerDay){
        super();
        this.bookName = bookName;
        this.bookOrder = bookOrder;
        this.bestSeller = bestSeller;
        this.soldPerDay = soldPerDay;
    }
    @Override
    public String toString(){
        return "bookName = "+bookName+
                "bookOrder = "+bookOrder+
                "bestSeller = "+bestSeller+
                "soldPerDay = "+soldPerDay+
                "bookType = "+bookTypes;
    }
}
