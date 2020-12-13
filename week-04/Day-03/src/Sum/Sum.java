package Sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {

    public int sum(List<Integer> arrayList) {
        if (arrayList == null) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i);
        }
        return result;
    }
}
