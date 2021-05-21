package team.rapj.ptt.model;

/**
 * CommonMethod that every model needs implementation
 *
 * @author Kuihong Chen
 */
public interface CommonMethod<T> {


    public T stringToModel(String[] userInputArray);
}
