package use_case.clear_users;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    private final ClearOutputBoundary clearPresenter;
    private final ClearUserDataAccessInterface userDataAccessObject;

    public ClearInteractor(ClearOutputBoundary clearPresenter, ClearUserDataAccessInterface userDataAccessObject) {
        this.clearPresenter = clearPresenter;
        this.userDataAccessObject = userDataAccessObject;
    }

    @Override
    public void execute() {
        ArrayList<String> clearedUsers = userDataAccessObject.clearUserData();
        clearPresenter.prepareSuccessView(clearedUsers);
    }
}
