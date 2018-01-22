package id.co.imastudio.javamvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements UserView  {

    UserPresenter presenter;
    @BindView(R.id.username)
    EditText username;
    @BindView(R.id.email)
    EditText email;
    @BindView(R.id.submit)
    Button submit;
    @BindView(R.id.lv)
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
            presenter = new UserPresenter(this);
    }


    @OnClick(R.id.submit)
    public void onViewClicked() {

        presenter.input(username,email);
           }

    @Override
    public void Insert(ArrayList<ModelUser> data) {

        Toast.makeText(this, " data "+String.valueOf(data.size()), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void error(String error) {

    }
}
