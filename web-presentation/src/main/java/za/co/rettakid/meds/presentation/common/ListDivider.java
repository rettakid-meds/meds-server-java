package za.co.rettakid.meds.presentation.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwazi Prusent on 2015/10/27.
 */
public class ListDivider<T> {
    
    public List<List<T>> divideList(List<T> fullList,Integer colLength)   {
        List<List<T>> divList = new ArrayList<>();
        for (int section = 0 ; section <= fullList.size() / colLength ; section++) {
            List<T> secList = new ArrayList<>();
            for (int item = 0 ; item < colLength ; item++)   {
                int index = (section * colLength) + item;
                if ((section * colLength) + item <= fullList.size() - 1)    {
                    secList.add(fullList.get(index));
                } else  {
                    break;
                }
            }
            divList.add(secList);
        }
        return divList;
    }
    
}
