package View_Control;

import java.awt.*;

import Model.Book;
import basicGUI.*;

public class BookInfoPanel extends basicPanel{
    basicTextField returnDate_;
    basicLabel borrow_;
    basicLabel remaining_;
    public BookInfoPanel(Book b){
        this.setLayout(new GridLayout(6, 2));

        this.add(new basicLabel("Title")); this.add(new basicLabel(b.title));
        this.add(new basicLabel("Author")); this.add(new basicLabel(b.author));
        this.add(new basicLabel("Year")); this.add(new basicLabel(b.year+""));
        remaining_ = new basicLabel(b.remaining+"");
        this.add(new basicLabel("Remaining")); this.add(remaining_);
        borrow_ = new basicLabel("");
        this.add(new basicLabel("")); this.add(borrow_);
        basicButton borrow = new basicButton("Borrow"); returnDate_ = new basicTextField();
        returnDate_.setText("Return Date (YYYY-MM-DD)");
        this.add(borrow); this.add(returnDate_);
    }
}
