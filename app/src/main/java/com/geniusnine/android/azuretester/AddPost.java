package com.geniusnine.android.azuretester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AddPost extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private DatabaseReference databaseReferencePost;

    private EditText editTextTitle;
    private EditText editTextPost;
    private Button buttonSubmitPost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);
        firebaseAuth = FirebaseAuth.getInstance();
        databaseReferencePost = FirebaseDatabase.getInstance().getReference().child(getString(R.string.app_id)).child("Posts");
        editTextPost = (EditText)findViewById(R.id.editTextPost);
        editTextTitle = (EditText)findViewById(R.id.editTextTitle);
        buttonSubmitPost = (Button)findViewById(R.id.buttonSubmitPost);
        buttonSubmitPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitPost();
            }
        });


    }

    private void submitPost(){


        final DatabaseReference newPost = databaseReferencePost.push();



        Post postNew = new Post();
        postNew.setFirebaseid(firebaseAuth.getCurrentUser().getUid());
        postNew.setTitle(editTextTitle.getText().toString());
        postNew.setPostcontent(editTextPost.getText().toString());


        try{
            newPost.setValue(postNew);

        }catch (Exception e){

        }


    }
}
