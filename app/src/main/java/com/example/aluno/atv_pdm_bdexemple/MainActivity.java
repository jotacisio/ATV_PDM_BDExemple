package com.example.aluno.atv_pdm_bdexemple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "sql";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BancoHelper db = new BancoHelper(this);

        Carro corsa = new Carro(2000, "Corsa", "Hatch", "Carro Corsa");
        Carro palio = new Carro(2016, "Palio", "Hatch", "Carro Palio");
        Carro hbvinte = new Carro(2014, "HB20", "Sedan", "Carro HB20");
        Carro tuckson = new Carro(2015, "Tuckson", "Sedan", "Carro Tuckson");
        Carro corsa2 = new Carro(2015, "Corsa", "Hatch", "Carro Corsa 2");

        db.save(corsa);
        db.save(palio);
        db.save(hbvinte);
        db.save(tuckson);
        db.save(corsa2);

       List<Carro> lista = db.findAll();

       for (Carro c: lista) {
           Log.i(TAG, c.toString());
       }


        tuckson = db.findById(4);
        tuckson.setDesc("Nova descrição.");
        db.save(tuckson);

        lista = db.findAll();
        for (Carro c: lista) {
            Log.i(TAG, c.toString());
        }

        db.delete(db.findById(1));
        db.delete(db.findById(2));

        lista = db.findAll();
        for (Carro c: lista) {
            Log.i(TAG, c.toString());
        }

        db.deleteCarrosByTipo("Sedan");

        lista = db.findAll();
        for (Carro c: lista) {
            Log.i(TAG, c.toString());
        }

        lista = db.findAllByTipo("Sedan");
        for (Carro c: lista) {
            Log.i(TAG, c.toString());
        }

    }
}
