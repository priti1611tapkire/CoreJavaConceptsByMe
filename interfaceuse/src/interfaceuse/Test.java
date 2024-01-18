package interfaceuse;

public class Test {
	public static void main(String[] args) {
		Oracle o=new Oracle();
		o.commit();
		o.rollback();
		
		Mysql n=new Mysql();
		n.commit();
		n.rollback();
		
		Connection ccn=new Mysql();
		ccn.commit();
		ccn.rollback();
		
		Connection ccnn=new Oracle();
		ccnn.commit();
		ccnn.rollback();
	}

}
