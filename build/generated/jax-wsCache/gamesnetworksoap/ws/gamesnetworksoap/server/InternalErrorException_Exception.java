
package ws.gamesnetworksoap.server;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UnauthorizedException", targetNamespace = "http://Server.GamesNetworkSoap.ws/")
public class InternalErrorException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Object faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InternalErrorException_Exception(String message, Object faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InternalErrorException_Exception(String message, Object faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: java.lang.Object
     */
    public Object getFaultInfo() {
        return faultInfo;
    }

}
