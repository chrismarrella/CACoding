package use_case.clear_users;
import java.util.ArrayList;

public interface ClearOutputBoundary {
    void prepareSuccessView(ArrayList<String> users);

    void prepareFailView(String error);
}
