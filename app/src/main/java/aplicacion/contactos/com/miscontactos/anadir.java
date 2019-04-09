package aplicacion.contactos.com.miscontactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class anadir extends AppCompatActivity {

   // private Button aceptar = (Button) findViewById(R.id.aceptar);
   // private Button cancelar = (Button) findViewById(R.id.cancelar);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir);
    }
    public void metodocancelar(View v){
        onBackPressed();
    }

}
