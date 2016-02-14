package nl.wiggertloonstra.wordtap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import nl.wiggertloonstra.wordtap.library.WordLibrary;

public class WordTap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_tap);

        styleTextSize();
        setupClickToNextWord();
    }

    private void styleTextSize() {
        TextView wordContainer = (TextView) findViewById(R.id.word_container);
        wordContainer.setTextSize(60);
    }

    private void setupClickToNextWord() {
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
