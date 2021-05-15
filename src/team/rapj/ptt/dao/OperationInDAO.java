package team.rapj.ptt.dao;

import team.rapj.ptt.training.Training;

import java.util.List;

/**
 * This interface specifies all operations of the DAO
 * (Data access object).
 *
 * @author Kuihong Chen
 */
public interface OperationInDAO {
    /**
     * load data
     *
     * @throws Exception
     * @return List<T>
     */
    <T> List<T> loadData(Class clazz) throws Exception;

    /**
     * save data
     *
     * @throws Exception
     * @return void
     */
    <T> void saveData(List<T> addModels) throws Exception;
}
