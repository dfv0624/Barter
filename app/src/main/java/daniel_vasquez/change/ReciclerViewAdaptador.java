package daniel_vasquez.change;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by USER on 2/04/2018.
 */

public class ReciclerViewAdaptador extends RecyclerView.Adapter<ReciclerViewAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView Cambio;
        ImageView FotoCambio;

        public ViewHolder(View itemView) {
            super(itemView);
            Cambio=(TextView)itemView.findViewById(R.id.txt1);
            FotoCambio=(ImageView) itemView.findViewById(R.id.ImgCambio);
        }
    }
    public List<Anunciosmodelo> AnuncioLista;

    public ReciclerViewAdaptador(List<Anunciosmodelo> anuncioLista) {
        AnuncioLista = anuncioLista;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_anuncios,parent,false);
        ViewHolder ViewHolder=new ViewHolder(view);
        return ViewHolder;
    }
    private Context context;

    public ReciclerViewAdaptador(Context context) {
        this.context = context;
    }
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.Cambio.setText(AnuncioLista.get(position).getCambio());
        holder.FotoCambio.setImageResource(AnuncioLista.get(position).getImgCambio());

        holder.FotoCambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(),Anuncio.class);
                view.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return AnuncioLista.size();
    }
}
