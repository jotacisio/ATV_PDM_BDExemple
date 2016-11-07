package com.example.aluno.atv_pdm_bdexemple;

import android.provider.BaseColumns;

/**
 * Created by Taniro on 06/11/2016.
 */

public final class CarroContrato {

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private CarroContrato(){

    }
    public static class CarroEntry implements BaseColumns{
        public static final String TABLE_NAME = "Carro";
        public static final String NOME = "nome";
        public static final String DESCRICAO = "desc";
        public static final String TIPO_CARRO = "tipo";
        public static final String ANO = "ano";
    }


}
