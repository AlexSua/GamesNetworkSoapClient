
package ws.gamesnetworksoap.server;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ConnectionException", targetNamespace = "http://Server.GamesNetworkSoap.ws/")
public class ConnectionException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ConnectionException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ConnectionException_Exception(String message, ConnectionException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ConnectionException_Exception(String message, ConnectionException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ws.gamesnetworksoap.server.ConnectionException
     */
    public ConnectionException getFaultInfo() {
        return faultInfo;
    }

}
