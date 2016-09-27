package brsalvador.com.unidom.loteria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TLPincipalActivity extends AppCompatActivity {

    Button btMegasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btMegasena = (Button)findViewById(R.id.btMega);
        btMegasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TLPincipalActivity.this,TLVolanteActivity.class);
                startActivity(intent);
                finish();

            }
        });



    }






}
