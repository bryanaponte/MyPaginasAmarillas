package aponte.proyectos.mypaginasamarillas.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import aponte.proyectos.mypaginasamarillas.R;

import aponte.proyectos.mypaginasamarillas.activies.DetailCompanyActivity;
import aponte.proyectos.mypaginasamarillas.models.Company;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.ViewHolder> {

    private static final String TAG = CompanyAdapter.class.getSimpleName();

    private AppCompatActivity activity;

    private List<Company> companies;

    public CompanyAdapter(AppCompatActivity activity){
        this.activity = activity;
        companies = new ArrayList<>();
    }

    public void setContacts(List<Company> companies){
        this.companies = companies;
    }

    @NonNull
    @Override   // Qué layout va a usar y mantenerlo precargado
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_company, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override   // Cómo se va a enlazar el dato en cada item layout (ViewHolder)
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        final Company company = this.companies.get(position);

        viewHolder.fullnameText.setText(company.getNombre());
        viewHolder.emailText.setText(company.getEmail());
        viewHolder.direccionText.setText(company.getDireccion());


        Context context = viewHolder.itemView.getContext();
        int resourceid = context.getResources().getIdentifier(
                company.getPicture(),
                "drawable",
                context.getPackageName()
        );
        viewHolder.pictureImage.setImageResource(resourceid);

        // Definiendo el evento onclick
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: " + company);

                Intent intent = new Intent(v.getContext(), DetailCompanyActivity.class);
                intent.putExtra("id", company.getId());
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return companies.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView pictureImage;
        TextView fullnameText;
        TextView emailText;
        TextView direccionText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pictureImage = itemView.findViewById(R.id.picture_image);
            fullnameText = itemView.findViewById(R.id.fullname_text);
            emailText = itemView.findViewById(R.id.email_text);
            direccionText = itemView.findViewById(R.id.direccion_text);
        }
    }

}
