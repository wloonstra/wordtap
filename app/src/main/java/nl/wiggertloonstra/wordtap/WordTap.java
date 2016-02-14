package nl.wiggertloonstra.wordtap;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import nl.wiggertloonstra.wordtap.library.WordLibrary;

public class WordTap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_tap);

        setupTappingOnWordContainer();
    }

    private void setupTappingOnWordContainer() {
        View globalContainer = findViewById(R.id.global_container);
        globalContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayNextWord();
            }
        });
    }

    private void displayNextWord() {
        TextView wordContainer = (TextView) findViewById(R.id.word_container);
        wordContainer.setText(WordLibrary.getInstance().getNextWord());
    }
}
