import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceRMIString extends Remote
{
	public String getData() throws RemoteException;
	//public Double multiplica(Integer valor) throws RemoteException;
}