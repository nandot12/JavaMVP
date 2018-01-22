package id.co.imastudio.javamvp;

import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by nandoseptianhusni on 1/22/18.
 */

public interface UserView {

    void Insert  (ArrayList<ModelUser> data);
    void error (String error);
}
