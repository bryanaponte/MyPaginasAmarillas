package aponte.proyectos.mypaginasamarillas.activies;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import aponte.proyectos.mypaginasamarillas.R;
import aponte.proyectos.mypaginasamarillas.models.Company;
import aponte.proyectos.mypaginasamarillas.repositories.CompanyRepository;

public class DetailCompanyActivity extends AppCompatActivity {
    private Integer id;

    private ImageView pictureImage;
    private TextView fullnameText;
    private TextView emailText;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_company2);

        pictureImage = findViewById(R.id.picture_image);
        fullnameText = findViewById(R.id.fullname_text);
        emailText = findViewById(R.id.email_text);



        this.id = getIntent().getExtras().getInt("id");

        Company company = CompanyRepository.getCompanyByid(id);

        if(company != null) {
            int resourceid = getResources().getIdentifier(
                    company.getPicture(),
                    "drawable",
                    getPackageName()
            );
            pictureImage.setImageResource(resourceid);
            fullnameText.setText(company.getNombre());
            emailText.setText(company.getInfo());
        }
    }


}

