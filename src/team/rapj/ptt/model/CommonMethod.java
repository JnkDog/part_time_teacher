package team.rapj.ptt.model;

/**
 * CommonMethod that every model needs implementation
 *
 * @author Kuihong Chen
 */
public interface CommonMethod {
    /**
     * CommonMethod that every model needs implementation
     *
     * @param userInput String
     * @return T
     * @author Kuihong Chen
     */
    public <T> T stringToModel(String userInput);
}
