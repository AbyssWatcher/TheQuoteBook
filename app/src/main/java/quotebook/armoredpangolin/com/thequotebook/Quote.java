package quotebook.armoredpangolin.com.thequotebook;

/**
 * Created by Austi on 11/4/2016.
 */

public class Quote {
    public String quote;
    public String person;


    public Quote(String mQuote, String mPerson){
        super();

        quote = mQuote;
        person = mPerson;

    }

    public String getPerson() {
        return person;
    }

    public String getQuote() {
        return quote;
    }
}
