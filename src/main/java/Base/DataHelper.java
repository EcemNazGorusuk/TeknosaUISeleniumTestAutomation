package Base;

public class DataHelper {
    public String formatEnterItemToSearch(String enterItemToSearch) {
        if (enterItemToSearch == null || enterItemToSearch.isEmpty()) {
            return enterItemToSearch;
        }
        return enterItemToSearch.substring(0, 1).toUpperCase() + enterItemToSearch.substring(1).toLowerCase();
    }


}
