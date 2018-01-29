package appjpm4everyone.ejemplo_desdecero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Mapeo de objetos
    EditText campoNombre;
    TextView etiNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Casting desde XML
        campoNombre = (EditText) findViewById(R.id.Txtnombre);
        etiNombre = (TextView) findViewById(R.id.Etinombre);

    }



    public void Click1(View view) {
        //Switch case
        switch (view.getId()){
            case R.id.Btningreso:
                String nombre = campoNombre.getText().toString();
                etiNombre.setText("Bienvenid@: "+nombre);
                //Aviso Toast
                Toast.makeText(this,"El nombre es: "+nombre,Toast.LENGTH_SHORT).show();
            break;


        }//Final switch
    }//void Click view
}
