package br.com.senacsp.espacoshoramapp2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Agendamento_Activity extends Activity {
    private Spinner tecnicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agendamento_layout);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.tecnicas_sel,
                android.R.layout.simple_spinner_item);
        tecnicas = (Spinner) findViewById(R.id.tecnicas_sel);
        tecnicas.setAdapter(adapter);
    }
}
