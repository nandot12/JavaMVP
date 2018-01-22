package id.co.imastudio.javamvp;

import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by nandoseptianhusni on 1/22/18.
 */

public class UserPresenter implements UserViewimp {

    UserView view;
    ArrayList<ModelUser> data;

    public UserPresenter(UserView view) {
        this.view = view;

    }


    @Override
    public void input(EditText name, EditText email) {
        String input1 = name.getText().toString();
        String input2 = email.getText().toString();

        if (input1.isEmpty() || input2.isEmpty()){
            view.error("TIDAK BISA KOSONG");

        } else {
            ModelUser user= new ModelUser();
            user.setUsername(input1);
            user.setEmail(input2);
            data.add(user);

            view.Insert(data);

        }

    }

    @Override
    public void error(String error) {

    }
}
