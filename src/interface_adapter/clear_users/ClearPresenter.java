package interface_adapter.clear_users;

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;

import java.util.ArrayList;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ClearViewModel clearViewModel, ViewManagerModel viewManagerModel)
    {
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public void prepareSuccessView(ArrayList<String> users) {
        ClearState clearState = clearViewModel.getState();
        clearState.setClearedUsers(users);
        this.clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setClearError(error);
        clearViewModel.firePropertyChanged();
    }

}