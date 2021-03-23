package attractions;

import behaviours.ISecurity;
import people.Visitor;

// Note: IReviewed is implemented in the abstract parent class.

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 15) {
            return false;
        } else {
            return true;
        }
    }

}