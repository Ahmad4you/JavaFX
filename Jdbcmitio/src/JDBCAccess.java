

public interface JDBCAccess {
	public boolean doInsert(String x) throws Exception;
	public boolean doCreate(String x) throws Exception;
	public boolean doAlter(String x) throws Exception;
	public boolean doUpdate(String x) throws Exception;
	public boolean doDelete(String x) throws Exception;

}
