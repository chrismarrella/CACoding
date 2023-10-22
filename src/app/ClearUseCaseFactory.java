package app;

import interface_adapter.ViewManagerModel;
import interface_adapter.clear_users.ClearController;
import interface_adapter.clear_users.ClearPresenter;
import interface_adapter.clear_users.ClearViewModel;
import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInteractor;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearUserDataAccessInterface;

public class ClearUseCaseFactory {

    private ClearUseCaseFactory() {}

    public static ClearController createClearUseCase(ViewManagerModel viewManagerModel, ClearUserDataAccessInterface userDataAccessObject, ClearViewModel clearViewModel)
    {
        ClearOutputBoundary clearOutputBoundary = new ClearPresenter(clearViewModel, viewManagerModel);

        ClearInputBoundary clearInputBoundary = new ClearInteractor(clearOutputBoundary, userDataAccessObject);


        return new ClearController(clearInputBoundary);
    }
}
