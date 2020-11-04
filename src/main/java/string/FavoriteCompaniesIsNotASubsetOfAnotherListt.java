package string;

import java.util.*;

/**
 * 1452. People Whose List of Favorite Companies Is Not a Subset of Another List
 */
public class FavoriteCompaniesIsNotASubsetOfAnotherListt {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <favoriteCompanies.size() ; i++) {
            for (int j = 0; j < favoriteCompanies.size(); j++) {
                if(i == j) continue;
                for (String f : favoriteCompanies.get(i)){
                    if (favoriteCompanies.get(j).contains(favoriteCompanies.get(i))){
                        break;
                    }
                    if(j == favoriteCompanies.get(j).size()){
                        result.add(i);
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
