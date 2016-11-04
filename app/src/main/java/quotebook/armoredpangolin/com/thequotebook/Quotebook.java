package quotebook.armoredpangolin.com.thequotebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Quotebook extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotebook);

        RelativeLayout touch = (RelativeLayout) findViewById(R.id.touch);
        final TextView quoteText = (TextView) findViewById(R.id.quote);
        final TextView personText = (TextView) findViewById(R.id.person);

        final ArrayList<Quote> quoteList = new ArrayList<Quote>();


        Quote quote1 = new Quote("Friends, Romans, countrymen, lend me your ears.", "Marc Antony");
        quoteList.add(quote1);

        Quote quote2 = new Quote("History is the version of past events that people have decided to agree upon.", "Napoleon Bonaparte");
        quoteList.add(quote2);

        Quote quote3 = new Quote("An unexamined life is not worth living.", "Socrates");
        quoteList.add(quote3);

        Quote quote4 = new Quote("From Stettin in the Baltic to Trieste in the Adriatic, an iron curtain has descended across the continent.", "Winston Churchill");
        quoteList.add(quote4);

        Quote quote5 = new Quote("Cogito ergo sum.", "René Descartes");
        quoteList.add(quote5);

        Quote quote6 = new Quote("I cannot remember the books I've read any more than the meals I have eaten; even so, they have made me.", "Ralph Waldo Emerson");
        quoteList.add(quote6);

        Quote quote7 = new Quote("Man is condemned to be free; because once thrown into the world, he is responsible for everything he does.", "Jean-Paul Sartre");
        quoteList.add(quote7);

        Quote quote8 = new Quote("Kobe.", "Kobe Bryant");
        quoteList.add(quote8);

        Quote quote9 = new Quote("George Bush doesn't care about black people.", "Kanye West");
        quoteList.add(quote9);

        Quote quote10 = new Quote("How can mirrors be real if our eyes aren't real.", "Jaden Smith");
        quoteList.add(quote10);

        Quote quote11 = new Quote("I was gonna be the first person in my family to graduate from community college. Everyone else graduated from normal college.", "Troy Barnes");
        quoteList.add(quote11);

        //Add more quotes here


        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count < quoteList.size()) {

                    Quote q = quoteList.get(count);

                    quoteText.setText(q.getQuote());

                    personText.setText(q.getPerson());

                    count = count + 1;


                } else{

                    count = 0;

                }




            }
        });
    }
}
