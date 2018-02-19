/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;

import ws.gamesnetworksoap.server.ConnectionException_Exception;
import ws.gamesnetworksoap.server.InternalErrorException_Exception;
import ws.gamesnetworksoap.server.UnauthorizedException_Exception;
import ws.gamesnetworksoap.server.Usermodel;

/**
 * 
 * @author Alejandro Suárez
 */
public class ServiciosUsuarios {

    public static int createUser(ws.gamesnetworksoap.server.Usermodel arg0, java.lang.String arg1) throws ConnectionException_Exception, InternalErrorException_Exception, UnauthorizedException_Exception  {
        ws.gamesnetworksoap.server.GamesNetworkService service = new ws.gamesnetworksoap.server.GamesNetworkService();
        ws.gamesnetworksoap.server.IGamesNetwork port = service.getGamesNetworkPort();
        return port.createUser(arg0, arg1);
    }

    public static int deleteUser(ws.gamesnetworksoap.server.Usermodel arg0, java.lang.String arg1) throws ConnectionException_Exception, InternalErrorException_Exception, UnauthorizedException_Exception{
        ws.gamesnetworksoap.server.GamesNetworkService service = new ws.gamesnetworksoap.server.GamesNetworkService();
        ws.gamesnetworksoap.server.IGamesNetwork port = service.getGamesNetworkPort();
        return port.deleteUser(arg0, arg1);
    }

    public static Usermodel getUser(ws.gamesnetworksoap.server.Usermodel arg0, java.lang.String arg1) throws ConnectionException_Exception, InternalErrorException_Exception, UnauthorizedException_Exception {
        ws.gamesnetworksoap.server.GamesNetworkService service = new ws.gamesnetworksoap.server.GamesNetworkService();
        ws.gamesnetworksoap.server.IGamesNetwork port = service.getGamesNetworkPort();
        return port.getUser(arg0, arg1);
    }

    public static java.util.List<ws.gamesnetworksoap.server.Usermodel> getUsers(java.lang.String arg0) throws ConnectionException_Exception, InternalErrorException_Exception, UnauthorizedException_Exception {
        ws.gamesnetworksoap.server.GamesNetworkService service = new ws.gamesnetworksoap.server.GamesNetworkService();
        ws.gamesnetworksoap.server.IGamesNetwork port = service.getGamesNetworkPort();
        return port.getUsers(arg0);
    }

    public static String loggin(java.lang.String arg0, java.lang.String arg1) throws InternalErrorException_Exception, UnauthorizedException_Exception, ConnectionException_Exception {
        ws.gamesnetworksoap.server.GamesNetworkService service = new ws.gamesnetworksoap.server.GamesNetworkService();
        ws.gamesnetworksoap.server.IGamesNetwork port = service.getGamesNetworkPort();
        return port.loggin(arg0, arg1);
    }

    public static void logout(java.lang.String arg0) throws UnauthorizedException_Exception, InternalErrorException_Exception {
        ws.gamesnetworksoap.server.GamesNetworkService service = new ws.gamesnetworksoap.server.GamesNetworkService();
        ws.gamesnetworksoap.server.IGamesNetwork port = service.getGamesNetworkPort();
        port.logout(arg0);
    }

    public static int updateUser(ws.gamesnetworksoap.server.Usermodel arg0, java.lang.String arg1) throws ConnectionException_Exception, InternalErrorException_Exception, UnauthorizedException_Exception  {
        ws.gamesnetworksoap.server.GamesNetworkService service = new ws.gamesnetworksoap.server.GamesNetworkService();
        ws.gamesnetworksoap.server.IGamesNetwork port = service.getGamesNetworkPort();
        return port.updateUser(arg0, arg1);
    }

    public static double add(double arg0, double arg1) {
        ws.gamesnetworksoap.server.GamesNetworkService service = new ws.gamesnetworksoap.server.GamesNetworkService();
        ws.gamesnetworksoap.server.IGamesNetwork port = service.getGamesNetworkPort();
        return port.add(arg0, arg1);
    }

    public static boolean isAuthenticated(java.lang.String arg0) throws InternalErrorException_Exception, UnauthorizedException_Exception  {
        ws.gamesnetworksoap.server.GamesNetworkService service = new ws.gamesnetworksoap.server.GamesNetworkService();
        ws.gamesnetworksoap.server.IGamesNetwork port = service.getGamesNetworkPort();
        return port.isAuthenticated(arg0);
    }
}
