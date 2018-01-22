package id.co.imastudio.loginmvp;

import android.widget.EditText;

import id.co.imastudio.loginmvp.base.BasePresenter;

/**
 * Created by nandoseptianhusni on 1/22/18.
 */

public class LoginPresnter implements BasePresenter<ViewLogin> {

    ViewLogin model;
    @Override
    public void onAttach(ViewLogin view) {

        model = view;

    }

    public void login(EditText email, EditText password){
        String em = email.getText().toString();
        String ps = password.getText().toString();

        if (em.isEmpty()|| ps.isEmpty()){
            model.error();
            if (em.equals("basri") && ps.equals("umar")){
                model.succes();
            }
            else {
                model.error();
            }
        }
    }

    @Override
    public void onDetach() {

        model=null;
    }

}
