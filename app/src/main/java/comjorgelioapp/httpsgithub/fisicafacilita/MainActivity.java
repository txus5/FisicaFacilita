package comjorgelioapp.httpsgithub.fisicafacilita;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TextView;
import android.view.*;
import android.widget.Button;
import android.util.Log;
import android.content.res.*;
import android.*;
import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView info;
    private TextView texto;
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        start = (Button) findViewById(R.id.button);
        info = (TextView) findViewById(R.id.info);
        texto = (TextView) findViewById(R.id.texto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.cam_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.menu_item_contact_aviso) {
            texto.setText(" ");
            info.setText("Contacto:\n Jorge.Valero1@alu.uclm.es");
            start.setVisibility(View.INVISIBLE);
        }
        else if (item.getItemId() == R.id.menu_item_settings_aviso) {
            texto.setText(" ");
            info.setText(" ");
            start.setVisibility(View.INVISIBLE);
        }
        else if (item.getItemId() == android.R.id.home){
            Log.i("ActionBar","Atrás!");
            setContentView(R.layout.activity_main);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            start = (Button) findViewById(R.id.button);
            info = (TextView) findViewById(R.id.info);
            texto = (TextView) findViewById(R.id.texto);
        }

        return true;
    }

    public void start_(View v){
        setContentView(R.layout.start);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        info = (TextView) findViewById(R.id.info);

    }

}

