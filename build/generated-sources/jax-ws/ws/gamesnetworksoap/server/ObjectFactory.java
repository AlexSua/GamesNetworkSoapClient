
package ws.gamesnetworksoap.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.gamesnetworksoap.server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateUser_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "CreateUser");
    private final static QName _DeleteUser_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "DeleteUser");
    private final static QName _IsAuthenticated_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "isAuthenticated");
    private final static QName _GetUsers_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "GetUsers");
    private final static QName _IsAuthenticatedResponse_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "isAuthenticatedResponse");
    private final static QName _Add_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "add");
    private final static QName _GetUsersResponse_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "GetUsersResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "LogoutResponse");
    private final static QName _AddResponse_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "addResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "UpdateUserResponse");
    private final static QName _CreateUserResponse_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "CreateUserResponse");
    private final static QName _UnauthorizedException_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "UnauthorizedException");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "DeleteUserResponse");
    private final static QName _UpdateUser_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "UpdateUser");
    private final static QName _GetUser_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "GetUser");
    private final static QName _ConnectionException_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "ConnectionException");
    private final static QName _GetUserResponse_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "GetUserResponse");
    private final static QName _Loggin_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "Loggin");
    private final static QName _LogginResponse_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "LogginResponse");
    private final static QName _Logout_QNAME = new QName("http://Server.GamesNetworkSoap.ws/", "Logout");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.gamesnetworksoap.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link IsAuthenticated }
     * 
     */
    public IsAuthenticated createIsAuthenticated() {
        return new IsAuthenticated();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link IsAuthenticatedResponse }
     * 
     */
    public IsAuthenticatedResponse createIsAuthenticatedResponse() {
        return new IsAuthenticatedResponse();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link Loggin }
     * 
     */
    public Loggin createLoggin() {
        return new Loggin();
    }

    /**
     * Create an instance of {@link LogginResponse }
     * 
     */
    public LogginResponse createLogginResponse() {
        return new LogginResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link ConnectionException }
     * 
     */
    public ConnectionException createConnectionException() {
        return new ConnectionException();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link Usermodel }
     * 
     */
    public Usermodel createUsermodel() {
        return new Usermodel();
    }

    /**
     * Create an instance of {@link InternalErrorException }
     * 
     */
    public InternalErrorException createInternalErrorException() {
        return new InternalErrorException();
    }

    /**
     * Create an instance of {@link UnauthorizedException }
     * 
     */
    public UnauthorizedException createUnauthorizedException() {
        return new UnauthorizedException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "CreateUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "DeleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAuthenticated }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "isAuthenticated")
    public JAXBElement<IsAuthenticated> createIsAuthenticated(IsAuthenticated value) {
        return new JAXBElement<IsAuthenticated>(_IsAuthenticated_QNAME, IsAuthenticated.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "GetUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<GetUsers>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAuthenticatedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "isAuthenticatedResponse")
    public JAXBElement<IsAuthenticatedResponse> createIsAuthenticatedResponse(IsAuthenticatedResponse value) {
        return new JAXBElement<IsAuthenticatedResponse>(_IsAuthenticatedResponse_QNAME, IsAuthenticatedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "GetUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "LogoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "UpdateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "CreateUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "UnauthorizedException")
    public JAXBElement<Object> createUnauthorizedException(Object value) {
        return new JAXBElement<Object>(_UnauthorizedException_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "DeleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "UpdateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "GetUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "ConnectionException")
    public JAXBElement<ConnectionException> createConnectionException(ConnectionException value) {
        return new JAXBElement<ConnectionException>(_ConnectionException_QNAME, ConnectionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "GetUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Loggin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "Loggin")
    public JAXBElement<Loggin> createLoggin(Loggin value) {
        return new JAXBElement<Loggin>(_Loggin_QNAME, Loggin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "LogginResponse")
    public JAXBElement<LogginResponse> createLogginResponse(LogginResponse value) {
        return new JAXBElement<LogginResponse>(_LogginResponse_QNAME, LogginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.GamesNetworkSoap.ws/", name = "Logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

}
