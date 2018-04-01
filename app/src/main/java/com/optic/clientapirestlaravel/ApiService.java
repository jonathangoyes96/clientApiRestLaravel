package com.optic.clientapirestlaravel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Optic on 1/04/2018.
 * Contiene la configuracion del servicio rest que vamos a consumir
 */

public interface ApiService {
    public static final String URL="http://192.168.10.10/";

    @GET("api/v1/libros")
    Call<List<Libro>> listaLibros();
}
