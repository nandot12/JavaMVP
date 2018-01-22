package id.co.imastudio.loginmvp.base;

/**
 * Created by nandoseptianhusni on 1/22/18.
 */

public interface BasePresenter <T extends MainView>{
    void onAttach (T view);
    void onDetach ();

}
