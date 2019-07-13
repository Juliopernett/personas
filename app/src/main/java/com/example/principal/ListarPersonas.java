package com.example.principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListarPersonas extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Persona> personas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_personas);
        tabla = findViewById(R.id.tabla);
        personas = Datos.obtener();
        //lenado de tabla
        for (int i =  0; i<personas.size(); i++){
            //creamos el objeto fila
            TableRow fila = new TableRow(this);
            //Creamos los objetos columnas
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            //En la primera columna la lleno con un autoincremental
            c1.setText(""+(i+1));
            //la segunda columna la llenamos con le cedula de la persona
            c2.setText(personas.get(i).getCedula());
            //la tercera columna la llenamos con le nombre de la persona
            c3.setText(personas.get(i).getNombre());
            //la cuarta columna la llenamos con le apellido de la persona
            c4.setText(personas.get(i).getApellido());

            //le paso las columnas a la fila
            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            //le paso la fila a la tabla
            tabla.addView(fila);
        }
    }
}
