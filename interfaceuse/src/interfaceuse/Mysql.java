package interfaceuse;

public class Mysql implements Connection {
	public void commit()
	{
		System.out.println("Mysql commit");
	}
	public void rollback()
	{
		System.out.println("Mysql rollback");
	}
}


