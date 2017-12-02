package comjorgelioapp.httpsgithub.fisicafacilita;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.*;
import android.widget.Button;
import android.util.Log;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private TextView info;
    private TextView texto;
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button) findViewById(R.id.button1);

        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =  new Intent(MainActivity.this,Main2Activity.class);
                finish();
                startActivity(intent);
            }

        });


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
            finish();
        }

        return true;
    }


}

