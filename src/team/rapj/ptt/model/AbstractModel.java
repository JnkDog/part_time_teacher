package team.rapj.ptt.model;

import team.rapj.ptt.dao.DataImpl;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractModel {

   public <T> List<T> fetchData(Class clazz) throws Exception {
       List<T> fetchRes = new ArrayList<>();
       fetchRes = DataImpl.loadData(clazz.getClass());

       return fetchRes;
   }

   public abstract <T> T stringToModel(String userInput);
}
