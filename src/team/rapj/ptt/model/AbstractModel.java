package team.rapj.ptt.model;

import team.rapj.ptt.dao.DataImpl;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractModel<T> {
    public <T> List<T> fetchData(Class clazz) throws Exception {
       List<T> fetchRes = new ArrayList<>();
       fetchRes = DataImpl.loadData(clazz.getClass());

       return fetchRes;
   }

    /**
     * Save the data to file
     *
     * @param userInputArray String[]
     * @return void
     * @exception Exception
     * @author Kuihong Chen
     */
   public abstract void saveData(String[] userInputArray) throws Exception;

    /**
     * Converting String to model
     *
     * @param userInputArray String[]
     * @return T
     * @author Kuihong Chen
     */
   public abstract T stringToModel(String[] userInputArray);
}
