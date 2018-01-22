package id.co.imastudio.loginmvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ViewLogin {

    @butterknife.BindView(R.id.usernameEDT)
    EditText usernameEDT;
    @butterknife.BindView(R.id.passEDT)
    EditText passEDT;
    @butterknife.BindView(R.id.loginBTN)
    Button loginBTN;

    LoginPresnter presnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butterknife.ButterKnife.bind(this);

        initPresenter();
            OnAttach();
    }


    private void initPresenter() {
        presnter = new LoginPresnter();

    }


    @butterknife.OnClick(R.id.loginBTN)
    public void onViewClicked() {
    presnter.login(usernameEDT,passEDT);
    }

    @Override
    public void OnAttach() {
        presnter.onAttach(this);
    }

    @Override
    public void onDetach() {

    }

    @Override
    public void succes() {
        Toast.makeText(this, "Suskses", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void error() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }
}
