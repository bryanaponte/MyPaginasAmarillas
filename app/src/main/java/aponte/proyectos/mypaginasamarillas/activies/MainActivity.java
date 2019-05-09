package aponte.proyectos.mypaginasamarillas.activies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import aponte.proyectos.mypaginasamarillas.R;
import aponte.proyectos.mypaginasamarillas.adapters.CompanyAdapter;
import aponte.proyectos.mypaginasamarillas.models.Company;
import aponte.proyectos.mypaginasamarillas.repositories.CompanyRepository;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.companylist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CompanyAdapter adapter = new CompanyAdapter(this);

        List<Company> companies = CompanyRepository.getCompanies();
        adapter.setContacts(companies);

        recyclerView.setAdapter(adapter);
    }
}
