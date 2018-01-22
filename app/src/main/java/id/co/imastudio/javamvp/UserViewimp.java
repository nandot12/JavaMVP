package id.co.imastudio.javamvp;

import android.widget.EditText;

/**
 * Created by nandoseptianhusni on 1/22/18.
 */

public interface UserViewimp {

    void input(EditText name, EditText email);
    void error(String error);
}
