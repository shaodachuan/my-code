package assemble;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * User
 *
 * @author red2222
 * @date 2023/12/19
 */
public class User {

    private String name;
    private List<String> hobbyList;
    private Map<String,String> residenceMap;
    private Set<String> aliasSet;
    private String[] array;

    public User(String name, List<String> hobbyList, Map<String, String> residenceMap, Set<String> aliasSet, String[] array) {
        this.name = name;
        this.hobbyList = hobbyList;
        this.residenceMap = residenceMap;
        this.aliasSet = aliasSet;
        this.array = array;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", hobbyList=" + hobbyList +
                ", residenceMap=" + residenceMap +
                ", aliasSet=" + aliasSet +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
