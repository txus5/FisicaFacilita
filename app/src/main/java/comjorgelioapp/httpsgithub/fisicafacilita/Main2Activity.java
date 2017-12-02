package comjorgelioapp.httpsgithub.fisicafacilita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        info = (TextView) findViewById(R.id.info);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.cam_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.menu_item_contact_aviso) {
            info.setText("Contacto:\n Jorge.Valero1@alu.uclm.es");
        }
        else if (item.getItemId() == R.id.menu_item_settings_aviso) {
            info.setText(" ");
        }
        if (item.getItemId() == android.R.id.home){
            Log.i("ActionBar","Atrás!");
            Intent intent2 =  new Intent(Main2Activity.this,MainActivity.class);
            finish();
            startActivity(intent2);
        }

        return true;
    }


}
