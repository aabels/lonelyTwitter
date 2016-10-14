package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        TextView displayTweet = (TextView)findViewById(R.id.textView);

        Bundle extras = getIntent().getExtras();
        String tweetMessage = (String) extras.get("tweeet");
    }


}
