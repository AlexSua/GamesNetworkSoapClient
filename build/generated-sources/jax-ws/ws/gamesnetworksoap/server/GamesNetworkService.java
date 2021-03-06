
package ws.gamesnetworksoap.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GamesNetworkService", targetNamespace = "http://Server.GamesNetworkSoap.ws/", wsdlLocation = "http://localhost:8080/gamesnetworksoap?wsdl")
public class GamesNetworkService
    extends Service
{

    private final static URL GAMESNETWORKSERVICE_WSDL_LOCATION;
    private final static WebServiceException GAMESNETWORKSERVICE_EXCEPTION;
    private final static QName GAMESNETWORKSERVICE_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "GamesNetworkService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/gamesnetworksoap?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GAMESNETWORKSERVICE_WSDL_LOCATION = url;
        GAMESNETWORKSERVICE_EXCEPTION = e;
    }

    public GamesNetworkService() {
        super(__getWsdlLocation(), GAMESNETWORKSERVICE_QNAME);
    }

    public GamesNetworkService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GAMESNETWORKSERVICE_QNAME, features);
    }

    public GamesNetworkService(URL wsdlLocation) {
        super(wsdlLocation, GAMESNETWORKSERVICE_QNAME);
    }

    public GamesNetworkService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GAMESNETWORKSERVICE_QNAME, features);
    }

    public GamesNetworkService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GamesNetworkService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IGamesNetwork
     */
    @WebEndpoint(name = "GamesNetworkPort")
    public IGamesNetwork getGamesNetworkPort() {
        return super.getPort(new QName("http://Server.GamesNetworkSoap.ws/", "GamesNetworkPort"), IGamesNetwork.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IGamesNetwork
     */
    @WebEndpoint(name = "GamesNetworkPort")
    public IGamesNetwork getGamesNetworkPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Server.GamesNetworkSoap.ws/", "GamesNetworkPort"), IGamesNetwork.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GAMESNETWORKSERVICE_EXCEPTION!= null) {
            throw GAMESNETWORKSERVICE_EXCEPTION;
        }
        return GAMESNETWORKSERVICE_WSDL_LOCATION;
    }

}
