package com.example.adopet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adopet.model.Dog;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.picasso.transformations.CropCircleTransformation;
import jp.wasabeef.picasso.transformations.CropTransformation;

public class act_dogs extends AppCompatActivity {

    private List<Dog> dogsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_dogs);

        RecyclerView dogsRecyclerView = findViewById(R.id.rv_dogs);
        DogsAdapter dogsAdapter = new DogsAdapter(dogsList);
        dogsRecyclerView.setAdapter(dogsAdapter);
        dogsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        fillDogsList();

        //dogsRecyclerView.setHasFixedSize(true);
    }

    private class DogHolder extends RecyclerView.ViewHolder{
        TextView dogsAge;
        TextView dogsName;
        TextView dogsSex;
        TextView dogsSizeGroup;
        ImageView dogsPicture;

        public DogHolder(@NonNull View itemView) {
            super(itemView);
            dogsAge = itemView.findViewById(R.id.tv_pet_age);
            dogsSex = itemView.findViewById(R.id.tv_pet_sex);
            dogsSizeGroup = itemView.findViewById(R.id.tv_pet_sizeGroup);
            dogsName = itemView.findViewById(R.id.tv_pet_name);
            dogsPicture = itemView.findViewById(R.id.img_pet);
        }
    }

    private class DogsAdapter extends RecyclerView.Adapter<DogHolder>{

        private final List<Dog> dogsList;

        private DogsAdapter(List<Dog> dogsList){
            this.dogsList = dogsList;
        }

        @NonNull
        @Override
        public DogHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new DogHolder(getLayoutInflater().inflate(R.layout.dog_item, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull DogHolder holder, int position) {
            Dog dog = dogsList.get(position);
            holder.dogsAge.setText(dog.getAge() + " anos");
            holder.dogsName.setText(dog.getName());
            holder.dogsSex.setText(dog.getSex());
            holder.dogsSizeGroup.setText(dog.getSizeGroup());
            if(dog.getPicture().equals("")) {
                holder.dogsPicture.setImageResource(0);
            } else{
                try {
                    Picasso.get().load(dog.getPicture()).resize(140, 140).centerCrop().into(holder.dogsPicture);
                } catch (Exception e) { }
            }

        }

        @Override
        public int getItemCount() {
            return dogsList.size();
        }
    }


    private void fillDogsList() {
        Dog dog0 = new Dog("Baki", "Marrom", "Grande", 4, "Macho");
        dog0.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/85d0eddd-632d-4132-b58a-ec186f100359.jfif?alt=media&token=1c06e531-444b-4408-9b4b-c92e27dfe2f4");
        dogsList.add(dog0);
        Dog dog1 = new Dog("Bob", "Preto", "Pequeno", 4, "Macho");
        dog1.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/520274502447569.jpg?alt=media&token=031e68eb-acfc-446b-895f-cad3aae5f69f");
        dogsList.add(dog1);
        Dog dog2 = new Dog("Pipoca", "Caramelo", "Pequeno", 0, "Fêmea");
        dog2.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/671254023284188.jpg?alt=media&token=56b94479-d079-499c-b623-2185421b8bbb");
        dogsList.add(dog2);
        Dog dog3 = new Dog("Biscoito", "Caramelo e branco", "Médio", 1, "Macho");
        dog3.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/786279386895385.jpg?alt=media&token=6d2d0032-f8c2-4bb7-be60-c6a01f2fbe20");
        dogsList.add(dog3);
        Dog dog4 = new Dog("Peludo", "Preto e branco", "Médio", 0, "Macho");
        dog4.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/814252509551014.jpg?alt=media&token=a963ffeb-9f57-4a1d-844a-18cebfc8d261");
        dogsList.add(dog4);
        Dog dog5 = new Dog("Tico", "Preto e caramelo", "Médio", 0, "Macho");
        dog5.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/837201637201060.jpg?alt=media&token=7fa579a9-6e4b-4dd7-b1a0-faee98f6ed07");
        dogsList.add(dog5);
        Dog dog6 = new Dog("Teco", "Marrom escuro", "Grande", 4, "Macho");
        dog6.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/841235879976608.jpg?alt=media&token=af1e3979-f237-4fe6-8311-65f28b71526a");
        dogsList.add(dog6);
        Dog dog7 = new Dog("Java", "Branco e caramelo", "Pequeno", 0, "Macho");
        dog7.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/847219279322016.jpg?alt=media&token=f075eab9-f476-411c-97f8-7acf5848921d");
        dogsList.add(dog7);
        Dog dog8 = new Dog("Joãozin", "Preto e marrom", "Médio", 6, "Macho");
        dog8.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/850244639977254.jpg?alt=media&token=73b69299-5a43-4359-9a04-e4066712b07d");
        dogsList.add(dog8);
        Dog dog9 = new Dog("Tião", "Preto e caramelo", "Pequeno", 1, "Macho");
        dog9.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/823224261814491.jpg?alt=media&token=81b58a80-7139-4969-a7e4-bd06bc558f79");
        dogsList.add(dog9);
        Dog dog10 = new Dog("Bela", "Caramelo", "Pequeno", 0, "Fêmea");
        dog10.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/868213272859364.jpg?alt=media&token=5465813e-e7d4-4f91-a833-e40ebe395d2d");
        dogsList.add(dog10);
        Dog dog11 = new Dog("Pluto", "Cinza e branco", "Pequeno", 2, "Macho");
        dog11.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/796293744647315.jpg?alt=media&token=71cdaec6-1b9d-4e93-b014-766f1c0f86d1");
        dogsList.add(dog11);
        Dog dog12 = new Dog("Formiga", "Caramelo e branco", "Médio", 2, "Fêmea");
        dog12.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/867293151397709.jpg?alt=media&token=501822eb-2b0e-4602-9381-9a72b704db53");
        dogsList.add(dog12);
        Dog dog13 = new Dog("Robinho", "Preto", "Pequeno", 3, "Macho");
        dog13.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/780288268272428.jpg?alt=media&token=e2a60415-3f5d-49f5-9ef2-7439f712d0ed");
        dogsList.add(dog13);
        Dog dog14 = new Dog("Penelope", "Caramelo", "Pequeno", 0, "Fêmea");
        dog14.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/759207506348889.jpg?alt=media&token=22c8ab2d-284c-44df-bee1-1014855f493b");
        dogsList.add(dog14);
        Dog dog15 = new Dog("Cocada", "Caramelo", "Pequeno", 2, "Fêmea");
        dog15.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/758228389518534.jpg?alt=media&token=d13ca045-8e6a-4a7e-9483-dfb15b7b4200");
        dogsList.add(dog15);
        Dog dog16 = new Dog("Dafine", "Caramelo", "Pequeno", 0, "Fêmea");
        dog16.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/750272867019021.jpg?alt=media&token=f4e68ff9-fdc2-4d67-a33b-6de21035f3aa");
        dogsList.add(dog16);
        Dog dog17 = new Dog("Fifi", "Caramelo e preto", "Pequeno", 1, "Fêmea");
        dog17.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/740264740787531.jpg?alt=media&token=b63e352e-8467-41ea-b162-1ba6905fe0bc");
        dogsList.add(dog17);
        Dog dog18 = new Dog("Katara", "Marrom e branco", "Grande", 6, "Fêmea");
        dog18.setPicture("https://firebasestorage.googleapis.com/v0/b/adopet-c16b6.appspot.com/o/862205631429063.jpg?alt=media&token=42c886a9-73ff-4c27-884f-06479fac1d77");
        dogsList.add(dog18);






    }



}
//    private void EventChangeListener() {
//
//        db.collection("DogsForAdoption")
//                .addSnapshotListener(new EventListener<QuerySnapshot>() {
//                    @Override
//                    public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
//                        if(error != null){
//                            Log.e("Firestore error", error.getMessage());
//                            return;
//                        }
//                        for(DocumentChange dc : value.getDocumentChanges()){
//                            if(dc.getType() == DocumentChange.Type.ADDED){
//                                dogsList.add(dc.getDocument().toObject(Dog.class));
//                            }
//                            dogsAdapter.notifyDataSetChanged();
//                        }
//                    }
//                });
//    }
