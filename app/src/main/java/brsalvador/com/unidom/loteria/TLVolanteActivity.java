package brsalvador.com.unidom.loteria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TLVolanteActivity extends AppCompatActivity {
    Button btVoltar_Volante;
    Button btConfirmar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volante);

        btVoltar_Volante = (Button)findViewById(R.id.btVoltar);
        btVoltar_Volante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentVoltar = new Intent(TLVolanteActivity.this,TLPincipalActivity.class);
                startActivity(IntentVoltar);
                finish();

            }
        });

        btConfirmar = (Button)findViewById(R.id.btConfimarJogo);
        btConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentConfirmar = new Intent(TLVolanteActivity.this,TLPagamentoActivity.class);
                startActivity(IntentConfirmar);
                finish();
            }
        });
    }
}
