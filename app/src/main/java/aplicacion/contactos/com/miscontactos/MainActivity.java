package aplicacion.contactos.com.miscontactos;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final long SPLASH_RETARDO = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //SPLASH IMAGEN
        //getActionBar().hide(); //para ocultar la barra

        if (savedInstanceState == null) {
            // Show the splash screen at the beginning
            Fragment splash = new Fragment();
            android.support.v4.app.FragmentTransaction transaction;
            transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.main, splash);
            transaction.addToBackStack(null);
            transaction.commit();
        }


        BaseDatosInterna mibasedatos = new BaseDatosInterna(this);
        Log.d("myTag", mibasedatos.getDatabaseName());
        System.out.println(mibasedatos.getDatabaseName());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Log.d("myTag","Has pulsado algo");
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_anadir) {
            //Toast.makeText(this, "Has pulsado añadir", Toast.LENGTH_SHORT).show();
            //setContentView(R.layout.activity_anadir);
            Intent i = new Intent(MainActivity.this, anadir.class);
            startActivity(i);

            return true;
        }
        if (id == R.id.action_eliminar) {
            Toast.makeText(this, "Has pulsado eliminar", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.action_exportar) {
            Toast.makeText(this, "Has pulsado exportar", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
