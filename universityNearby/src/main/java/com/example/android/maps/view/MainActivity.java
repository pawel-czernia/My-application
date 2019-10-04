package com.example.android.maps.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.maps.presenter.MainActivityPresenter;
import com.example.android.maps.R;

public class MainActivity extends AppCompatActivity implements MainActivityPresenter.View {

    private MainActivityPresenter presenter;
    private Button myButton;
    private TextView tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this);

        tip = findViewById(R.id.tip);
        EditText cityName = findViewById(R.id.city_name);

        myButton = findViewById(R.id.search_button);
        myButton.setOnClickListener(v -> goToMap());

        cityName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presenter.updateButtonText(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                showButton();
                hideText();
            }
        });
    }

    @Override
    public void showButton() {
        myButton.setVisibility(View.VISIBLE);
    }

    @Override
    public void updateSearchButton(String button) {
        myButton.setText(button);
    }

    @Override
    public void hideText() {
        tip.setVisibility(View.INVISIBLE);
    }

    @Override
    public void goToMap() {
        Intent intent = new Intent(this, MapActivity.class);
        intent.putExtra("CITY_NAME", presenter.passCityName());
        startActivity(intent);
    }

}