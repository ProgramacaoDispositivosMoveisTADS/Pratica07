package br.edu.ifpe.tads.pdm.pratica07;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {

    private static final String [] cities = {"Recife", "João Pessoa", "Natal",
            "Fortaleza", "Rio", "São Paulo", "Salvador", "Vitória",
            "Florianópolis", "Porto Alegre", "São Luiz","Teresina",
            "Belém", "Manaus"};


    public static final City [] cities2 = {
            new City("Recife", "Capital de Pernambuco"),
            new City("João Pessoa", "Capital da Paraíba"),
            new City("Natal", "Capital do Rio Grande do Norte"),
            new City("Fortaleza", "Capital do Ceará"),
            new City("Rio de Janeiro", "Capital do Rio de Janeiro"),
            new City("São Paulo","Capital de São Paulo"),
            new City("Salvador","Capital da Bahia"),
            new City("Vitória","Capital do Espirito Santo"),
            new City("Florianópolis","Capital de Santa Catarina"),
            new City("Porto Alegre","Capital do Rio Grande do Sul"),
            new City("São Luiz","Capital do Maranhão"),
            new City("Teresina","Capital do Piauí"),
            new City("Belém","Capital do Pará"),
            new City("Manaus","Capital do Amazonas")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      // setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cities));
       // setListAdapter(new ArrayAdapter<String>(this,R.layout.city_listitem,R.id.city_name, cities));
       setListAdapter(new CityArrayListAdapter(this,R.layout.city_listitem, cities2));
    }

    @Override
    public void onListItemClick(ListView parent, View v, int position, long id) {
        Toast.makeText(this, "Cidade selecionada: " + cities[position],
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
