package com.example.adopet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adopet.model.Cat;
import com.example.adopet.model.Dog;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class act_cats extends AppCompatActivity {

    private List<Cat> catsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_cats);

        RecyclerView catsRecyclerView = findViewById(R.id.rv_cats);
        CatsAdapter catsAdapter = new CatsAdapter(catsList);
        catsRecyclerView.setAdapter(catsAdapter);
        catsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        fillCatsList();
    }

    private class CatHolder extends RecyclerView.ViewHolder{
        TextView catsAge;
        TextView catsName;
        TextView catsColor;
        TextView catsSex;
        ImageView catsPicture;

        public CatHolder(@NonNull View itemView){
            super(itemView);
            catsAge = itemView.findViewById(R.id.tv_pet_age);
            catsName = itemView.findViewById(R.id.tv_pet_name);
            catsColor = itemView.findViewById(R.id.tv_pet_color);
            catsSex = itemView.findViewById(R.id.tv_pet_sex);
            catsPicture = itemView.findViewById(R.id.img_pet);
        }
    }

    private class CatsAdapter extends RecyclerView.Adapter<CatHolder>{

        private List<Cat> catsList;

        public CatsAdapter(List<Cat> catsList) {
            this.catsList = catsList;
        }


        @NonNull
        @Override
        public CatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new CatHolder(getLayoutInflater().inflate(R.layout.cat_item, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull CatHolder holder, int position) {
            Cat cat = catsList.get(position);
            holder.catsAge.setText(cat.getAge() + " anos");
            holder.catsName.setText(cat.getName());
            holder.catsColor.setText(cat.getColor());
            holder.catsSex.setText(cat.getSex());
            if(cat.getPicture().equals("")) {
                holder.catsPicture.setImageResource(0);
            } else{
                try {
                    Picasso.get().load(cat.getPicture()).resize(140, 140).centerCrop().into(holder.catsPicture);
                } catch (Exception e) { }
            }
        }

        @Override
        public int getItemCount() {
            return catsList.size();
        }
    }

    private void fillCatsList() {
        Cat cat0 = new Cat("Robson", "Caramelo", "Macho", 4);
        cat0.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F596265264962096.jpg?alt=media&token=17b5d6d7-9a57-4fa2-9635-5c9c80886fa4");
        catsList.add(cat0);
        Cat cat1 = new Cat("Netuno", "Caramelo", "Macho", 0);
        cat1.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F600250382206621.jpg?alt=media&token=bc126d7e-e15d-48ae-9f1b-a1bce0992c73");
        catsList.add(cat1);
        Cat cat2 = new Cat("Cleópatra", "Cinza", "Fêmea", 3);
        cat2.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F643222742874804.jpg?alt=media&token=d831373c-704e-456d-af68-6b4624e78095");
        catsList.add(cat2);
        Cat cat3 = new Cat("Biscuit", "Branco", "Macho", 0);
        cat3.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F683268027206581.jpg?alt=media&token=b593ffa4-0314-445b-adab-d2a2d7867f88");
        catsList.add(cat3);
        Cat cat4 = new Cat("Fofô", "Cinza e branco", "Macho", 0);
        cat4.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F684263264550408.jpg?alt=media&token=4be8b8d7-130d-4c49-9d3a-0c9bf207e366");
        catsList.add(cat4);
        Cat cat5 = new Cat("Tic", "Preto e branco", "Macho", 0);
        cat5.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F702294505306849.jpg?alt=media&token=e95621fd-75bd-4b07-a0ce-2e3f69f80f64");
        catsList.add(cat5);
        Cat cat6 = new Cat("Tac", "Cinza", "Macho", 0);
        cat6.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F762218029827019.jpg?alt=media&token=5f3d7d08-db6e-4b5c-9a62-2e76928f6cab");
        catsList.add(cat6);
        Cat cat7 = new Cat("Kolina", "Preto e branco", "Fêmea", 0);
        cat7.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F778227508182253.jpg?alt=media&token=6e92a847-04be-4706-ae71-61c8c521066f");
        catsList.add(cat7);
        Cat cat8 = new Cat("Cleo", "Preto e branco", "Fêmea", 0);
        cat8.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F782269508009091.jpg?alt=media&token=3ea63dea-9f72-4e06-92d5-5b2ab4080d27");
        catsList.add(cat8);
        Cat cat9 = new Cat("Titi", "Caramelo", "Macho", 2);
        cat9.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F810293389809874.jpg?alt=media&token=dc0c9e8b-3c03-4088-9166-2e3833371850");
        catsList.add(cat9);
        Cat cat10 = new Cat("Bailarina", "Marrom e branco", "Fêmea", 1);
        cat10.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F817228028100570.jpg?alt=media&token=0f5582ae-ae1c-40c3-b288-78b29926e63e");
        catsList.add(cat10);
        Cat cat11 = new Cat("Plutão", "Cinza", "Macho", 0);
        cat11.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F822222748380123.jpg?alt=media&token=6f931aa7-381d-4d4e-b968-f288c0d76bf4");
        catsList.add(cat11);
        Cat cat12 = new Cat("Fófis", "Cinza e branco", "Fêmea", 0);
        cat12.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F824291502149877.jpg?alt=media&token=f40d4ea2-a981-4c2a-9530-63f5da1fb171");
        catsList.add(cat12);
        Cat cat13 = new Cat("Barriquelo", "Cinza", "Macho", 4);
        cat13.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F826264628755195.jpg?alt=media&token=960ec391-dd08-42ec-8d22-bb3cb5d75e37");
        catsList.add(cat13);
        Cat cat14 = new Cat("Velma", "Cinza e branco", "Fêmea", 0);
        cat14.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F827219146821615.jpg?alt=media&token=7d1a5efb-a0e2-4ba6-bc99-0a9f9e2a7593");
        catsList.add(cat14);
        Cat cat15 = new Cat("Rapadura", "Cinza e branco", "Macho", 2);
        cat15.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F831259141173998.jpg?alt=media&token=bee54550-d120-4643-8c33-c0d8a6710fe3");
        catsList.add(cat15);
        Cat cat16 = new Cat("Frederica", "Branco", "Fêmea", 0);
        cat16.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F859266631751876.jpg?alt=media&token=260bbfd3-7dda-4182-904f-37b46c077b49");
        catsList.add(cat16);
        Cat cat17 = new Cat("Fêfa", "Cinza e branco", "Fêmea", 1);
        cat17.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F861245279925382.jpg?alt=media&token=4db2d51d-c9e7-4f7c-8355-9fece10e7dbe");
        catsList.add(cat17);
        Cat cat18 = new Cat("Toph", "Cinza e branco", "Fêmea", 6);
        cat18.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/Gatos%2F872254879261328.jpg?alt=media&token=6b4862f8-f049-47c0-b7ca-871821249d9c");
        catsList.add(cat18);
    }
}




