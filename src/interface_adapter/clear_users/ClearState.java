package interface_adapter.clear_users;

import java.util.ArrayList;
import java.util.List;

public class ClearState {
    private String clearError;
    private List<String> clearedUsers;

    public ClearState(ClearState copy) {
        this.clearError = copy.clearError;
        this.clearedUsers = new ArrayList<>(copy.clearedUsers);
    }

    public ClearState() {
        this.clearError = null;
        this.clearedUsers = new ArrayList<>();
    }

    public String getClearError() {
        return clearError;
    }

    public void setClearError(String clearError) {
        this.clearError = clearError;
    }

    public List<String> getClearedUsers() {
        return clearedUsers;
    }

    public void setClearedUsers(List<String> clearedUsers) {
        this.clearedUsers = clearedUsers;
    }

    @Override
    public String toString() {
        StringBuilder formatted = new StringBuilder();
        for (String user : clearedUsers) {
            formatted.append(user).append("\n");
        }
        return formatted.toString();
    }
}
