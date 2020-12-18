package br.sp.senac.projetorecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Livro_Activity extends AppCompatActivity {

    private TextView txtTitulo, txtDescricao, txtRanking;
    private ImageView imagemLivro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.livro_layout);

        txtTitulo = findViewById(R.id.txtIdTitulo);
        txtDescricao = findViewById(R.id.txtIdDescricao);
        txtRanking = findViewById(R.id.txtIdRanking);
        imagemLivro =  findViewById(R.id.idImgLivroN);

        Intent intent =  getIntent();

        String titulo = intent.getExtras().getString("Titulo");
        String descricao = intent.getExtras().getString("Descricao");
        String ranking = intent.getExtras().getString("Ranking");
        int miniatura = intent.getExtras().getInt("Miniatura");

        txtTitulo.setText(titulo);
        txtDescricao.setText(descricao);
        txtRanking.setText(ranking);
        imagemLivro.setImageResource(miniatura);

    }
}
