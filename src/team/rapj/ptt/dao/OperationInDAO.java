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
     * load all training data
     *
     * @throws Exception
     * @return List<Training>
     */
    List<Training> loadAllTraining() throws Exception;

    /**
     * save all training data
     *
     * @throws Exception
     * @return int save flag
     */
    void saveAllTraining() throws Exception;
}
