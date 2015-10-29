package za.co.rettakid.meds.presentation.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwazi Prusent on 2015/10/27.
 */
public class ListDivider<T> {
    
    public List<List<T>> divideList(List<T> fullList)   {
        List<List<T>> divList = new ArrayList<>();
        for (int section = 0 ; section < fullList.size() / 3 ; section++) {
            List<T> secList = new ArrayList<>();
            for (int item = 0 ; item < 3 ; item++)   {
                int index = (section * 3) + item;
                secList.add(fullList.get(index));
            }
            divList.add(secList);
        }
        return divList;
    }
    
}
