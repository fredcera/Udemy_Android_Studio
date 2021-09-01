package curso.udemy.appaula1.view;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import curso.udemy.appaula1.R;

public class MainActivity extends AppCompatActivity {

    TextView txtTitulo;
    EditText primeiroNome, sobrenome, telefone, email;
    Button btnLimpar, btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        *REferencia o id do layout com os objetos
        * */
        primeiroNome = findViewById(R.id.edit_Primeiro_nome);
        sobrenome = findViewById(R.id.edit_Sobrenome);
        telefone = findViewById(R.id.edit_telefone);
        email = findViewById(R.id.edit_email);

        btnLimpar = findViewById(R.id.btn_limpar);
        btnSalvar = findViewById(R.id.btn_salvar);


        /*
        *
        * */
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primeiroNome.setText("");
                sobrenome.setText("");
                telefone.setText("");
                email.setText("");
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                * usando o Toast, pode-se colocar na tela uma mensagem temporaria para informar algo ao usuario
                * usando o metodo makeText podemos mostrar na tela o Toast
                * Context context = contexto em que vai aparecer a mensagem Toast
                * CharSequence text = texto que sera apresentado dentro do Toast
                * int duration = é o tempo que ficara disponivel na tela a mensagem Toast
                * */
                Toast.makeText(getApplicationContext(), "Primeiro nome: " + primeiroNome.getText(), Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Sobrenome: " + sobrenome.getText(), Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Telefone: " + telefone.getText(), Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "E-mail: " + email.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}